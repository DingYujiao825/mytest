import com.itheima.ssm.dao.ItemsDao;
import com.itheima.ssm.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

public class Text01 {

    @Test
    public void text(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        ItemsDao bean = context.getBean(ItemsDao.class);
        Items byId = bean.findById(1);
        System.out.println(byId.getName());
    }
}
