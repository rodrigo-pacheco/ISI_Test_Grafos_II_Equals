package equals;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class equalsTest {
	
	List<String> list1;
	List<String> list2;

	@Before
	public void setUp() throws Exception {
		list1 = new ArrayList<String>();
		list2 = new ArrayList<String>();
	}
	
	//	Node Coverage
	
	@Test
	public void test12() {
		assertTrue(list1.equals(list1));
	}

}
