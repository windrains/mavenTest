### 自定义一个start示例
目的：其他人将包含三个模块  
原理：mystarter-spring-boot-start-autoconfigurer-08获取使用方的yml参数，装配成bean，被使用方直接注入使用。

```
//此模块负责创建接受第三方yml参数的ConfigurationProperties类，并创建一个生产bean的Configuration类。
//并在此类中将ConfigurationProperties类作为bean的属性值。第三方就可以直接注入此bean。
//install安装到maven库。
mystarter-spring-boot-start-autoconfigurer-08

//这是一个maven项目，仅pom中依赖autoconfigurer-08，无其它代码。install安装到maven库。
mystarter-spring-boot-start-08

//第三方模块。添加mystarter-spring-boot-start-08依赖，然后注入autoconfigurer-08提供的类。
//实际上可以直接依赖autoconfigurer-08包。
mystarter-spring-boot-start-teststarter-08
```