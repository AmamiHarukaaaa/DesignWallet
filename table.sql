CREATE TABLE `wallet` (
                          `user_id` int NOT NULL COMMENT '用户id',
                          `balance` decimal(16,3) NOT NULL COMMENT '钱包余额',
                          PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin

CREATE TABLE `trading_record` (
                                  `trading_record_id` int NOT NULL COMMENT '交易记录id',
                                  `user_id` int NOT NULL COMMENT '用户id',
                                  `type` int NOT NULL COMMENT '交易类型 0：充值， 1：支付，2：退款，3：提现',
                                  `time` datetime NOT NULL COMMENT '交易时间',
                                  `amount` decimal(16,3) NOT NULL COMMENT '交易金额',
                                  PRIMARY KEY (`trading_record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin
