package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Students {
			@Value("kaushal")
			private String name;
			@Value("2500220")
			private int rollno;
			@Value("panchalkaushal636@gmail.com")
			private String email;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getRollno() {
				return rollno;
			}
			public void setRollno(int rollno) {
				this.rollno = rollno;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			@Override
			public String toString() {
				return "Students [name=" + name + ","
						+ " rollno=" + rollno + ", "
								+ "email=" + email + "]";
			}
}
