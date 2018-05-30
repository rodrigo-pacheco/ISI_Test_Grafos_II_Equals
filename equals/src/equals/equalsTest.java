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
	
	// Nodos: 1,2	Edges: 1-2
	@Test
	public void test12() {
		assertTrue(list1.equals(list1));
	}
	
	// Nodos: 1,3,4	Edges: 1-3, 3-4
	@Test
	public void test134() {
		assertFalse(list1.equals(new Integer(0)));
	}
	
	// Nodos: 1,3,5,6,7,8	Edges: 1-3, 3-5, 5-6, 6-7, 7-8
	@Test
	public void test135678() {
		list1.add("a");
		list2.add("b");
		assertFalse(list1.equals(list2));
	}
	
	// Nodos: 1,3,5,6,7,9,6,10	Edges: 1-3, 3-5, 5-6, 6-7, 7-9, 9-6, 6-10
	@Test
	public void test13567910() {
		list1.add("Hola mundo");
		list2.add("Hola mundo");
		assertTrue(list1.equals(list2));
	}
	
	// Edge-Pair Coverage
	// Todos los Edge-Pair están cubiertos salvo el 5-6-7
	@Test
	public void test135610() {
		assertTrue(list1.equals(list2));
	}
}
