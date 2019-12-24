package xyz.miguelsimoni.designpattern.creational.singleton;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple Singleton.
 */
public class SingletonTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        assertTrue( s1 == s2 );
    }
}
