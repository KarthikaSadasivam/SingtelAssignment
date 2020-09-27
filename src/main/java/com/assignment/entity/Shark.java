package com.assignment.entity;

import com.assignment.service.Fish;

public class Shark extends Fish{
	
	public void habit() {
		System.out.println("Shark Eat Other Fish");
	}
	
	@Override
	public void setFishSize(String fishSize) {
		// TODO Auto-generated method stub
		super.setFishSize("Large");
	}
	
	@Override
	public void setFishColor(String fishColor) {
		// TODO Auto-generated method stub
		super.setFishColor("Grey");
	}
	
	
	
	
}
