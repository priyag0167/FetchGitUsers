package fetchgitusers.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"fetchgitusers"})
public class GitMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       SpringApplication.run(GitMain.class, args);
		
		System.out.println("------------- READY -------------");

	}


}
