package entity;


import java.math.BigDecimal;

public class Wallet {
    private Integer userId;
    private BigDecimal balance;

    public Wallet() {
    }

    public Wallet(Integer userId, BigDecimal balance) {
        this.userId = userId;
        this.balance = balance;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
