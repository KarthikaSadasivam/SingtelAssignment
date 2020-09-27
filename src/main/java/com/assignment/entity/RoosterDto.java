package com.assignment.entity;





public class RoosterDto {
	

	private ChickenDto chicken=new ChickenDto();

	private String sound="Cock-a-doodle-doo";

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public ChickenDto getChicken() {
		return chicken;
	}

	public void setChicken(ChickenDto chicken) {
		this.chicken = chicken;
	}
}
