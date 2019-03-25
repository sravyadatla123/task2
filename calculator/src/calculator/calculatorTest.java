package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatorTest {

	@Test
	void calculatorTest() {
		calculator obj=new calculator();
		assertEquals(5,obj.add(2, 3));
		assertEquals(6,obj.multiply(2, 3));
		assertEquals(2,obj.divide(6, 3));
		assertEquals(0,obj.modulo(4, 2));
		assertEquals(3,obj.sub(6, 3));
		
		
		
	}

}
