package ro.ase.csi.cts.testare.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csi.cts.testare.modele.Student;
import ro.ase.csi.cts.testare.exceptii.ExceptieNume;
import ro.ase.csi.cts.testare.exceptii.ExceptieVarsta;
import ro.ase.csi.cts.testare.modele.Student;

public class TestStudent {
	
	static Student student;
	static ArrayList<Integer> note;
	static String numeInitial="Gigel";
	static int varstaInitiala=21;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception { //cream lista de note o sg data 
		note=new ArrayList<>();
		note.add(9);
		note.add(10);
		note.add(8);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception { //destructor logic 
	}

	@Before
	public void setUp() throws Exception { //studentul este recreat inainte de fiecare unit test
		student=new Student(numeInitial, varstaInitiala, note);
	}

	@After
	public void tearDown() throws Exception {
		student=null; //fortam stergerea studentului 
	}

	//Ignore - adnotare fol pentru dezactivarea testului (apare ca skipped)
	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetVarstaValoriNormaleRight() throws ExceptieVarsta { //tratare excp cu throws, mai clean
		//int varstaNoua=22;
		int varstaNoua=Student.MIN_VARSTA+1;
		student.setVarsta(varstaNoua);
		assertEquals("Testare cu valori ok",varstaNoua, student.getVarsta());
	}
	
	@Test
	public void testSetNumeRight() throws ExceptieNume { //tratare exceptie cu try catch
		
		String numeNou="Marcel";
		student.setNume(numeNou);
		assertEquals("Testare cu valori corecte",numeNou, student.getNume());
	}
	
	@Test
	public void testSetVarstaErrorConditionsValoriNegative() throws ExceptieVarsta{ //tratare excp dorita JUnit3
		int varstaNoua=-100;
		student.setVarsta(varstaNoua);
		fail("Nu am primit excp pt varsta cu valori negative");
	}
	
	@Test(expected = ExceptieVarsta.class) //tratare excp dorita Junit4, practic isi genereaza el try catch
	public void testSetVarstaErrorConditionsValoriMari() throws ExceptieVarsta { 
		int varstaNoua=Student.MAX_VARSTA+100;
		student.setVarsta(varstaNoua);
	}
}
