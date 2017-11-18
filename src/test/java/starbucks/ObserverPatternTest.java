


package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ObserverPatternTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ObserverPatternTest
{
    
    /**
     * Default constructor for test class ObserverPatternTest
     */
    public ObserverPatternTest()
    {  
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        // Set up Key Pad and Pin Entry Machine
        // Using Observer Pattern  
        KeyPad kp = new KeyPad();
        PinEntryMachine pem = new PinEntryMachine();
        kp.attach(pem);
        pem.registerObserver(kp);
    }


    @Test
    public void testOneKey()
    {
        // Key Pad Press 1
        kp.touch(1, 1) ;
        String D1 = pem.d1();
        // Assert D1 is "1" (replace with appropriate test)
        assertTrue( D1 == "1" ) ;
    }

    @Test
    public void testTwoKeys()
    {
        // Key Pad Press 1 and 2
        kp.touch(1, 1) ;
        kp.touch(2, 1) ;
        String D1 = pem.d1();
        String D2 = pem.d2();

        // Assert D1 and D2 are correct 
        // (replace with appropriate test)
        assertTrue( D1 == "1" && D2 == "2") ;
    }

    @Test
    public void testThreeKeys()
    {
        // Key Pad Press 1, 2 and 3
        kp.touch(1, 1) ;
        kp.touch(2, 1) ;
        kp.touch(3, 1) ;
        String D1 = pem.d1();
        String D2 = pem.d2();  
        String D3 = pem.d3();        
        // Assert D1, D2 and D3 are correct
        // (replace with appropriate test)
        assertTrue( D1 == "1" && D2 == "2" && D3 == "3" ) ;
     }

    @Test
    public void testFourKeys()
    {
        // Key Pad Press 1, 2, 3 and 4
        kp.touch(1, 1) ;
        kp.touch(2, 1) ;
        kp.touch(3, 1) ;
        
        String D1 = pem.d1();
        String D2 = pem.d2();  
        String D3 = pem.d3(); 
        String D4 = pem.d4(); 
        // Assert D1, D2, D3 and D4 are correct
        // (replace with appropriate test)
        assertTrue( D1 == "1" && D2 == "2" && D3 == "3" && D4 == "4" ) ;
    }

   @Test
    public void testBackspace()
    {
        // Key Pad Press 1, 2, 3 and 4
        kp.touch(1, 1) ;
        kp.touch(2, 1) ;
        kp.touch(3, 1) ;
        kp.touch(1, 2) ;

        // Assert D1, D2, D3, D4 are correct
        // (replace with appropriate test)
        assertTrue( D1 == "1" && D2 == "2" && D3 == "3" && D4 == "4" ) ;

        // Key Pad Press 1, 2, 3 and 4 and then backspace
        kp.touch(1, 1) ;
        kp.touch(2, 1) ;
        kp.touch(3, 1) ;
        p.touch(1, 2) ;
        pem.backspace();
        // Assert D1, D2, D3, D4 are correct
        // (replace with appropriate test)
        assertTrue( D1 == "1" && D2 == "2" && D3 == "3" && D4 == "" ) ;        

    }
    


    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
