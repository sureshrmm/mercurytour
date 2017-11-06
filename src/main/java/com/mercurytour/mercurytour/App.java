package com.mercurytour.mercurytour;

import org.junit.Test;
import org.junit.runner.JUnitCore;

//import org.junit.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws Throwable {
		System.out.println("Executable jar....");
		JUnitCore.main("com.mercurytour.MercuryTourRunner");
		//String[] ars = {"com.mercurytour.MercuryTourRunner"};
		//cucumber.api.cli.Main.main(ars);
	}
	
	
	@Test
	public void test() {
		System.out.println("Test Execution............");
	}

}
