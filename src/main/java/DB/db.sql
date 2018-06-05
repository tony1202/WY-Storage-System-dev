#用户表
CREATE TABLE wy_user(
  user_id VARCHAR(30) PRIMARY KEY COMMENT '用户id',
  user_name VARCHAR(30) NOT NULL COMMENT '用户账号',
  password VARCHAR(64) NOT NULL COMMENT '密码',
  user_alias VARCHAR(20) NOT NULL COMMENT '名称',
  user_email VARCHAR(30) COMMENT '邮箱',
  user_phone VARCHAR(11) COMMENT '手机',
  user_organ VARCHAR(5) COMMENT '部门'
)CHARSET =utf8;

