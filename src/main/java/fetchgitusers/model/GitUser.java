package fetchgitusers.model;

import java.util.ArrayList;

public class GitUser {

	private String userName;
	
	private int usersid;
	
	private ArrayList<String> repositories;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUsersid() {
		return usersid;
	}

	public void setUsersid(int usersid) {
		this.usersid = usersid;
	}

	public ArrayList<String> getRepositories() {
		return repositories;
	}

	public void setRepositories(ArrayList<String> repositories) {
		this.repositories = repositories;
	}
	
	

	
	
}
