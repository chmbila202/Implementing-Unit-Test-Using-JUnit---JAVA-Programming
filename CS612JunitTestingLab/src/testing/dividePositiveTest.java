package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class dividePositiveTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(12,4);
		assertEquals(3,output);
	}

}
