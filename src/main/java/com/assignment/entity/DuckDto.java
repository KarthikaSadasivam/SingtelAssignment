package com.assignment.entity;

import com.assignment.interfaces.Swimmable;

public  class DuckDto implements Swimmable{
	private String sound="Quack Quack";

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	@Override
	public void canswim() {
		// TODO Auto-generated method stub
		System.out.println("A duck can swim");
	}

	
}
