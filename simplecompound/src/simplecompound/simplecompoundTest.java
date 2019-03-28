package simplecompound;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class simplecompoundTest {

	@Test
	void simplecompound() {
		Simplecompound obj=new Simplecompound();
		assertEquals(625.0,obj.si(5000, 2.5, 5));
		assertEquals(5253.125,obj.ci(5000, 2.5, 2));
		
		
	}
	
	

}
