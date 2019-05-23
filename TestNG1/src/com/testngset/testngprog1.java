package com.testngset;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngprog1 {
	@BeforeClass
	public void beforc()
	{
		System.out.println("before class");
	}
	@BeforeTest
	public void setup()
	{
		System.out.println("hello setup ");
	}
	@BeforeMethod
	public void before()
	{
		System.out.println("before method");
	}
	@Test
	public void baunch()
	{
		System.out.println("hello blaunch");
	}
	@Test
	public void aaunch1()
	{
		System.out.println("hello alauch");
	}
	@Test
	public void dlaunch()
	{
		System.out.println("hello dlauch");
	}
	@Test 
	public void claunch()
	{
		System.out.println("hello claunch");
	}
	@AfterMethod
	public void main()
	{
		System.out.println("After method");
	}
	@AfterTest
	public void tearDown()
	{
		System.out.println("hello teardown");
	}
	@AfterClass
	public void afterc()
	{
		System.out.println("after class");
	}
	

}
