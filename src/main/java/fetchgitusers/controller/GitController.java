package fetchgitusers.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import fetchgitusers.model.GitRepository;


@RestController
public class GitController  {	
	
	private final String gitHubUrl ;
	
	private final String gitLabUrl;
	
	@Autowired
	public GitController(@Value("${github.source.url}") final String url1,@Value("${gitlab.source.url}") final String url2)
	{
		this.gitHubUrl=url1;
		this.gitLabUrl=url2;
	}
	
	@RequestMapping(produces=MediaType.ALL_VALUE)
	@ResponseBody
		public void getListOfRepository(final String userName){
    	if(userName!=null){ 
		RestTemplate restTemplate = new RestTemplate();
    	 GitRepository[] repo1 ={};
    	 GitRepository[] repo2 ={};
		try {
			repo1 = restTemplate.getForObject(gitHubUrl.concat(userName).concat("/repos"), GitRepository[].class);
			repo2 = restTemplate.getForObject(gitLabUrl.concat(userName).concat("/projects"), GitRepository[].class);
			System.out.println(gitLabUrl.concat(userName).concat("/projects"));
		} catch (RestClientException e) {
			e.printStackTrace();
		}
    	 ArrayList<String> projectsOfGitHub = new ArrayList<String>();
    	 ArrayList<String> projectsOfGitLab = new ArrayList<String>();
    	 for(int i=0;i<repo1.length;i++){
    		projectsOfGitHub.add(repo1[i].getName());
    	  } 
    	 for(int i=0;i<repo2.length;i++){
     		projectsOfGitLab.add(repo2[i].getName());
     	  }
    	     	System.out.println("Repositories on GitHub for user "+ userName + " are " + projectsOfGitHub.toString());
    	     	System.out.println("Repositories on GitLab for user "+ userName + " are " + projectsOfGitLab.toString());
     }else{
    	 System.out.println("Username was not valid.");
     }
	}
	}


