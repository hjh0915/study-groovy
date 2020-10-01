类的调用
=======
此处不同于java的类使用
在一个groovy文件中可以写两个或多个类，但是必须要有一个main方法
``` groovy
class Hello {
    static void main(args) {
        def x = Utils.sum(2, 3)
        println "Sum: ${x}"
    }
}

class Utils {
    static sum(a, b) {
        return a+b
    }
}
```