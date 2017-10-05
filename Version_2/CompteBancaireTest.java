package comptebancaire;
import org.junit.*;
import static org.junit.Assert.*;

public class CompteBancaireTest {

	
	
	@Test
	public void consulter_solde(int solde)
	{
		
		CompteBancaire cb = new CompteBancaire(1000);
		assertTrue("solde negatif",cb.consulter_solde(500)=='solde negatif');
	}

	
	
	
	
	
}
