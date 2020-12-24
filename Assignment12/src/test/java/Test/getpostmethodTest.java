package Test;

import org.testng.annotations.Test;

import Base.baseclass;

public class getpostmethodTest {
	
	@Test
	public void testFirst()
	{
		baseclass.get();
	}
	@Test
	public void testSecond()
	{
		baseclass.get1();
	}
 
	@Test
	public void testThird()
	{
		baseclass.post();
	}
}