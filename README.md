安装软件
=======
nano .bashrc

查找文件
=======
find . -name 'joda-convert*' -print

在当前目录要获取文件
=================
./xxx/xxx

在当前目录要获取主目录文件
======================
/home/hjh/xxx/xxx 或者
~/xxx/xxx

函数的写法
========
类似于python定义函数用def
调用函数的时候，可以省去括号
-----------------------
``` groovy
x = sum 5, 7 
println "Sum-01: ${x}"
```

要用正则表达式
------------
``` groovy
println "Sum-01: ${x}"
```

执行Hello.groovy文件
===================
> $ groovy Hello.groovy

存在groovy交互式环境
==================
```
$ groovysh
Groovy Shell (2.5.7, JVM: 1.8.0_211)
Type ':help' or ':h' for help.
-------------------------------------------------------------------------------
groovy:000> "hello world"
===> hello world
groovy:000> "Welcome " + System.properties."user.name"
===> Welcome hzg
```

调用第三方的包
------------
```
$ groovysh -cp ~/libs/joda-time-2.10.5.jar:~/libs/joda-convert-2.2.1.jar
Groovy Shell (2.5.7, JVM: 1.8.0_211)
Type ':help' or ':h' for help.
------------------------------------------------------------------
groovy:000> import org.joda.time.DateTime
===> org.joda.time.DateTime
groovy:000> def dt = new DateTime()
===> 2020-03-27T20:32:11.423+08:00
```