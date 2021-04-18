/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : recruitment

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 18/04/2021 22:42:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for affiche
-- ----------------------------
DROP TABLE IF EXISTS `affiche`;
CREATE TABLE `affiche`  (
  `afficheid` int(11) NOT NULL AUTO_INCREMENT COMMENT '公告新闻表id',
  `affichetitle` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '公告新闻标题',
  `createtime` datetime(0) NULL DEFAULT NULL COMMENT '公告新闻发布时间',
  PRIMARY KEY (`afficheid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of affiche
-- ----------------------------
INSERT INTO `affiche` VALUES (1, '特大新闻！特大新闻！阿里呱呱正式招聘开始了', '2021-02-27 17:27:28');
INSERT INTO `affiche` VALUES (2, '特大新闻！特大新闻！华为呱呱正式招聘开始了', '2021-02-27 17:26:43');
INSERT INTO `affiche` VALUES (3, '特大新闻！特大新闻！阿里呱呱正式招聘开始了', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (4, '用微笑宣泄悲伤，用沉默装点痛苦，哪怕是假装，也要假装成快乐的那一个，人生的路你不坚强，没人替你勇敢！！！！', '2021-03-02 22:34:46');
INSERT INTO `affiche` VALUES (5, '用微笑宣泄悲伤，用沉默装点痛苦，哪怕是假装，也要假装成快乐的那一个，人生的路你不坚强，没人替你勇敢！', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (6, '用微笑宣泄悲伤，用沉默装点痛苦，哪怕是假装，也要假装成快乐的那一个，人生的路你不坚强，没人替你勇敢！', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (7, '你再优秀也会有人对你不屑一顾，你再不堪也会有人把你视若生命。所以，牛逼时不要得瑟，落魄时不要堕落。', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (8, '你再优秀也会有人对你不屑一顾，你再不堪也会有人把你视若生命。所以，牛逼时不要得瑟，落魄时不要堕落。', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (9, '别总是抱怨生活不够幸运，是你欠了生活一份努力，每一个你讨厌的现在，都有一个不够努力的曾经，未来美不美，取决于', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (10, '别总是抱怨生活不够幸运，是你欠了生活一份努力，每一个你讨厌的现在，都有一个不够努力的曾经，未来美不美，取决于', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (11, '不论做什么事，都要相信你自己，别让别人的一句话将你击倒。人生没有对。', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (12, '舞台再大，你不表演，你永远都是观众！人一定要靠自己，因为没有等来的辉煌，只有拼来的精彩', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (13, '舞台再大，你不表演，你永远都是观众！人一定要靠自己，因为没有等来的辉煌，只有拼来的精彩', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (14, '舞台再大，你不表演，你永远都是观众！人一定要靠自己，因为没有等来的辉煌，只有拼来的精彩', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (15, '永远都不为自己选择的道路而后悔，不管是十年前，还是现在。因为唯一能做的，只有义无反顾地坚持下去。', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (16, '新的一天开始，要继续勇敢追梦、为爱付出、拒绝懒惰、不轻言放弃，愿时光不负努力，青春不负自己', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (17, '新的一天开始，要继续勇敢追梦、为爱付出、拒绝懒惰、不轻言放弃，愿时光不负努力，青春不负自己义无反顾地坚持下去。', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (18, '与其安慰自己平凡可贵，不如拼尽全力活得漂亮。今天不逼自己学会“72变”，日后谁能代你承受“81难了', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (19, '世上唯一不能复制的是时间，唯一不能重演的是人生。该怎么走，过什么样的生活，全凭自己的选择和', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (20, '如果太胖就积极运动，皮肤不好就改善饮食，五官改变不了就改变气质，不懂穿衣就去学，永远不要让自己停止美好。', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (21, '最好的时光，在路上；最好的生活，在别处。独自上路去看看这个世界，你终将与最好的自', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (22, '生活给你压力，你就还它奇迹；人生给你考验，你就还它经验。没有什么能难倒自己，只要你愿意坚持，愿意付出，成功就会眷顾', '2021-03-01 20:01:03');
INSERT INTO `affiche` VALUES (23, '即使没有人注意，也要努力去成长，很多眼睛，都藏在你看不见的地方。其实一直陪着你的，是那个了不起的', '2021-03-01 20:01:03');

-- ----------------------------
-- Table structure for enterprise
-- ----------------------------
DROP TABLE IF EXISTS `enterprise`;
CREATE TABLE `enterprise`  (
  `enterpriseid` int(11) NOT NULL AUTO_INCREMENT COMMENT '企业信息id',
  `enterpriselogname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业用户账号',
  `enterpriselogpass` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业用户密码',
  `enterprisename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业名称',
  `enterprisesite` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业地址',
  `enterpriseinte` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业介绍',
  `enterprisephone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业联系方式',
  PRIMARY KEY (`enterpriseid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of enterprise
-- ----------------------------
INSERT INTO `enterprise` VALUES (1, 'asdqwe', '1234', '赛诺有限公司', '杭州市西湖区龙井路1号', '制作电子科技系列1', '0379-6666661');
INSERT INTO `enterprise` VALUES (2, 'asdqwe2', '123', '建和有限公司', '北京市朝阳区建明路1号', '主要经营电子商务科技', '0379-888888');
INSERT INTO `enterprise` VALUES (3, 'asdqwe3', '123456', '九鼎有限公司', '宁波市电商科技园', '主要电子商务系列', '0379-222222');
INSERT INTO `enterprise` VALUES (4, 'asdqwe4', '123456', '娇士有限公司', '郑州市市金水区龙井路1号', '文化、文化传播、文化发展、影视文化等；', '0379-888888');
INSERT INTO `enterprise` VALUES (5, 'asdqwe5', '123', '林鑫有限公司', '郑州市市金水区金水路1号', '动画片、专题片、电视综艺；；', '0379-888888');
INSERT INTO `enterprise` VALUES (6, 'asdqwe6', '123', '复宝有限公司', '郑州市市金水区第逛街18号', '文化、文化传播、文化发展、影视文化等；', '0379-888888');
INSERT INTO `enterprise` VALUES (7, 'asdqwe7', '123', '宇英有限公司', '湖南省市西湖区白庙路23号', '动画片、专题片、电视综艺；', '0379-888888');
INSERT INTO `enterprise` VALUES (8, 'asdqwe8', '123', '典鼎有限公司', '广州市市龙湖区路1号', '设计、制作、代理、发布广告', '0379-888888');
INSERT INTO `enterprise` VALUES (9, 'asdqwe9', '123', '英磊有限公司', '洛阳市天界路23号', '组织文化艺术交流活动（不含演出）；', '0379-888888');
INSERT INTO `enterprise` VALUES (10, 'asdqwe10', '123', '森成有限公司', '郑州中原区863软件园1号楼', '组织文化艺术交流活动（不含演出）', '0379-888888');
INSERT INTO `enterprise` VALUES (11, 'asdqwe11', '123', '金尔有限公司', '郑州市郑大科技园办公室1802', '电脑图文设计；广告信息咨询。', '0379-888888');
INSERT INTO `enterprise` VALUES (12, 'asdqwe12', '123', '达展有限公司', '河北省京广路88号', '技术开发、技术推广、技术转让、', '0379-888888');
INSERT INTO `enterprise` VALUES (13, 'asdqwe13', '123', '冠真有限公司', '广西省六冠街36号', '技术咨询、技术服务', '0379-888888');
INSERT INTO `enterprise` VALUES (14, 'asdqwe14', '123', '运威有限公司', '北京市朝阳区368号', '销售自行开发产品；计算机系统服务；', '0379-888888');
INSERT INTO `enterprise` VALUES (15, 'asdqwe15', '123', '贸事有限公司', '北京市故宫22号', '销售自行开发产品；计算机系统服务；', '0379-888888');
INSERT INTO `enterprise` VALUES (16, 'asdqwe16', '123', '聚真有限公司', '湖北省武汉市阿什顿82号', '销售自行开发产品；计算机系统服务；', '0379-888888');
INSERT INTO `enterprise` VALUES (17, 'asdqwe17', '123', '聚真有限公司', '湖南省长沙市长沙街33号', '经济贸易咨询；文化咨询。', '0379-888888');
INSERT INTO `enterprise` VALUES (18, 'asdqwe18', '123', '语宇有限公司', '河北省天上人间33号', '文艺创作；承办展览展示活动；会议服务；影视策划；翻译服务。', '0379-888888');
INSERT INTO `enterprise` VALUES (19, 'asdqwe14', '123', '运威有限公司', '北京市朝阳区368号', '销售自行开发产品；计算机系统服务；', '0379-888888');
INSERT INTO `enterprise` VALUES (21, 'asdqwe16', '123', '聚真有限公司', '湖北省武汉市阿什顿82号', '销售自行开发产品；计算机系统服务；', '0379-888888');
INSERT INTO `enterprise` VALUES (22, 'asdqwe17', '123', '聚真有限公司', '湖南省长沙市长沙街33号', '经济贸易咨询；文化咨询。', '0379-888888');
INSERT INTO `enterprise` VALUES (23, 'asdqwe18', '123', '语宇有限公司', '河北省天上人间33号', '文艺创作；承办展览展示活动；会议服务；影视策划；翻译服务。', '0379-888888');
INSERT INTO `enterprise` VALUES (25, 'asdqwe15', '123', '贸事有限公司', '北京市故宫22号', '销售自行开发产品；计算机系统服务；', '0379-888888');
INSERT INTO `enterprise` VALUES (26, 'asdqwe11', '123', '阿里巴巴', '黄州墨鱼街', '科技创业公司', '0379-123456');
INSERT INTO `enterprise` VALUES (27, 'tom', '123', '百度有限公司', '北京大同街1', '科技公司', '18637959619');

-- ----------------------------
-- Table structure for job
-- ----------------------------
DROP TABLE IF EXISTS `job`;
CREATE TABLE `job`  (
  `jobid` int(11) NOT NULL AUTO_INCREMENT COMMENT '职位表id',
  `enterpriseid` int(11) NOT NULL COMMENT '企业id',
  `jobtitle` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职位标题',
  `jobname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职位名称',
  `jobinfo` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职位介绍',
  `jobissue` int(11) NULL DEFAULT 0 COMMENT '职位发布状态',
  `jobstate` int(11) NULL DEFAULT 0 COMMENT '职位招聘状态',
  `createtime` datetime(0) NULL DEFAULT NULL COMMENT '职位发布时间',
  PRIMARY KEY (`jobid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of job
-- ----------------------------
INSERT INTO `job` VALUES (1, 1, '招收普通文员', '文员', '整理资料', 0, 0, '2021-02-17 14:27:54');
INSERT INTO `job` VALUES (2, 1, '招收会计', '会计', '整理财务', 0, 0, '2021-02-27 14:28:23');
INSERT INTO `job` VALUES (3, 2, '招收讲师', '讲师', '授课', 0, 0, '2021-02-27 14:29:04');
INSERT INTO `job` VALUES (4, 2, '招收讲师助教', '助教', '整理授课资料', 0, 0, '2021-02-27 14:29:33');
INSERT INTO `job` VALUES (5, 3, '招收程序员', '程序员', '编写代码', 0, 0, '2021-02-27 14:29:52');
INSERT INTO `job` VALUES (6, 3, '招收文档编辑', '文档编辑', '编辑资料', 0, 0, '2021-02-27 14:30:17');
INSERT INTO `job` VALUES (7, 3, '招收新媒体编辑', '新媒体编辑', '新媒体编辑', 0, 0, '2021-02-27 14:30:17');
INSERT INTO `job` VALUES (8, 3, '招收视频剪辑', '视频剪辑', '视频剪辑', 0, 0, '2021-02-27 17:29:54');
INSERT INTO `job` VALUES (9, 4, '招收办公室文员', '编辑文案', '文案编辑', 0, 0, '2021-03-01 20:02:03');
INSERT INTO `job` VALUES (10, 4, '招收酒店资料员', '酒店资料员', '酒店查询员', 0, 0, '2021-03-01 20:02:07');
INSERT INTO `job` VALUES (11, 5, '招收旅游导航员', '导航员', '导航员', 0, 0, '2021-03-17 20:03:22');
INSERT INTO `job` VALUES (12, 5, '招收清洁员', '清洁员', '清洁员', 0, 0, '2021-03-01 20:03:50');
INSERT INTO `job` VALUES (13, 1, '招收普通文员', '文员', '整理资料', 0, 0, '2021-03-03 22:39:10');
INSERT INTO `job` VALUES (14, 4, '123', '123', '123', 0, 0, '2021-03-04 14:58:04');
INSERT INTO `job` VALUES (15, 4, '123', '456', '456', 0, 0, '2021-03-04 15:43:43');
INSERT INTO `job` VALUES (16, 1, '123', '123', '123', 0, 0, '2021-03-04 15:44:09');
INSERT INTO `job` VALUES (17, 1, '123', '123', '123', 0, 0, '2021-03-04 15:44:20');
INSERT INTO `job` VALUES (19, 1, '456444', '456123123', '4561', 0, 0, '2021-03-04 15:47:03');
INSERT INTO `job` VALUES (20, 27, '招人招管理', '裁缝10人', '做衣服10人', 0, 0, '2021-03-05 16:44:40');
INSERT INTO `job` VALUES (21, 1, 'aq', 'aq', 'aq', 0, 0, '2021-04-13 12:26:43');
INSERT INTO `job` VALUES (22, 1, '招聘打扫人员', '保洁', '保修995，包吃住', 0, 0, '2021-04-14 21:10:47');

-- ----------------------------
-- Table structure for jobprivate
-- ----------------------------
DROP TABLE IF EXISTS `jobprivate`;
CREATE TABLE `jobprivate`  (
  `jobprivateid` int(11) NOT NULL AUTO_INCREMENT COMMENT '职位存储id',
  `userid` int(11) NOT NULL COMMENT '个人用户id',
  `jobid` int(11) NOT NULL COMMENT '职位id',
  `resumeprivatestate` int(11) NULL DEFAULT 0 COMMENT '职位存储状态',
  `createtime` datetime(0) NULL DEFAULT NULL COMMENT '存储时间',
  PRIMARY KEY (`jobprivateid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of jobprivate
-- ----------------------------
INSERT INTO `jobprivate` VALUES (1, 1, 2, 0, '2021-03-03 18:11:35');
INSERT INTO `jobprivate` VALUES (2, 1, 5, 0, '2021-03-03 20:22:52');
INSERT INTO `jobprivate` VALUES (3, 1, 3, 0, '2021-03-03 21:31:55');
INSERT INTO `jobprivate` VALUES (4, 1, 4, 0, '2021-03-03 21:32:00');
INSERT INTO `jobprivate` VALUES (5, 1, 6, 0, '2021-03-03 21:32:06');
INSERT INTO `jobprivate` VALUES (6, 1, 1, 0, '2021-03-17 21:32:11');
INSERT INTO `jobprivate` VALUES (7, 1, 11, 0, '2021-03-03 21:33:46');
INSERT INTO `jobprivate` VALUES (8, 1, 12, 0, '2021-03-04 15:54:03');
INSERT INTO `jobprivate` VALUES (9, 21, 5, 0, '2021-03-04 21:23:16');
INSERT INTO `jobprivate` VALUES (10, 26, 20, 0, '2021-03-05 16:40:56');
INSERT INTO `jobprivate` VALUES (11, 27, 1, 0, '2021-04-14 21:09:13');

-- ----------------------------
-- Table structure for jobrelease
-- ----------------------------
DROP TABLE IF EXISTS `jobrelease`;
CREATE TABLE `jobrelease`  (
  `jobreleaseid` int(11) NOT NULL AUTO_INCREMENT COMMENT '求职发布表id',
  `jobreleasetitle` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '求职标题',
  `jobreleasename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '求职名称',
  `jobreleaseintrd` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '求职介绍',
  `jobissue` int(11) NULL DEFAULT 0 COMMENT '求职发布状态',
  `createtime` datetime(0) NULL DEFAULT NULL COMMENT '职位发布时间',
  PRIMARY KEY (`jobreleaseid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of jobrelease
-- ----------------------------
INSERT INTO `jobrelease` VALUES (1, '找工作管吃住就行', '张三', '什么都会', 0, '2021-02-27 14:31:26');
INSERT INTO `jobrelease` VALUES (2, '找建筑工地打地基', '李四', '什么都会', 0, '2021-02-27 14:31:26');
INSERT INTO `jobrelease` VALUES (3, '找工作！找工作！找工作！', '王五', '般的学习能力、文字和语言运用能力、数学运用能力', 0, '2021-03-01 20:16:28');
INSERT INTO `jobrelease` VALUES (4, '找工作！找工作！', '赵子龙', '空间判断能力、形体知觉能力', 0, '2021-03-01 20:16:28');
INSERT INTO `jobrelease` VALUES (5, '找工作！找工作！', '马超', '空间判断能力、形体知觉能力', 0, '2021-03-01 20:16:28');
INSERT INTO `jobrelease` VALUES (6, '找工作！找工作！', '郭德纲', '手眼协调能力', 0, '2021-03-01 20:16:28');
INSERT INTO `jobrelease` VALUES (7, '找工作！找工作！', '孙子', '要与人打交道', 0, '2021-03-01 20:16:28');
INSERT INTO `jobrelease` VALUES (8, '找工作！找工作！', '老子', '人际交往能力（和同事之间的交流）', 0, '2021-03-01 20:16:28');
INSERT INTO `jobrelease` VALUES (9, '找工作！找工作！', '鬼谷子', '团队协作能力（跟团队之间的合作能力）', 0, '2021-03-01 20:16:28');
INSERT INTO `jobrelease` VALUES (10, '找工作！找工作！', '刘三', '对环境的适应能力（进到一个新公司，对新环境是否能适应等）', 0, '2021-03-01 20:16:28');
INSERT INTO `jobrelease` VALUES (11, '找工作！找工作！', '马行', '挫折时良好的心理承受能力', 0, '2021-03-01 20:16:28');
INSERT INTO `jobrelease` VALUES (12, '找工作！找工作！', '王二', '厨师、挖掘机、烘焙师、', 0, '2021-03-01 20:16:28');
INSERT INTO `jobrelease` VALUES (13, '找工作！找工作！', '赵三', '面点师', 0, '2021-03-01 20:16:28');
INSERT INTO `jobrelease` VALUES (14, '找工作！找工作！', '孙权', '社会能力', 0, '2021-03-01 20:16:28');
INSERT INTO `jobrelease` VALUES (15, '找工作！找工作！', '曹操', '会游泳', 0, '2021-03-01 20:16:28');
INSERT INTO `jobrelease` VALUES (16, '123', '123', '123', 0, '2021-03-03 16:57:37');
INSERT INTO `jobrelease` VALUES (19, '找呀找呀找工作', '黄四', '什么都会不怕苦不怕累', 0, '2021-03-04 21:19:59');
INSERT INTO `jobrelease` VALUES (20, '找公司', '狂人', '啥都会', 0, '2021-03-05 16:41:45');
INSERT INTO `jobrelease` VALUES (21, '1', '1', '1', 0, '2021-03-05 17:33:50');
INSERT INTO `jobrelease` VALUES (22, 'z找工作', '88888', '88888', 0, '2021-04-14 21:09:00');

-- ----------------------------
-- Table structure for resume
-- ----------------------------
DROP TABLE IF EXISTS `resume`;
CREATE TABLE `resume`  (
  `resumeid` int(11) NOT NULL AUTO_INCREMENT COMMENT '个人简历id',
  `userid` int(11) NOT NULL COMMENT '个人用户id',
  `resumename` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '个人简历姓名',
  `resumecard` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '个人简历身份证号',
  `resumesex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '个人简历性别',
  `resumeage` int(11) NOT NULL COMMENT '个人简历年龄',
  `resumeplace` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '个人简历户籍所在地',
  `resumeeducation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '个人简历学历',
  `resumecollege` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '个人简历毕业院校',
  `resumespecialty` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '个人简历所学专业',
  `resumephone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '个人简历电话',
  `resumeemail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '个人简历邮箱',
  `resumeassessment` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '个人简历自我评价',
  `resumeskill` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '个人简历专业技能',
  `resumeproject` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '个人简历项目经验',
  PRIMARY KEY (`resumeid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of resume
-- ----------------------------
INSERT INTO `resume` VALUES (1, 1, '张三', '130928198905281793', '男', 28, ' 河北省', '本科', '清华大学', '财务管理', '18637959619', '837036907@qq.com', '办事能力强', 'Ps Ar', '曾做过大型基建项目');
INSERT INTO `resume` VALUES (2, 2, '李四', '130532197901235712', '女', 27, '浙江省', '本科', '清华大学', '财务管理', '18637959619', '837036907@qq.com', '办事能力强', '会计一级棒', '曾参加大型项目');
INSERT INTO `resume` VALUES (3, 3, '王五', '513221197102183838', '男', 26, '重庆市', '研究生', '重庆大学', '机械自动化', '18637959619', '837036907@qq.com', '办事能力强', '机械制造', '曾参加过机械制造');
INSERT INTO `resume` VALUES (4, 4, '赵子龙', '130928198905288793', '男', 27, ' 河北省', '本科', '浙江大学', '计算机信息管理', '18637959619', '837036907@qq.com', '工作能力强', 'Ps Ar', '曾做过大型项目');
INSERT INTO `resume` VALUES (5, 5, '马超', '130928198905281793', '男', 28, ' 河北省', '本科', '同济大学', '国民经济管理', '18637959619', '837036907@qq.com', '严格执行公司规章制度，认真履行其工作职责', '本专业技能都会', '我在做行政工作期间，负责了公司年会的策划与实施');
INSERT INTO `resume` VALUES (6, 6, '郭德纲', '130945698905281793', '男', 30, ' 河北省', '本科', '中国人民大学', '国民经济管理', '18637959619', '837036907@qq.com', '严格执行公司规章制度，认真履行其工作职责', '本专业技能都会', '坚决服从分管副总经理的统一指挥，');
INSERT INTO `resume` VALUES (7, 7, '孙子', '130928166665281793', '男', 29, ' 河北省', '本科', '同济大学', '国民经济管理', '18637959619', '837036907@qq.com', '严格执行公司规章制度，认真履行其工作职责', '本专业技能都会', '严格执行公司规章制度，认真履行其工作职责');
INSERT INTO `resume` VALUES (8, 8, '老子', '130928785905281793', '男', 28, ' 河北省', '本科', '中国人民大学', '工业经济', '18637959619', '837036907@qq.com', '严格执行公司规章制度，认真履行其工作职责', '本专业技能都会', '负责组织对人力资源发展、');
INSERT INTO `resume` VALUES (9, 9, '鬼谷子', '410928198905281793', '男', 27, ' 河北省', '本科', '同济大学', '工业经济', '18637959619', '837036907@qq.com', '严格执行公司规章制度，认真履行其工作职责', '本专业技能都会', '负责制定公司人事管理制度。设计人事管理工作程序');
INSERT INTO `resume` VALUES (10, 10, '刘三', '333928198905281793', '男', 26, ' 河北省', '本科', '中国人民大学', '国民经济管理', '18637959619', '837036907@qq.com', '严格执行公司规章制度，认真履行其工作职责', '本专业技能都会', '负责对本部门工作目标的拟订、执行及控制；');
INSERT INTO `resume` VALUES (11, 11, '马行', '157928198905281793', '男', 25, ' 河北省', '本科', '同济大学', '贸易经济', '18637959619', '837036907@qq.com', '严格执行公司规章制度，认真履行其工作职责', '本专业技能都会', '负责合理配置劳动岗位控制劳动力总量。');
INSERT INTO `resume` VALUES (12, 12, '王二', '421928198905281793', '男', 34, ' 河北省', '本科', '上海交通大学', '国际经济与贸易', '18637959619', '837036907@qq.com', '严格执行公司规章制度，认真履行其工作职责', '本专业技能都会', '负责人事考核、考查工作。建立人事档案资料库');
INSERT INTO `resume` VALUES (13, 13, '赵三', '410928198905281793', '男', 35, ' 河北省', '本科', '上海交通大学', '国际经济与贸易', '18637959619', '837036907@qq.com', '严格执行公司规章制度，认真履行其工作职责', '本专业技能都会', '编制年、离、月度劳动力平衡计划和工资计划。');
INSERT INTO `resume` VALUES (14, 14, '孙权', '410928333905281793', '男', 35, ' 河北省', '本科', '四川大学', '社会学', '18637959619', '837036907@qq.com', '严格执行公司规章制度，认真履行其工作职责', '本专业技能都会', '制定劳动人事统计工作制度。建立健全人事');
INSERT INTO `resume` VALUES (15, 15, '曹操', '140328198905281793', '男', 45, ' 河北省', '本科', '清华大学', '社会工作', '18637959619', '837036907@qq.com', '严格执行公司规章制度，认真履行其工作职责', '本专业技能都会', '负责做好公司员工劳动纪律管理工作。');
INSERT INTO `resume` VALUES (16, 16, '小二', '41028198905281793', '男', 32, ' 河北省', '本科', '四川大学', '社会学', '18637959619', '837036907@qq.com', '严格执行公司规章制度，认真履行其工作职责', '本专业技能都会r', '严格遵守\"劳动法\"及地方政府劳动用工政策和公司劳动管理制度，');
INSERT INTO `resume` VALUES (17, 17, '金吒', '555928198905281793', '男', 26, ' 河北省', '本科', '麻省理工', '公共事业管理', '18637959619', '837036907@qq.com', '严格执行公司规章制度，认真履行其工作职责', '本专业技能都会', '负责核定各岗位工资标准。');
INSERT INTO `resume` VALUES (18, 18, '金昭', '130928198905281793', '男', 28, ' 河北省', '本科', '麻省理工', '公共事业管理', '18637959619', '837036907@qq.com', '严格执行公司规章制度，认真履行其工作职责', '本专业技能都会r', '负责对员工劳动保护用品定额和计划管理工作；');
INSERT INTO `resume` VALUES (19, 19, '唐三藏', '130928198905281793', '男', 28, ' 河北省', '本科', '牛津大学', '城市和社区管理', '18637959619111', '837036907@qq.com', '严格执行公司规章制度，认真履行其工作职责', '本专业技能都会', '配合有关部门做好安全教育工作。');
INSERT INTO `resume` VALUES (23, 24, 'asd', 'asd', '1', 1, '1', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `resume` VALUES (24, 21, '朱雀', '410381199708300511', '男', 18, '洛阳', '本科', '黄河科技学院', '软件工程', '18637959619', '837036907@qq.com', '乐观向上', 'ps ar', '大型软件编程经验');
INSERT INTO `resume` VALUES (25, 26, '狂人', '410381199708300511', '男', 18, '洛阳', '本科', '河南理工大学', '计算机科学与技术', '18637959619', '1416134589@qq.com', '人帅1', '啥都会1', '啥都做过1');
INSERT INTO `resume` VALUES (26, 27, '玄武', '410381199708300522', '男', 18, '洛阳', '本科', '清华大学', '软件工程', '18637959619', '837036907@qq.com', '888881', '888881', '888881');

-- ----------------------------
-- Table structure for resumego
-- ----------------------------
DROP TABLE IF EXISTS `resumego`;
CREATE TABLE `resumego`  (
  `resumegoid` int(11) NOT NULL AUTO_INCREMENT COMMENT '简历投递id',
  `resumeid` int(11) NOT NULL COMMENT '个人简历id',
  `jobid` int(11) NOT NULL COMMENT '职位id',
  PRIMARY KEY (`resumegoid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of resumego
-- ----------------------------
INSERT INTO `resumego` VALUES (1, 1, 1);
INSERT INTO `resumego` VALUES (2, 1, 2);
INSERT INTO `resumego` VALUES (3, 1, 3);
INSERT INTO `resumego` VALUES (4, 2, 4);
INSERT INTO `resumego` VALUES (5, 2, 5);
INSERT INTO `resumego` VALUES (6, 2, 6);
INSERT INTO `resumego` VALUES (7, 3, 1);
INSERT INTO `resumego` VALUES (8, 3, 2);
INSERT INTO `resumego` VALUES (9, 3, 3);
INSERT INTO `resumego` VALUES (10, 2, 3);
INSERT INTO `resumego` VALUES (11, 3, 6);
INSERT INTO `resumego` VALUES (12, 1, 4);
INSERT INTO `resumego` VALUES (13, 1, 5);
INSERT INTO `resumego` VALUES (14, 1, 12);
INSERT INTO `resumego` VALUES (15, 1, 12);
INSERT INTO `resumego` VALUES (16, 24, 5);
INSERT INTO `resumego` VALUES (17, 25, 20);
INSERT INTO `resumego` VALUES (18, 14, 20);
INSERT INTO `resumego` VALUES (19, 26, 1);

-- ----------------------------
-- Table structure for resumeprivate
-- ----------------------------
DROP TABLE IF EXISTS `resumeprivate`;
CREATE TABLE `resumeprivate`  (
  `resumeprivateid` int(11) NOT NULL AUTO_INCREMENT COMMENT '简历存储id',
  `enterpriseid` int(11) NOT NULL COMMENT '企业id',
  `resumeid` int(11) NOT NULL COMMENT '个人简历id',
  `resumeprivatestate` int(11) NULL DEFAULT 0 COMMENT '简历存储通过状态',
  `createtime` datetime(0) NULL DEFAULT NULL COMMENT '存储时间',
  PRIMARY KEY (`resumeprivateid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of resumeprivate
-- ----------------------------
INSERT INTO `resumeprivate` VALUES (1, 1, 1, 0, '2021-02-27 15:06:34');
INSERT INTO `resumeprivate` VALUES (2, 1, 3, 0, '2021-02-27 15:07:53');
INSERT INTO `resumeprivate` VALUES (3, 2, 1, 0, '2021-02-27 15:22:22');
INSERT INTO `resumeprivate` VALUES (4, 2, 2, 0, '2021-02-27 15:22:35');
INSERT INTO `resumeprivate` VALUES (5, 3, 3, 0, '2021-02-27 15:43:08');
INSERT INTO `resumeprivate` VALUES (8, 1, 4, 0, '2021-03-04 12:01:17');
INSERT INTO `resumeprivate` VALUES (9, 1, 6, 0, '2021-03-04 12:01:25');
INSERT INTO `resumeprivate` VALUES (10, 1, 7, 0, '2021-03-04 12:03:03');
INSERT INTO `resumeprivate` VALUES (11, 1, 8, 0, '2021-03-13 12:03:06');
INSERT INTO `resumeprivate` VALUES (12, 1, 9, 0, '2021-03-04 12:03:20');
INSERT INTO `resumeprivate` VALUES (13, 1, 1, 0, '2021-03-04 12:03:25');
INSERT INTO `resumeprivate` VALUES (15, 5, 1, 0, '2021-03-04 15:55:30');
INSERT INTO `resumeprivate` VALUES (16, 3, 24, 0, '2021-03-04 21:24:25');
INSERT INTO `resumeprivate` VALUES (17, 27, 25, 0, '2021-03-05 16:43:49');
INSERT INTO `resumeprivate` VALUES (18, 1, 26, 0, '2021-04-14 21:10:03');

-- ----------------------------
-- Table structure for superuser
-- ----------------------------
DROP TABLE IF EXISTS `superuser`;
CREATE TABLE `superuser`  (
  `superuserid` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员表id',
  `superusername` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员账号',
  `superuserpass` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员密码',
  PRIMARY KEY (`superuserid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of superuser
-- ----------------------------
INSERT INTO `superuser` VALUES (1, 'admin1', '123');
INSERT INTO `superuser` VALUES (2, 'admin2', '123');
INSERT INTO `superuser` VALUES (3, 'admin3', '123456');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `userid` int(11) NOT NULL AUTO_INCREMENT COMMENT '个人用户id',
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '个人用户账号',
  `userpass` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '个人用户密码',
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '张三', '123');
INSERT INTO `user` VALUES (2, '李四', '123');
INSERT INTO `user` VALUES (3, '王五', '123');
INSERT INTO `user` VALUES (4, '赵子龙', '123');
INSERT INTO `user` VALUES (5, '马超12', '1234561');
INSERT INTO `user` VALUES (6, '郭德纲', '123');
INSERT INTO `user` VALUES (7, '孙子', '123');
INSERT INTO `user` VALUES (8, '老子', '123');
INSERT INTO `user` VALUES (9, '鬼谷子', '123');
INSERT INTO `user` VALUES (10, '刘三', '123');
INSERT INTO `user` VALUES (11, '马行', '123');
INSERT INTO `user` VALUES (12, '王二', '123');
INSERT INTO `user` VALUES (13, '赵三', '123');
INSERT INTO `user` VALUES (14, '孙权', '123');
INSERT INTO `user` VALUES (15, '曹操', '123');
INSERT INTO `user` VALUES (16, '小二', '123');
INSERT INTO `user` VALUES (17, '金吒', '123');
INSERT INTO `user` VALUES (18, '金昭', '123');
INSERT INTO `user` VALUES (19, '唐三藏', '123');
INSERT INTO `user` VALUES (20, '玄武', '123');
INSERT INTO `user` VALUES (21, '朱雀', '1234');
INSERT INTO `user` VALUES (25, '黄四', '123');
INSERT INTO `user` VALUES (26, '狂人', '123123');
INSERT INTO `user` VALUES (27, 'andu', '123');

SET FOREIGN_KEY_CHECKS = 1;
