package entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TradingRecord {
    private Integer tradingRecordId;

    private Integer userId;

    private Integer type;

    private LocalDateTime time;

    private BigDecimal amount;

    public TradingRecord(Integer tradingRecordId, Integer userId, Integer type, LocalDateTime time, BigDecimal amount) {
        this.tradingRecordId = tradingRecordId;
        this.userId = userId;
        this.type = type;
        this.time = time;
        this.amount = amount;
    }

    public TradingRecord() {
    }

    public Integer getTradingRecordId() {
        return tradingRecordId;
    }

    public void setTradingRecordId(Integer tradingRecordId) {
        this.tradingRecordId = tradingRecordId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
