增加单元测试代码
==============
``` groovy
import com.work.hello.*

class TestUtils extends GroovyTestCase {
    void testSimple() {
        assertEquals(Utils.sum(2, 3), 5)
    }
}
```

执行
====
> groovy TestUtils.groovy