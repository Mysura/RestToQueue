package com.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	private static ClassPathXmlApplicationContext context;
    public static void main( String[] args ) throws InterruptedException
    {
    	context = new ClassPathXmlApplicationContext("camel-config.xml");
        context.start();
        Thread.sleep(1000000);
        //context.stop();
       
    }
}
