import client.Client;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import server.AutowiredDemo;

public class DependencySpringTest {
    @Test
    public void consInjection() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        Client client = (Client) beanFactory.getBean("client1");
        assertEquals("Hello Service", client.greet());
    }

    @Test
    public void setterInjection() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        Client client = (Client) beanFactory.getBean("client2");
        assertEquals("Hello Service", client.greet());
    }

    @Test
    public void autowired() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        AutowiredDemo autowiredDemo = (AutowiredDemo) beanFactory.getBean("autowired");
        assertEquals("Hello Service", autowiredDemo.callClient());
    }
}
