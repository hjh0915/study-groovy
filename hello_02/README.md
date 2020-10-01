常用断言assert
=============
使用断言可以报出错误信息，及时修改
``` groovy
def x = 1
assert x == 1
```

在类中的应用
==========
``` groovy
class Book {
    String title
}
```

1、调用类
--------
``` groovy
def groovyBook = new Book()
```

2、修改属性title
---------------
``` groovy
groovyBook.setTitle('Groovy in action')
assert groovyBook.getTitle() == 'Groovy in action'

groovyBook.title = 'Groovy in world'
assert groovyBook.title == 'Groovy in world'
```
其中，setTitle之后若要再次修改不能再写setTitle，要直接groovyBook.title

实践于if、while、for、list、switch
================================
``` groovy
def x = 1 
if (x == 1) {
    assert true
    println "${x}"
} else {
    assert false
}
```
``` groovy
def i = 0
while (i < 10) {
    i++
}
assert i == 10
```
``` groovy
def clinks = 0
for (x in 0..9) {
    clinks += x
}
assert clinks == (10*(10-1))/2
```
其中定义变量不能重复定义