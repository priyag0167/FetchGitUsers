package fetchgitusers.model;

import java.util.ArrayList;

public class GitRepository {
	
	private String name;
	
	private ArrayList<String> listOfRepository;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<String> getListOfRepository() {
		return listOfRepository;
	}

	public void setListOfRepository(ArrayList<String> listOfRepository) {
		this.listOfRepository = listOfRepository;
	}
	
	public ArrayList<String> addListOfRepo(String name){
		this.listOfRepository.add(name);
		return listOfRepository;
	}
	
}
