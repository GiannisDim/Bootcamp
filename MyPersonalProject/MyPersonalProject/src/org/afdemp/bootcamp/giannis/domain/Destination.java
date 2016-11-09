package org.afdemp.bootcamp.giannis.domain;

public class Destination {
	
	private int id;
	private String name;
	private int vote;
	
	public Destination(){
		
	}
	
	public Destination(String name, int vote){
		
		this.name = name;
		this.vote = vote;
			
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}
	
	

}
