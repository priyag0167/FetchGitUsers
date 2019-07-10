package fetchgitusers.main;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import fetchgitusers.controller.GitController;


@SpringBootApplication(scanBasePackages="fetchgitusers.*")
public class GitMain implements CommandLineRunner{
	
	private static final Logger logger = LoggerFactory.getLogger(GitMain.class);
	
	@Autowired	
    GitController controller;
	
	public static void main(String[] args)  {
	 
		SpringApplication.run(GitMain.class, args);		
		System.out.println("------------- End -------------");
	}
	
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------- Start -------------");
		System.out.println("Please enter username to fetch Gitlab and GitHUb user projects");
		String name = sc.nextLine();
		controller.getListOfRepository(name);
	}
}
