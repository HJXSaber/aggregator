package com.mvnpractice.goodbyeworld;

public class GoodbyeWorld 
{
    private String str;
    public GoodbyeWorld() 
    {
        str = "Goodbye World!";
    }
    public String getStr()
    {
        return str;
    }
    public static void main( String[] args )
    {
        System.out.println( new GoodbyeWorld().getStr() );
    }
}