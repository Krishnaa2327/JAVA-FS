// Day-1 Assignment

package com.mmcoe.AlfaBeta;
public class Test
{
    public static void main(String[] args)
    {
        // Object Creation
        Alfa a = new Alfa();
        a.demo();
        System.out.println("--------------------");

        // Inheritance
        Beta b = new Beta();
        b.demo();
        b.test();
        System.out.println("--------------------");

        // Upcasting
        Alfa ab = b;
        ab.demo();
//      ab.test(); error as no test method in Alfa 
        System.out.println("--------------------");


        // Downcasting
        Beta bt = (Beta)ab; //converting ab to beta to access test method 
        bt.test();
        System.out.println("--------------------");


        // Overriding
        Alfa x = new Beta();
        x.demo();
    }
}