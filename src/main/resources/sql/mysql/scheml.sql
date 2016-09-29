

DROP TABLE IF EXISTS `test`;

CREATE TABLE `test` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `text` char(255) DEFAULT NULL COMMENT '文本',
  `name` varchar(255) NOT NULL COMMENT '姓名',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
)  DEFAULT CHARSET=utf8;

CREATE TABLE `banner` (
  `banner_id` int(11) NOT NULL AUTO_INCREMENT,
  `url` longtext NOT NULL COMMENT '链接地址',
  `image_url` varchar(255) DEFAULT NULL COMMENT '图片链接地址',
  `type` varchar(255) DEFAULT NULL COMMENT '类型',
  `enabled` tinyint(1) NOT NULL DEFAULT '1' COMMENT '1:有效, 0:无效',
  PRIMARY KEY (`banner_id`)
) DEFAULT CHARSET=utf8mb4 COMMENT='轮播信息';

CREATE TABLE `user_info` (
  `user_info_id` int(11) NOT NULL AUTO_INCREMENT,
  `mobile` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '用户登录手机号',
  `user_pwd` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户密码',
  `number_pwd` varchar(64) DEFAULT NULL COMMENT '数字交易密码',
  `touch_id_pwd` varchar(64) DEFAULT NULL COMMENT 'touchID交易密码',
  `audit_status` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'PRE_CHECK' COMMENT '状态:PRE_CHECK:未审核,HAS_CHECK:审核通过,HAS_BAN:封禁',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `enable` tinyint(1) DEFAULT '1' COMMENT '1:true,0,false',
  PRIMARY KEY (`user_info_id`)
)DEFAULT CHARSET=utf8mb4 COMMENT='用户登录信息表';


INSERT INTO `test` (`id`, `text`, `name`) VALUES (1, 'moon', 'moon');
