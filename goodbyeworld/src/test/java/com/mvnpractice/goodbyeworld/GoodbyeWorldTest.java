package com.mvnpractice.goodbyeworld;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class GoodbyeWorldTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public GoodbyeWorldTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( GoodbyeWorldTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testGoodbyeWorld()
	{
		GoodbyeWorld goodbyeWorld = new GoodbyeWorld();
		assertEquals("Goodbye World!", goodbyeWorld.getStr());
	}
}
