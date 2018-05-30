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
	
	@Test
	public void test134() {
		assertFalse(list1.equals(new Integer(0)));
	}
	
	@Test
	public void test135678() {
		list1.add("a");
		list2.add("b");
		assertFalse(list1.equals(list2));
	}
	
	@Test
	public void test13561910() {
		list1.add("Hola mundo");
		list2.add("Hola mundo");
		assertTrue(list1.equals(list2));
	}
}
