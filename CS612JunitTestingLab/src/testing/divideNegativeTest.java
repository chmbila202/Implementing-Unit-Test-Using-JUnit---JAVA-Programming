package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideNegativeTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(1,0);
		assertEquals(3,output);
	}

}
