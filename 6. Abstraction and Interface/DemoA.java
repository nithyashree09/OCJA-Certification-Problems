package com.abstractionAndInterface;

abstract class Car{

 	abstract void door();
 	abstract void glass();
}

class Benz extends Car
{
 	void door() 
 	{ 
  		System.out.println("  Benz door");    
 	}
 	void glass() 
 	{ 
  		System.out.println("  Benz glass");    
 	}
}
public class DemoA
{
 	public static void main(String aa[])
 	{
  		Car ob1=new Benz();
  		ob1.door();
  		ob1.glass();
 	}
}
