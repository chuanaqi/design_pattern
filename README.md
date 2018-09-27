# 设计模式实现篇
## proxy_pattern模块（动态代理实现）
### 原理
    1.拿到被代理对象的引用，然后获取它的接口
    2.JDK代理重新生成一个类，同时实现我们给的代理对象所实现的接口
    3.把被代理对象的引用也拿到了
    4.重新动态生成一个class字节码
    5.然后编译
### 包说明
    1.cglib    cglib实现动态代理
    2.jdk      JDK实现动态代理
    3.myproxy  自实现动态代理
### myproxy 动态代理实现
    1.MyClassLoader 实现代码生成、编译、动态加载到JVM
    2.MyProxy 生成代理对象
### 测试
    运行jdk/THouseJDKProxy.java测试 JDK
    运行myproxy/HouseProxy.java测试自实现动态代理
    运行cglib/CglibHouseProxy.java测试cglib动态代理

## singleton_pattern模块（单例模式实现）
### 原理
    保证一个类有且仅有一个实例，并提供一个访问它的全局访问点。
### 包说明
    1.hungry      饿汉模式(不推荐)
    2.slacker     懒汉模式(不推荐)
    3.dcl         双重检查锁实现单例模式(推荐)
    4.sic         静态内部类模式(推荐)
    5.enum        枚举类单例模式（强烈推荐，原生防御反射和序列化攻击）


## factory_pattern模块（工厂模式实现）
### 描述
#### 简单工厂
    由一个工厂对象根据收到的消息决定要创建哪一个类的对象实例
#### 工厂方法模式
    定义一个创建对象的工厂接口，让子类决定实例化哪一个类，将实际创建工作推迟到子类当中。
#### 抽象工厂
    抽象工厂是围绕一个超级工厂创建其他工厂，该超级工厂又称为其他工厂的工厂。提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类。
### 使用场景
#### 简单工厂
    工厂类负责创建的对象比较少，客户只需要传入工厂类参数，对于如何创建对象（逻辑）不关心。简单工厂模式很容易违反高内聚低耦合的原则，因此一般只在很简单的情况下使用。
#### 工厂方法模式
    1.日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。
    2.数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。 
    3.设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。
#### 抽象工厂
    抽象工厂是围绕一个超级工厂创建其他工厂，该超级工厂又称为其他工厂的工厂。提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类。   
### 包说明
    1.simple   简单工厂 （不遵守OCP（开闭原则，Open-Closed Principle））
    2.func     工厂方法模式
    3.abstr    抽象工厂
    4.payment  支付实现类
    
### 测试
    运行simple/Test.java  测试 简单工厂
    运行func/Test.java    测试 工厂方法模式
    运行abstr/Test.java   测试 抽象工厂

## strategy_pattern模块（策略模式实现）
### 描述
    策略模式定义和封装了一系列的算法。
    它们是可以相互替换的，也就是说它们具有共性，而它们的共性就体现在策略接口的行为上，
    让算法独立于使用它的客户而独立变化，需要让客户端依赖于策略接口。
###使用场景
    1.针对同一类型问题的多种处理方式，仅仅是具体行为有差别时； 
    2.需要安全地封装多种同一类型的操作时； 
    3.出现同一抽象类有多个子类，而又需要使用 if-else 或者 switch-case 来选择具体子类时。
### 实现
    IPriceStrategy          价格计算策略接口
    NonVipPriceStrategy     普通客户计算策略（实现IPriceStrategy接口）
    VipPriceStrategy        VIP客户计算策略（实现IPriceStrategy接口）
    SupperVipPriceStrategy  策略上下文（持有IPriceStrategy引用）
    Client                  客户端
### 测试
    运行Client.java 测试

## delegate_pattern模块（委派模式实现）
### 描述
    1.静态代理和策略模式一种特殊的组合。
    2.客户请求（Boss）、委派者（Leader）、被委派者（Programmer）。
    3.委派者要持有被委派者的引用。
    4.代理模式注重的是过程， 委派模式注重的是结果。
    5.策略模式注重是可扩展（外部扩展），委派模式注重内部的灵活和复用。
    6.委派的核心：就是分发、调度、派遣。
###使用场景
    Spring MVC框架中的DispatcherServlet
### 实现
    Leader                              委托者
    BackendProgrammer,FrontProgrammer  被委托者
    Boss                               客户端
### 测试
    运行Boss.java 测试

## decorator_pattern模块（装饰器模式实现）
### 描述
    装饰器模式是一种用于代替继承的技术，无需通过继承增加子类就能扩展对象的新功能。使用对象的关联关系代替继承关系，更加灵活，同时避免类型体系的快速膨胀。
    装饰器的价值在于装饰，他并不影响被装饰类本身的核心功能。
    
###使用场景
    1.IO中输入流和输出流的设计
    2.Swing包中图形界面构件功能
    3.Servlet API中提供了一个request对象的Decorator设计模式的默认实现类HttpServletRequestWrapper，HttpServletRequestWrapper类增强了request对象的功能。
    4.Struts2中，request，response，session对象的处理
### 实现
    IPayment                                抽象支付接口
    Baofoopay,Yeepay                        具体渠道支付实现类
    PaymentDecorator                        装饰类
    PaymentDecoratorMessageParseDecorator   报文解析装饰器
### 测试
    运行test.java 测试
