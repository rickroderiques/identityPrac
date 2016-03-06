package com.rick.cput;

/**
 * Created by Rick on 06-Mar-16.
 */
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class identifyPracTest {

    identifyPrac animal1, animal2, animal3, animal4;

    @Before  // assigning and setting up
    public void myNames()
    {
        animal1 = new identifyPrac("Dog");
        animal2 =  new identifyPrac("Cat");

        animal3 = animal1;
    }

    @Test
    public void testIdentify() throws Exception {

        // testing if two objects are the same
            assertSame(animal1, animal3);
    }

    @Test
    public void testFailingTest() throws Exception {

        assertSame(animal2, animal3);

    }

    @Test
    public void testNull()
    {
        assertNull(animal4);
    }

    @Test
    public void testNotNull()
    {
        assertNull(animal2);
    }
}
