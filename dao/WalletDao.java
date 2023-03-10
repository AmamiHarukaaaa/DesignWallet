package dao;

import entity.TradingRecord;
import entity.Wallet;

import java.math.BigDecimal;

public class WalletDao {
    /***
     * 获取钱包余额
     * @param userId
     * @return
     */

    public BigDecimal getBalance(Integer userId) {
//        select balance from wallet where user_id = userid
        return null;
    }

    /***
     * 消费或提现
     */
    public Boolean consumeOrWithdraw(Integer userId, BigDecimal amount){
        // 钱包扣减余额
//        update wallet set balance = balance - amount where user_id = userId
//        if(执行失败){
//        提示错误信息
//            return false;
//        }

        return true;
    }

    /***
     * 退款和充值
     * @param userId
     * @param amount
     * @return
     */
    public Boolean payOrRefund(Integer userId, BigDecimal amount){
        //        update wallet set balance = balance + amount where user_id = userId

        return true;
    }
}
