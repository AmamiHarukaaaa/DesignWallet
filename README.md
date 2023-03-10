# DesignWallet
电商app设计一个用户钱包   

SQL:见table.sql

wallet表存储钱包信息

trading_record表存储交易详情

controller层为api入口，调用service层完成业务。  
    
service层执行业务逻辑，调用dao层执行数据库操作

dao层执行数据库操作，可使用MybatisPlus或JPA等技术完成

entity为实体类
