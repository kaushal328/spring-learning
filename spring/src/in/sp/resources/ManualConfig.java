package in.sp.resources;

import in.sp.beans.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ManualConfig {
	@Bean
	public Students std() {
        Students s = new Students();
        s.setName("kaushal");
        s.setRollno(2222222);
        s.setEmail("panchalkaushal636@gmail.com");
        return s;
    }

}
