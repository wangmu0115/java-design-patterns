

Logger 上下文

为了通过Logback记录日志，需要初始化一个Logger对象，可以通过SLF4j或者Logback
```java
org.slf4j.LoggerFactory.getLogger()
```

日志上下文存在于与 Java 对象层次结构非常相似的层次结构中：
- 


所有的Logger都是Root Logger的后代

可以在配置文件或者通过Logger.setLevel()方法为Logger设置Level，方法会覆盖配置文件
Trace，Debug，Info，Warn，Error
如果没有明确为 Logger 分配级别，它将继承其最近祖先的级别。
The root logger defaults to DEBUG. 

日志Level

参数化日志消息

appending strings:分配内存，序列化，链接字符串，垃圾回收


Here’s how Logback will attempt to find configuration data:

Search for files named logback-test.xml, logback.groovy, or logback.xml in the classpath, in that order
If the library doesn’t find those files, it will attempt to use Java’s ServiceLoader to locate an implementor of the com.qos.logback.classic.spi.Configurator.
Configure itself to log output directly to the console



