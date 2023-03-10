package controller;

import entity.TradingRecord;
import service.TradingRecordService;
import service.WalletService;

import java.math.BigDecimal;
import java.util.List;

public class WalletController {
    TradingRecordService tradingRecordService = new TradingRecordService();

    WalletService walletService = new WalletService();

    /***
     * 查询用户钱包余额
     * @param userId
     * @return
     */
    public BigDecimal getUserBalance(Integer userId){
        return walletService.getBalance(userId);
    }

    /***
     * 用户消费100元的接口 userConsume(用户id, new BigDecimal(100), 1)
     * 用户退款20元的接口 userConsume(用户id, new BigDecimal(20), 2)
     */
    public boolean userConsume(Integer userId, BigDecimal amount, Integer type){
        return walletService.userConsume(userId, amount, type);
    }

    /***
     * 查询用户钱包金额变动明细的接口
     * @param userId
     * @return
     */
    public List<TradingRecord> getTradingDetail(Integer userId){
        return tradingRecordService.getDetail(userId);
    }
}
