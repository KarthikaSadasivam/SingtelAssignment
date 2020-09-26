package com.assignment.service;

import java.util.ArrayList;
import java.util.List;

import com.assignment.utils.AnimalCharacters;

public class Bird extends Animal {
	
	@Override
	public void walk(){
		System.out.println("I am walking");
	}
	
	public void fly(){
		System.out.println("I am flying");
	}
	
	public void sing(){
		System.out.println("I am singing");
	
	}
	
	
	public static void main(String args[]){
		//Second Question Answer
		System.out.println("Duck Says-->"+AnimalCharacters.doGetSound("duck"));
		System.out.println("Duck Says-->"+AnimalCharacters.doGetAction("duck"));
		System.out.println("Chicken Says-->"+AnimalCharacters.doGetSound("chicken"));
		System.out.println("Chicken Says-->"+AnimalCharacters.doGetAction("chicken"));
		
		
		getRoosterBehaviour();
		getParrotChangedBehaviour();
		
		
	}
	//Modelling a Rooster
	public static void getRoosterBehaviour(){
		//Third Question Answer(Without Inheritance Concept)
				System.out.println("Rooster Says-->"+AnimalCharacters.doGetSound("rooster"));
				
				List<String> doGetRelationList=new ArrayList<String>();
				doGetRelationList=AnimalCharacters.getRelationShip("chicken", "rooster");
				
				doGetRelationList.forEach(animal->
				{
					System.out.println("Chicken and Rooster Has "+animal);
				});
	}
	
	//Modeling a Parrot
	public static void getParrotChangedBehaviour(){
		System.out.println("A parrot living with dogs says:"+AnimalCharacters.doGetSound("dog"));
		System.out.println("A parrot living with cat says:"+AnimalCharacters.doGetSound("cat"));
		System.out.println("A parrot living near the rooster says: "+AnimalCharacters.doGetSound("rooster"));
		/*The parrot object is already maintanable as,
		We can inherit the character of the another animal which it lives with gives desired output*/
		System.out.println("A parrot living with Duck says:"+AnimalCharacters.doGetSound("duck"));
		System.out.println("A parrot living near the Phone says: "+AnimalCharacters.doGetSound("phone"));
		   
	}
	
	
}
