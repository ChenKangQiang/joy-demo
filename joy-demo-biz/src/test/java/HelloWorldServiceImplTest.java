import com.dianping.joy.demo.biz.HelloWorldServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description:
 * @Author: chenkangqiang
 * @Date: 2018/6/14
 */
public class HelloWorldServiceImplTest extends BaseTest {

    @Autowired
    private HelloWorldServiceImpl helloWorldService;

    @Test
    public void test() {
        helloWorldService.helloWorld(100);
    }

}
