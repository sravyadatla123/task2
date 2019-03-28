import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class costestimatorTest {

	@Test
	void costestimatorTest() {
		costestimator c=new costestimator();
		assertEquals(2500,c.costestimator(2,true,1));
		assertEquals(1800,c.costestimator(2, false, 1));
	}
}
