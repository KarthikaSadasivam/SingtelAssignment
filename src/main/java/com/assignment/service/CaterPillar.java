package com.assignment.service;

import com.assignment.interfaces.Metamorphosable;

public class CaterPillar implements Metamorphosable{
	
	
	Metamorphosis metamorph;
	
	 

	@Override
	public Butterfly undergoMetamorphosis(CaterPillar ctr) {
		// TODO Auto-generated method stub
		return metamorph.undergoMetamorphosis(this);
	}
	
	public void canWalk(){
		
	}
	
	public void canNotFly(){
		
	}

}
