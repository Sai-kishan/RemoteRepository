package myPack;

import org.testng.annotations.Test;

public class SeleniumParallelTest1 
{
	@Test(description="test1")
	public void test1()
	{
		System.out.println("I am inside test1");		
	}

	@Test(description="test2")
	public void test2()
	{
		System.out.println("I am inside test2");		
	}

	@Test(description="test3")
	public void test3()
	{
		System.out.println("I am inside test3");		
	}

}
