package com.hanjie.util;



import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class DbUtil {
    private static Properties properties;
    private static DruidDataSource druidDataSource;

    /*
        //非Druid配置
        static {
            properties = new Properties();
            try {
                properties.load(DbUtil.class.getClassLoader().getResourceAsStream("db.properties"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static Connection getConn() throws ClassNotFoundException, SQLException, IOException {
            // 1, 加载驱动
            Class.forName(getVal("Drivername"));
            // 2,获取连接 jdbc是大协议 mysql是子协议 127.0.0.1是服务器地址 3306是端口号 端口号是为了区分服务器上具体的服务的，程序的端口号是不会冲突的;demo是数据库名称
            Connection connection = DriverManager.getConnection(getVal("url"), getVal("user"), getVal("password"));
            return connection;
        }
    */

    //Druid数据源配置
    static {
        properties = new Properties();
        druidDataSource = new DruidDataSource();
        try {
            properties.load(DbUtil.class.getClassLoader().getResourceAsStream("db.properties"));
            druidDataSource.setConnectProperties(properties);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Connection getConn() throws ClassNotFoundException, SQLException, IOException {
        DruidPooledConnection connection = druidDataSource.getConnection();
        return connection;
    }

    //关闭连接池
    public static void closePool(){
        druidDataSource.close();
    }

    /**
     *删除 修改 添加方法
     */
    public static int executeUpdate(String sql, Object... args) throws SQLException, IOException, ClassNotFoundException {
        //1，获取连接
        Connection conn = getConn();
        // 预编译  java .class mysql  sql
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        // 给占位符赋值
        if (args != null & args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i + 1, args[i]);
            }
        }
        // i是被修改的记录行数
        int i = preparedStatement.executeUpdate();
        closeConn(conn);
        return i;
    }


    /**
     * 返回最新 新增的主键
     *
     * @param sql
     * @param args
     * @return
     * @throws SQLException
     * @throws IOException
     * @throws ClassNotFoundException
     */

    public static int getGeneKey(String sql, Object... args) throws SQLException, IOException, ClassNotFoundException {
        //1，获取连接
        Connection conn = getConn();
        // 预编译  java .class mysql  sql
        PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        // 给占位符赋值
        if (args != null & args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i + 1, args[i]);
            }
        }
        // i是被修改的记录行数
        preparedStatement.executeUpdate();
        //
        ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
        if (generatedKeys != null) {
            while (generatedKeys.next()) {
                return generatedKeys.getInt(1);
            }
        }
        closeConn(conn);
        return 0;
    }

    /**
     *查询方法
     */
    public static <T> List<T> executeQuery(Class<T> tClass, String sql, Object... args) throws SQLException, IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 1,获取连接
        Connection conn = getConn();
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        List<T> list = new ArrayList<>();
        // 给占位符赋值
        if (args != null & args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i + 1, args[i]);
            }
        }
        // resultSet 这是一个结果集
        ResultSet resultSet = preparedStatement.executeQuery();
        // resultSet中有几个字段
        int columnCount = resultSet.getMetaData().getColumnCount();

        if (resultSet != null) {
            while (resultSet.next()) {
                //实例化对象
                T t = tClass.newInstance();
                for (int i = 1; i <= columnCount; i++) {
                    //获取列名
                    String labelName = resultSet.getMetaData().getColumnLabel(i);
                    // set方法名拼接
                    String methodName = "set" + labelName.substring(0, 1).toUpperCase() + labelName.substring(1);
                    // 通过反射获取set方法对象 类名.class 对象.getClass() Class.forName("类的全路径")
                    Method declaredMethod = tClass.getDeclaredMethod(methodName, Class.forName(resultSet.getMetaData().getColumnClassName(i)));
                    // 得到值之后，通过反射调用
                    declaredMethod.invoke(t, resultSet.getObject(i));
                }
                list.add(t);
            }
        }
        closeConn(conn);
        return list;
    }


    /**
     * 获得分页的总数
     */
    public static long getTotal(String sql,Object... args) throws SQLException, IOException, ClassNotFoundException {
        Connection conn = getConn();
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        // 给占位符赋值
        if (args != null & args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i + 1, args[i]);
            }
        }
        // resultSet 这是一个结果集
        ResultSet resultSet = preparedStatement.executeQuery();
        long total=0L;
        while (resultSet.next()){
            total=resultSet.getLong(1);
        }
        closeConn(conn);
        return total;
    }

    /**
     * 获取指定key对应的value值
     *
     * @param key
     * @return
     * @throws IOException
     */
    public static String getVal(String key) throws IOException {
        if (properties.containsKey(key)) {
            return properties.getProperty(key);
        } else {
            throw new IOException("找不到对应的key");
        }
    }

    /**
     * 关闭连接资源
     *
     * @param connection
     * @throws SQLException
     */
    public static void closeConn(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }


}
