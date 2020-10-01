创建gradle init
===============
1、选择groovy-application
2、选择Groovy

修改build.gradle里面groovy的版本
==============================
implementation 'org.codehaus.groovy:groovy-all:2.5.13'

构建gradle
==========
> $ gradle build

执行
===
> $ java -cp $GROOVY_HOME/grooid/groovy-2.5.13-grooid.jar:./build/classes/groovy/main hello_09/App

> $ java -cp $GROOVY_HOME/grooid/groovy-2.5.13-grooid.jar:./build/libs/hello_09.jar hello_09.App