package com.assignment.service;

public class Solution {
	
	public static void main(String args[]){
		Bird bird = new Bird();
		bird.canWalk();
		bird.fly();
		/**
		 * The method sing() is undefined for the type Bird,
		 * so we have to implement sing() method either in super Animal or Bird subclass
		 * I'm adding sing() method in Bird class as it is most related characteristic of Bird.
		 * */
		//bird.sing();
		
	}

}
