-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.6.28 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 rocketmq 的数据库结构
CREATE DATABASE IF NOT EXISTS `rocketmq` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `rocketmq`;


-- 导出  表 rocketmq.mq_coupon 结构
CREATE TABLE IF NOT EXISTS `mq_coupon` (
  `coupon_id` varchar(32) NOT NULL,
  `coupon_price` decimal(10,2) DEFAULT NULL COMMENT '优惠券价格',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `order_id` varchar(32) DEFAULT NULL COMMENT '订单id',
  `is_used` char(1) DEFAULT NULL COMMENT '是否使用   0未使用  1已使用',
  `used_time` datetime DEFAULT NULL COMMENT '使用时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`coupon_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='优惠券';

-- 正在导出表  rocketmq.mq_coupon 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `mq_coupon` DISABLE KEYS */;
/*!40000 ALTER TABLE `mq_coupon` ENABLE KEYS */;


-- 导出  表 rocketmq.mq_goods 结构
CREATE TABLE IF NOT EXISTS `mq_goods` (
  `goods_id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(50) DEFAULT NULL COMMENT '商品名称',
  `goods_number` int(11) DEFAULT NULL COMMENT '剩余数量',
  `goods_price` decimal(10,2) DEFAULT NULL COMMENT '商品价格',
  `goods_desc` varchar(255) DEFAULT NULL COMMENT '商品描述',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品';

-- 正在导出表  rocketmq.mq_goods 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `mq_goods` DISABLE KEYS */;
/*!40000 ALTER TABLE `mq_goods` ENABLE KEYS */;


-- 导出  表 rocketmq.mq_order 结构
CREATE TABLE IF NOT EXISTS `mq_order` (
  `order_id` varchar(32) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `order_status` char(1) DEFAULT NULL COMMENT '-1:已取消 0:已创建 1:已确认',
  `pay_status` char(1) DEFAULT NULL COMMENT '-1:已退款  0:未支付 1:支付中 2:已支付',
  `shipping_status` char(1) DEFAULT NULL COMMENT '0:未发货  1:运送中  2:运输完成',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `consignee` varchar(255) DEFAULT NULL COMMENT '收货人',
  `goods_id` int(11) DEFAULT NULL COMMENT '商品id',
  `goods_number` int(11) DEFAULT NULL COMMENT '商品数量',
  `goods_price` decimal(10,2) DEFAULT NULL COMMENT '商品单价',
  `goods_amount` decimal(10,2) DEFAULT NULL COMMENT '商品总额',
  `order_amount` decimal(10,2) DEFAULT NULL COMMENT '订单总额',
  `coupon_id` varchar(32) DEFAULT NULL COMMENT '优惠券id',
  `money_paid` decimal(10,2) DEFAULT NULL COMMENT '支付金额',
  `pay_amount` decimal(10,2) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `confirmTime` datetime DEFAULT NULL COMMENT '确认时间',
  `pay_time` datetime DEFAULT NULL COMMENT '支付时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单';

-- 正在导出表  rocketmq.mq_order 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `mq_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `mq_order` ENABLE KEYS */;


-- 导出  表 rocketmq.mq_pay 结构
CREATE TABLE IF NOT EXISTS `mq_pay` (
  `pay_id` varchar(32) NOT NULL,
  `order_id` varchar(32) NOT NULL,
  `pay_amount` decimal(10,2) DEFAULT NULL COMMENT '支付金额',
  `is_paid` char(1) DEFAULT NULL COMMENT '1:已支付  0:未支付',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`pay_id`,`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='支付';

-- 正在导出表  rocketmq.mq_pay 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `mq_pay` DISABLE KEYS */;
/*!40000 ALTER TABLE `mq_pay` ENABLE KEYS */;


-- 导出  表 rocketmq.mq_user 结构
CREATE TABLE IF NOT EXISTS `mq_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `user_password` varchar(255) DEFAULT NULL COMMENT '密码',
  `user_mobile` varchar(50) DEFAULT NULL COMMENT '手机',
  `user_score` int(11) DEFAULT NULL COMMENT '积分',
  `user_reg_time` datetime DEFAULT NULL COMMENT '注册时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `user_money` decimal(10,2) DEFAULT NULL COMMENT '余额',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- 正在导出表  rocketmq.mq_user 的数据：~5 rows (大约)
/*!40000 ALTER TABLE `mq_user` DISABLE KEYS */;
INSERT INTO `mq_user` (`user_id`, `user_name`, `user_password`, `user_mobile`, `user_score`, `user_reg_time`, `create_time`, `update_time`, `user_money`) VALUES
	(1, 'liutao', NULL, NULL, 100, NULL, '2017-04-05 14:36:54', '2017-04-05 16:32:44', NULL),
	(2, 'liutao', NULL, NULL, 100, NULL, '2017-04-05 14:36:54', '2017-04-05 16:32:45', NULL),
	(3, 'liutao', NULL, NULL, 100, NULL, '2017-04-05 14:36:54', NULL, NULL),
	(4, 'liutao', NULL, NULL, 100, NULL, '2017-04-05 15:13:33', NULL, NULL),
	(5, 'liutao', NULL, NULL, 100, NULL, '2017-04-05 15:56:03', NULL, NULL),
	(6, 'liutao', NULL, NULL, 100, NULL, '2017-04-05 16:08:30', NULL, NULL);
/*!40000 ALTER TABLE `mq_user` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
