package ac.za.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class AssessmentTest {

    private  Assessment evaluate;



    @Before
    public void setUp() throws Exception {

         evaluate = new Assessment();
    }

    @After
    public void tearDown() throws Exception {
    }

//Equality Assertion test
    @Test
    public void testDetails() {

        assertEquals("Incorrect", "Nzawou, Armel", evaluate.Details());
    }


    @Test
    public void testClassGroup() {

       assertSame(error, evaluate.classGroup(personOne), evaluate.classGroup(personTwo));
    }
}