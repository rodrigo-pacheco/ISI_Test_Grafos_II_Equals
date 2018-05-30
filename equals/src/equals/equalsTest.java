package equals;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class equalsTest {
	List<String> list1;
	List<String> list2;

	@Before
	public void setUp() throws Exception {
		list1 = new ArrayList<String>();
		list2 = new ArrayList<String>();
	}
	
	// Apartado 3 - Node Coverage
	
	@Test
	void test12() {
		assertTrue(list1.equals(list1));
	}
	
	

}
