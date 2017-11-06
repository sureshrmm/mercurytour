package com.mercurytour;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

//import org.junit.Test;

/**
 * Hello world!
 *
 */
public class Testing 
{
	public static void main(String[] args) throws Throwable {
		System.out.println("Executable jar....");
		//JUnitCore.main("com.mercurytour.Testing");
		JUnitCore engine = new JUnitCore();
        //engine.addListener(new TextListener(System.out)); // required to print reports
        engine.run(MercuryTourRunner.class);
		//String[] ars = {"com.mercurytour.MercuryTourRunner"};
		//cucumber.api.cli.Main.main(ars);
	}

}

