package com.assignment.entity;

import com.assignment.service.Bird;

public  class ChickenDto extends Bird {
	private String sound="Cluck Cluck";
	

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	

	@Override
	public void cannotFly(String name) {
		// TODO Auto-generated method stub
		System.out.println("A "+name +"cannot fly beacause its wings are clipped ");
	}

	
}
