package fetchgitusers.model;

import java.util.ArrayList;
import java.util.List;

public class GitFetchRecord {
	
	private ArrayList<GitUser> gitUsers;
	
	private static GitFetchRecord gitFetchRecord = null;
	
	private GitFetchRecord(){
		gitUsers= new ArrayList<GitUser>();
	}
	
	public static GitFetchRecord getInstance(){
		if(gitFetchRecord == null){
			gitFetchRecord = new GitFetchRecord();
			return gitFetchRecord;
		} else{
			return gitFetchRecord;
		}
	}
	
	public ArrayList<GitUser> getUsers(){
		return gitUsers;
	}

}
