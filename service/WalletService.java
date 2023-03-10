package service;

import dao.WalletDao;
import entity.TradingRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class WalletService {

    TradingRecordService tradingRecordService = new TradingRecordService();
//    依赖注入..
    WalletDao walletDao = new WalletDao();
    // 查询钱包余额
    public BigDecimal getBalance(Integer userId){
        if(userId == null){
            System.out.println("提示错误并返回");
            return null;
        }

        BigDecimal balance = walletDao.getBalance(userId);
        return balance;
    }

    /***
     * 消费并产生交易记录
     * @param price = 100  消费100元
     * @return
     */
//    @Transaction
    public boolean userConsume(Integer userId, BigDecimal price, Integer type){
        if (userId == null || price == null){
            // 返回错误信息
            return false;
        }
        TradingRecord record = new TradingRecord();
//        生成主键
//        record.settradingRecordId();
        record.setTime(LocalDateTime.now());
        record.setUserId(userId);
        record.setType(type);
        record.setAmount(price);

        if(type == 1 || type == 3){
//            1：支付， 3：提现
            // 钱包余额
            BigDecimal balance = walletDao.getBalance(userId);
            if (balance.compareTo(price) < 0){
                // 余额不足，返回错误信息
                return false;
            }
            // 钱包扣减余额
            walletDao.consumeOrWithdraw(userId, price);
            if (type == 1){
                // 其他支付逻辑
            } else if (type == 3) {
                // 提现逻辑
            }

        }else if(type == 2 || type == 0){
//            0：充值，2：退款
            // 充值或退款 直接加
            walletDao.payOrRefund(userId, price);
            if (type == 0) {
                // 其他退款逻辑
            } else if (type == 2) {
                // 其他充值逻辑
            }
        }

        tradingRecordService.addRecord(record);
        return true;
    }
}
