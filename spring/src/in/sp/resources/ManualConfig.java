package in.sp.resources;

import in.sp.beans.Address;
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
    //   s.setAddress(address());
        return s;
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
