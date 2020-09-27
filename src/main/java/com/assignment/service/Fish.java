package com.assignment.service;

import com.assignment.interfaces.Swimmable;

public class Fish implements Swimmable{

	private String fishSize;
	private String fishColor;
	
	@Override
	public void canswim() {
		// TODO Auto-generated method stub
		System.out.println("Fishes Can Swim");
	}
	
	public void cannotSing(){
		System.out.println("Fishes Cannot Sing");
	}

	public void cannotWalk(){
		System.out.println("Fishes dont walk");
	}
	
	public void habit(){
		
	}
	

	public String getFishSize() {
		return fishSize;
	}

	public void setFishSize(String fishSize) {
		this.fishSize = fishSize;
	}

	public String getFishColor() {
		return fishColor;
	}

	public void setFishColor(String fishColor) {
		this.fishColor = fishColor;
	}
}
