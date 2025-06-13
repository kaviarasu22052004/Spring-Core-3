package SpringFrameWork.Ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
        Book b = (Book) con.getBean("b1");
        System.out.println(b.toString());
    }
}
