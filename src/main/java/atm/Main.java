package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext obj = new ClassPathXmlApplicationContext("bean.xml");

        AtmUI atmUI = obj.getBean(AtmUI.class);
        atmUI.run();
    }
}
