package com.assignment.application;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.assignment.service.Bird;


@SpringBootTest
public class SolutionTest {
	
	@Autowired
	Bird bird;
	
	@BeforeAll
	public void init(){
		
	}
	
	@Test
	public void tesWalk()
	{
		bird.walk();
	}
	
	@Test
	public void testFly()
	{
		bird.fly();
	}
	@Test
	public void testSing()
	{
		bird.sing();
	}
	


}
