### mybatis官方文档：https://mybatis.org/mybatis-3
### 注解版mybatis最坑人的地方：  
* Mapper接口MmDishonestyListMapper已加上@Mapper注解，但是MajorFoucsListController注入此Mapper时，  
    报错：  
    ```
     Cannot resolve symbol MmDishonestyListMapper
    ```
    提示无此bean。maven clean也不行。无论如何都解决不了。结果重启idea就好了。  

* #### 注意：mysql连接驱动包不能低于6.0.X, 太低其内缺少com.mysql.cj.jdbc.Driver，springboot2.2.4默认mysql-connector-java的版本是8.0.19，版本太高，报错：连接失败，DataSource中url not set，实际换个版本就不报错。 建议用8.0.15或6.0.6
* SpringBoot启动时红色警告：
  
        Mon Jun 04 00:53:48 CST 2018 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification
  
  翻译：
  
  请注意:不建议在没有服务器身份验证的情况下建立SSL连接。根据MySQL 5.5.45+、5.6.26+和5.7.6+的要求，如果不设置显式选项，则必须建立默认的SSL连接。您需要通过设置useSSL=false显式地禁用SSL，或者设置useSSL=true并为服务器证书验证提供信任存储
  
  解决方法：
  ``` 
  jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false
  ```