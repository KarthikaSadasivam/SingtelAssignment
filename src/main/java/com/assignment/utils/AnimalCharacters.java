package com.assignment.utils;

import java.util.ArrayList;
import java.util.List;

public enum AnimalCharacters {
	   
	duck("Quack ,Quack" ,"Swim","duck","bird"),
    chicken("Cluck, cluck","Walk","chicken","bird"),	 
	rooster("Cock-a-doodle-doo","Walk","rooster","bird"),
	parrot("Chip Chip","Fly","parrot","bird"),
	dog("Woof, woof","walk","dog","animal"),
	cat("Meow","walk","cat","animal"),
	phone("Tring tring","entertain","phone","device");
			  
    private final String sound;
    private final String action;
    private final String name;
    private final String species;
    
   

	private AnimalCharacters(String sound,String action,String name,String species) {
		this.sound = sound;
		this.action = action;
		this.name=name;
		this.species=species;
		
	}
 
	public static String doGetSound(String name)
	{
		String sounds="";
		for(AnimalCharacters animal:AnimalCharacters.values())
		{
			if(animal.getName().equals(name))
			{
				sounds=animal.getSound();
				break;
			}
		}
		return sounds;
	}

	public static String doGetAction(String name)
	{
		String action="";
		for(AnimalCharacters animal:AnimalCharacters.values())
		{
			if(animal.getName().equals(name))
			{
				action=animal.getAction();
				break;
			}
		}
		return action;
	}
	
	public static String doGetSpecies(String name)
	{
		String species="";
		for(AnimalCharacters animal:AnimalCharacters.values())
		{
			if(animal.getName().equals(name))
			{
				species=animal.getSpecies();
				break;
			}
		}
		return species;
	}
	
	public static List<String> getRelationShip(String name1,String name2)
	{
		List<String> relationship=new ArrayList<String>();
		
			if(doGetSound(name1).equalsIgnoreCase(doGetSound(name2))){
				relationship.add("Sound");
			}
			if(doGetAction(name1).equalsIgnoreCase(doGetAction(name2))){
				relationship.add("Movement Behaviour");
			}
			if(doGetSpecies(name1).equalsIgnoreCase(doGetSpecies(name2))){
				relationship.add("Species");
			}
			
		System.out.println("relationship->"+relationship.size());
		return relationship;
	}
	
	
	

	public String getSound() {
		return sound;
	}

	public String getAction() {
		return action;
	}

	public String getName() {
		return name;
	}

	public String getSpecies() {
		return species;
	}

	

	
	
}
