# 设计模式实现篇
## proxy_pattern模块（动态代理实现）
### 原理：
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



