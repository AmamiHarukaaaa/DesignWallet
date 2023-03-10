package dao;

import entity.TradingRecord;

import java.util.ArrayList;
import java.util.List;

public class TradingRecordDao {
    public List<TradingRecord> getDetail(Integer userId) {
        // 查询相关信息并返回， 数据量大可使用分页查询
//      select * from trading_record where user_id = userId limit 0, 20;
        return new ArrayList<>();
    }

}
