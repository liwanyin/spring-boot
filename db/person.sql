use `jeecg-boot`;
CREATE TABLE `person`(
                          `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '唯一标识id',
                          `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '姓名',
                          `age` int(3) NOT NULL COMMENT '年龄',
                          PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;