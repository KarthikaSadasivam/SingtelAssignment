package com.assignment.entity;

public class ParrotDto {
	private String sound="Chip chip";
	private DogDto dog=new DogDto();
	private DuckDto duck=new DuckDto();
	private CatDto cat=new CatDto();
	private PhoneDto phone=new PhoneDto();
	private RoosterDto rooster=new RoosterDto();

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public DogDto getDog() {
		return dog;
	}

	public void setDog(DogDto dog) {
		this.dog = dog;
	}

	public DuckDto getDuck() {
		return duck;
	}

	public void setDuck(DuckDto duck) {
		this.duck = duck;
	}

	public CatDto getCat() {
		return cat;
	}

	public void setCat(CatDto cat) {
		this.cat = cat;
	}

	public PhoneDto getPhone() {
		return phone;
	}

	public void setPhone(PhoneDto phone) {
		this.phone = phone;
	}

	public RoosterDto getRooster() {
		return rooster;
	}

	public void setRooster(RoosterDto rooster) {
		this.rooster = rooster;
	}
}
