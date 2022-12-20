package com.abstractionAndInterface;

abstract class Car1
{
 	abstract void door();
 	abstract void glass();
 	void wheel() 
 	{ 
  		System.out.println("  Wheel");    
 	}
}

class Benz1 extends Car1
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

class Lancer extends Car1
{
 	void door() 
 	{ 
  		System.out.println("  Lancer door");    
 	}
 	void glass() 
 	{ 
  		System.out.println("  Lancer glass");    
 	}
}
public class DemoB
{
 	public static void main(String aa[])
 	{
  		Car1 ob1=new Benz1();
  		ob1.door();
  		ob1.glass();
  		ob1.wheel();

  		System.out.println("=================");    
  		System.out.println("=================");    

  		Car1 ob2=new Lancer();
  		ob2.door();
  		ob2.glass();
  		ob2.wheel();
 	}
}

