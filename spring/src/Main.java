import in.sp.beans.Students;
import in.sp.resources.ManualConfig;
import org.apache.commons.logging.Log;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;


public class Main {


    @Configuration
    static class test {
        @Bean
        public String n1() {
            return "hello";
        }

        @Bean
        public int n2(){
            return 12;
        }

        @Bean
        public String add(){
            return "XYZ A1 to A2";
        }
    }
    @Component
    @ComponentScan("in.sp.beans.Students")
    static class HelloService {
        public String sayHello() {
            return "Hello, Spring!";
        }
    }


    public static void main(String[] args) throws Exception {
    	//ApplicationContext context = new ClassPathXmlApplicationContext(ManualConfig.class);
    	//System.out.append(std.toString());
                try {
                    ApplicationContext context = new AnnotationConfigApplicationContext(HelloService.class);
                    System.out.println(context.sayHello());
                    Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }


        

    }
}