package service;

import dao.TradingRecordDao;
import entity.TradingRecord;

import java.util.List;

public class TradingRecordService {
    private TradingRecordDao dao = new TradingRecordDao();

    public boolean addRecord(TradingRecord record){
//        insert into trading_record values()

        return true;
    }

    public List<TradingRecord> getDetail(Integer userId) {
//      select * from trading_record where user_id = userId limit 0, 20;
        return dao.getDetail(userId);


    }
}
