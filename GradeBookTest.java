import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class GradeBookTest {

	private GradeBook safe1 , safe2;
	
	@BeforeEach
	void setUp() throws Exception {
		safe1 = new GradeBook(5);
		safe2 = new GradeBook(5);
		safe1.addScore(33);
		safe1.addScore(47);
		safe2.addScore(49);
		safe2.addScore(43);
		safe2.addScore(0);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		safe1 = null;
		safe2 = null;
	}
	
	@Test
	void testaddScore() 
	{
		assertTrue( safe2.toString().equals("49.0 43.0 0.0 "));
		assertEquals(3, safe2.getScoreSize());
		
		assertTrue( safe1.toString().equals("33.0 47.0 "));
		assertEquals(2, safe1.getScoreSize());
	}

	@Test
	void testSum() 
	{
		assertEquals(80, safe1.sum(), .0001);
		assertEquals(92, safe2.sum(), .0001);
	}

	@Test
	void testMinimum() 
	{
		assertEquals(33, safe1.minimum(), .001);
		assertEquals(0, safe2.minimum(), .001);
	}

	@Test
	void testFinalScore() 
	{
		assertEquals(47, safe1.finalScore(), .001);
		assertEquals(92, safe2.finalScore(), 001);
	}
}