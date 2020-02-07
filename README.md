#### 此项目是一个单纯使用jdbc连接mysql的的简单springboot web项目  
#### 出现的问题   
 * 测试数据库连接，SpringBoot06DataJdbcApplicationTests.contextLoads执行报错：  
   
```
Error running 'SpringBoot06DataJdbcApplicationTests.contextLoads': 
  Failed to resolve org.junit.platform:junit-platform-launcher:1.5.2
```
   发现maven依赖图中并没有此包，maven仓库中也没此包，于是在pom中添加此依赖，解决此问题。  
```xml
<dependency>
    <groupId>org.junit.platform</groupId>
    <artifactId>junit-platform-launcher</artifactId>
    <version>1.5.2</version>
    <scope>test</scope>
</dependency>
```

* 再运行测试会在报错：  
```
java.sql.SQLException: The server time zone value 'ÖÐ¹ú±ê×¼Ê±¼ä' is unrecognized 
or represents more than one time zone. You must configure 
either the server or JDBC driver (via the serverTimezone configuration property) 
to use a more specifc time zone value 
if you want to utilize time zone support.
```
百度结果：
```
出现这种问题还是版本更细，与其他版本造成
显示新版本的数据库连接程序需要指定UTC时区，
改正方法将配置文件中的“url”后面加上指定的时区，
将其值改为url=jdbc:mysql://localhost:3306/db&serverTimezone=GMT
或         ?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT
```
  * 接着继续报错：  
  ```
  Loading class `com.mysql.jdbc.Driver'. This is deprecated. 
  The new driver class is `com.mysql.cj.jdbc.Driver'. 
  The driver is automatically registered via the SPI 
  and manual loading of the driver class is generally unnecessary.
  ```
 提示信息表明数据库驱动com.mysql.jdbc.Driver'已经被弃用了，应当使用新的驱动com.mysql.cj.jdbc.Driver',  
 所以，按照提示更改jdbc.properties配置 .com.mysql.jdbc.Driver  改为  com.mysql.cj.jdbc.Driver   
 * 然后能正常运行。
 


