import com.itheima.ssm.domain.Items;
import com.itheima.ssm.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text01 {

    @Test
    public void test01(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext-service.xml");
        ItemsService bean = applicationContext.getBean(ItemsService.class);
        Items byId = bean.findById(1);
        System.out.println(byId.getName());

    }
}
