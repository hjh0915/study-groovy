变量it的使用
==========
``` groovy
def log = ''
(1..10).each { x -> log += x }
assert log == '12345678910'

def log = ''
(1..10).each { log += it } //魔幻变量it
assert log == '12345678910'
```

使用闭包
=======
类似于python中的闭包概念，即函数调用函数