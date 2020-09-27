package com.assignment.service;

import com.assignment.interfaces.Metamorphosable;

public class Metamorphosis implements Metamorphosable{

	

	@Override
	public Butterfly undergoMetamorphosis(CaterPillar ctr) {
		// TODO Auto-generated method stub
		return new Butterfly();
	}
}
