package com.assignment.controller;



import com.assignment.entity.ChickenDto;
import com.assignment.entity.DuckDto;
import com.assignment.entity.ParrotDto;
import com.assignment.entity.RoosterDto;
import com.assignment.service.Bird;
import com.assignment.service.Fish;

public class Solution {

	public static void main(String[] args) {
		
		//Answer A(1).
		 Bird bird = new Bird();         
		 bird.canWalk();        
		 bird.fly();         
		 bird.sing(); 
		 
		 
		 //Answer A(2).(Duck It has its sound property and implemented Swimmable Interface)
		 DuckDto duck= new DuckDto();
		 duck.getSound();
		 duck.canswim();
		 ChickenDto chicken=new ChickenDto();
		 System.out.println("Chicken says:"+chicken.getSound());
		 chicken.cannotFly("chicken");
		 
		 //Answer A(3) (model a rooster without inheritance,Rooster has a properties of Chicken)
		 RoosterDto rooster=new RoosterDto();
		 System.out.println("Rooster says:"+rooster.getSound());
		 rooster.getChicken().cannotFly("rooster");//(Rooster "has a" or "uses a"  Relationship with chicken Class)
		 
		 //Answer A(4) model a parrot
		 ParrotDto parrot=new  ParrotDto();//This parrot class all the properties of Dog,Cat,Rooster,Duck and Phone
		 String parrotLivingWithDog=parrot.getDog().getSound();
		 String parrotLivingWithCat=parrot.getCat().getSound();
		 String parrotLivesNearRooster=parrot.getRooster().getSound();
		 String parrotNearDuck=parrot.getDuck().getSound();
		 String parrotNearPhone=parrot.getPhone().getSound();
		 System.out.println("parrot Living With Dog Says: "+parrotLivingWithDog);
		 System.out.println("parrot Living With Cat Says: "+parrotLivingWithCat);
		 System.out.println("parrot Lives Near Rooster Says: "+parrotLivesNearRooster);
		 System.out.println("parrot Near Duck Says: "+parrotNearDuck);
		 System.out.println("parrot Near Phone Says: "+parrotNearPhone);
		 
		 //B(1)
		 Fish fish=new Fish();
		 fish.cannotSing();
		 fish.cannotWalk();;
		 fish.canswim();
	}

}
