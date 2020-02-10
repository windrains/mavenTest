### mybatis官方文档：https://mybatis.org/mybatis-3

> ### xml方式的配置： 
> * 相比jdbc仅多需导入mybatis-spring-boot-starter依赖。即（mybatis-spring-boot-starter，）
> ```
> mybatis仅需以下5个依赖：
> spring-boot-starter-data-jdbc  #jdbc依赖
> spring-boot-starter-web,       #web项目依赖
> mybatis-spring-boot-starter    #mybatis依赖  
> mysql-connector-java           #mysql连接驱动
> com.alibaba.druid              #阿里巴巴druid数据源
> ```
> * 创建javabean实体类
> * 创建mapper.java接口文件，添加@Mapper或@MapperScan注解
> * 创建mapper.xml映射文件，namespace值为对应的mapper.java接口全路径。  
> * 创建mybatis-config.xml文件，用于配置其它属性（如下划线转换为下一个字母大写）。
> * 在已配置好jdbc数据源的yml文件中配置mybatis相关参数：  
> ```yaml
> mybatis:
>   # 指定全局配置文件位置
>   config-location: classpath:mybatis/mybatis-config.xml
>   # 指定sql映射文件位置
>   mapper-locations: classpath:mybatis/mapper/*.xml
> ```
> * controller中注入Mapper.java接口,用mapper接口直接调用其内方法。
> * 启动项目，访问controller方法。  


> ### mybatis注解方式
> * 创建javabean实体类
> * 创建mapper.java接口文件，添加@Mapper或@MapperScan注解。然后在接口方法上加上@select()等注解。
> * controller中注入Mapper.java接口,用mapper接口直接调用其内方法。
> * 启动项目，访问controller方法。 



### xml方式的坑人地方：
调用Mapper接口报错：
```
org.apache.ibatis.binding.BindingException: Invalid bound statement (not found)
```
网上给出三种解决方式，均不可行。
``` https://www.jianshu.com/p/a9516bcd3cb0 ```  
然后引入教程的mapper.xml,bean,mapper.xml后就没问题。
然后自己的也不报错了。





