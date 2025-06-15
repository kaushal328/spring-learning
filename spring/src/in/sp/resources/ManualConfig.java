package in.sp.resources;

import in.sp.beans.Address;
import in.sp.beans.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ManualConfig {
	@Bean(name = "bean1")
    @Primary
	public Students std() {
        Students s = new Students();
        s.setName("kaushal");
        s.setRollno(2222222);
        s.setEmail("panchalkaushal636@gmail.com");
    //   s.setAddress(address());
        return s;
    }
    @Bean
    @Qualifier("address ")
    public String name(){
        return "kaushal";
    }
    @Bean
    public int rollNo(){
        return 20250610;
    }
    @Bean
    public String email(){
        return "pkaushal232@gmail.com";
    }



    @Bean
    public Address address(){
        Address address = new Address();
        address.setHomeName("Gopikrishna Nagar");
        address.setPincode(45888);
        address.setPhoneNo("7045724778");
        return address;
    }




}
