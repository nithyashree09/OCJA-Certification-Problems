package com.inheritance;
import java.io.*;
import java.lang.*;
import java.util.*;
  
class one {
    public void print_hello()
    {
        System.out.println("Hello");
    }
}
  
class two extends one {
    public void print_welcome() { 
    	System.out.println("Welcome"); 
    	}
}

public class Demo1 {
    public static void main(String[] args)
    {
        two g = new two();
        System.out.println("Single Inheritance");
        g.print_hello();
        g.print_welcome();
        g.print_hello();
    }
}
