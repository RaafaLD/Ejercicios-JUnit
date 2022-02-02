package es.iessoterohernandez.daw.endes.E2JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SerieTest {

	static Serie s1;
	static Serie s2;
	static Serie s3;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s1 = new Serie("Peaky Blinders", 5, "Drama", "Netflix");
        s2 = new Serie("Dark", 3, "Suspense", "Netflix");
        s3 = new Serie("Halo", 1, "Accion", "Paramount+");		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSetTitulo() {
		s1.setTitulo("Peaky Blinders");
        assertEquals("Peaky Blinders", s1.getTitulo());
	}

	@Test
	void testSetnumeroTemporadas() {
        s2.setnumeroTemporadas(3);
        assertEquals(3, s2.getnumeroTemporadas());
	}
	
	@Test
	void testSetGenero() {
		s1.setGenero("Drama");
        assertEquals("Drama", s1.getGenero());
	}
	
	@Test
	void testSetcreador() {
		s2.setcreador("Netflix");
        assertEquals("Netflix", s2.getcreador());
	}
	
	@Test
	void testCompareTo() {
		assertEquals(Serie.MENOR, s3.compareTo(s2));
        assertEquals(Serie.MAYOR, s2.compareTo(s3));
        assertEquals(Serie.IGUAL, s1.compareTo(s3));
	}
}