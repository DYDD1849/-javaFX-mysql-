/*
 Navicat MySQL Data Transfer

 Source Server         : hello
 Source Server Type    : MySQL
 Source Server Version : 80032
 Source Host           : localhost:3306
 Source Schema         : hello

 Target Server Type    : MySQL
 Target Server Version : 80032
 File Encoding         : 65001

 Date: 31/07/2024 19:29:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dydd
-- ----------------------------
DROP TABLE IF EXISTS `dydd`;
CREATE TABLE `dydd`  (
  `学期` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `学号` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `班级` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `姓名` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `体育` int(0) NULL DEFAULT NULL,
  `高等数学` int(0) NULL DEFAULT NULL,
  `大学英语` int(0) NULL DEFAULT NULL,
  `大学计算机基础` int(0) NULL DEFAULT NULL,
  `总分` int(0) NULL DEFAULT NULL,
  `平均分` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`学号`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dydd
-- ----------------------------
INSERT INTO `dydd` VALUES ('00', '000', '000', '000', 0, 0, 0, 0, 0, 0);
INSERT INTO `dydd` VALUES ('1', '001', '801', '樊', 100, 100, 100, 100, 310, 77);
INSERT INTO `dydd` VALUES ('1', '002', '801', '胡', 100, 60, 80, 80, 320, 80);
INSERT INTO `dydd` VALUES ('1', '003', '801', '吴', 70, 70, 0, 90, 230, 57);
INSERT INTO `dydd` VALUES ('1', '004', '802', '岳', 70, 70, 90, 100, 330, 82);
INSERT INTO `dydd` VALUES ('1', '005', '802', '邹', 70, 70, 100, 90, 330, 82);
INSERT INTO `dydd` VALUES ('1', '006', '802', '蒋', 80, 80, 50, 100, 320, 80);
INSERT INTO `dydd` VALUES ('1', '007', '803', '邱', 90, 80, 90, 100, 360, 90);
INSERT INTO `dydd` VALUES ('1', '008', '803', '熊', 90, 80, 100, 40, 370, 92);
INSERT INTO `dydd` VALUES ('1', '009', '803', '袁', 100, 80, 80, 100, 360, 90);
INSERT INTO `dydd` VALUES ('1', '010', '801', '章', 90, 70, 80, 90, 330, 82);
INSERT INTO `dydd` VALUES ('1', '011', '802', '涂', 90, 80, 70, 90, 330, 82);
INSERT INTO `dydd` VALUES ('1', '012', '802', '杜', 90, 80, 90, 90, 350, 87);
INSERT INTO `dydd` VALUES ('1', '013', '803', '董', 50, 100, 70, 100, 320, 80);
INSERT INTO `dydd` VALUES ('1', '017', '801', '岳', 70, 100, 90, 100, 360, 90);
INSERT INTO `dydd` VALUES ('1', '020', '801', '王', 90, 90, 90, 90, 230, 57);
INSERT INTO `dydd` VALUES ('1', '021', '801', '李', 90, 90, 90, 90, 280, 70);
INSERT INTO `dydd` VALUES ('1', '022', '801', '迎', 90, 90, 20, 100, 300, 75);
INSERT INTO `dydd` VALUES ('1', '023', '801', '潘', 100, 100, 100, 100, 290, 72);
INSERT INTO `dydd` VALUES ('1', '091', '803', '黄', 100, 60, 30, 20, 200, 50);
INSERT INTO `dydd` VALUES ('3', '1', '801', '鸡', 1, 1, 1, 1, 4, 1);
INSERT INTO `dydd` VALUES ('3434', '4234324', '801', '324234', 3423, 423423, 434234, 432423, 1293503, 323375);
INSERT INTO `dydd` VALUES ('1', '89', '803', '杨', 100, 100, 100, 100, 400, 100);

-- ----------------------------
-- Table structure for nihao
-- ----------------------------
DROP TABLE IF EXISTS `nihao`;
CREATE TABLE `nihao`  (
  `age` int(0) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`age`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of nihao
-- ----------------------------
INSERT INTO `nihao` VALUES (22, 'naan');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `Product_Code` char(7) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Description` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Price` decimal(10, 2) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
