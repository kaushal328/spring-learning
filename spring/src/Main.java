import in.sp.beans.Students;
import in.sp.resources.ManualConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
    	ApplicationContext context = new ClassPathXmlApplicationContext("in/sp/resources/applicationContext.xml");
    	//System.out.append(std.toString());
    	// ApplicationContext context = new AnnotationConfigApplicationContext(ManualConfig.class);
    	    Students std =  context.getBean("students",Students.class);
                System.out.append(std.toString());
    }
}