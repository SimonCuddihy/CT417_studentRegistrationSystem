import com.mycompany.ct417_studentregistrationsystem.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.*;

/**
 *
 * @author Simon
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testGetUsername() {
        DateTime DOB = new DateTime(1993, 11, 10, 0,0,0);
        Student student = new Student("Simon Cuddihy", 24, DOB);
        
        String expected = "SimonCuddihy24@nuigalway.ie";
        String result = student.getUsername();
        assertEquals(expected, result);
        //assertEquals("Simon Cuddihy24", student.getUsername());
        
    }
}