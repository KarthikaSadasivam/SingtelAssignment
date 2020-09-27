package com.assignment.entity;

import com.assignment.service.Fish;

public class ClownFish extends Fish{
	
	public void habit() {
		System.out.println("Clown Fish Make Jokes");
	}
	
	@Override
	public void setFishSize(String fishSize) {
		// TODO Auto-generated method stub
		super.setFishSize("Small");
	}
	
	@Override
	public void setFishColor(String fishColor) {
		// TODO Auto-generated method stub
		super.setFishColor("Orange");
	}
}
