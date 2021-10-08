import com.atguigu.spring.AopService;
import com.atguigu.spring.aop.CalcService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.SpringVersion;
import org.springframework.test.context.junit4.SpringRunner;

import static java.lang.System.out;

@SpringBootTest(classes= AopService.class)
@RunWith(SpringRunner.class)
public class AopTest {

    @Autowired
    private CalcService calcService;

    @Test
    public void testAop(){
        out.println("Spring Version:"+SpringVersion.getVersion()+ "SpringBoot Version:"+SpringBootVersion.getVersion());
        calcService.div(10,2);
    }
}
