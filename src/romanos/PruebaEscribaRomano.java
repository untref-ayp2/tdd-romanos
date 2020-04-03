package romanos;

import org.junit.Assert;
import org.junit.Test;

public class PruebaEscribaRomano {

	private EscribaRomano escriba = new EscribaRomano();

	@Test
	public void creaElEscribaRomanoSinParametros() {
		
		new EscribaRomano();
	}

	@Test
	public void copia1ComoI() {
		
		Assert.assertEquals("I", escriba.copiar(1));
	}
	
	@Test
	public void copia2ComoII() {
		
		Assert.assertEquals("II", escriba.copiar(2));
	}

	@Test
	public void copia3ComoIII() {
		
		Assert.assertEquals("III", escriba.copiar(3));
	}

	@Test
	public void copia4ComoIV() {
		
		Assert.assertEquals("IV", escriba.copiar(4));
	}
	
	@Test
	public void copia5ComoV() {
		
		Assert.assertEquals("V", escriba.copiar(5));
	}
	
	@Test
	public void copia6ComoVI() {
		
		Assert.assertEquals("VI", escriba.copiar(6));
	}
	
	@Test
	public void copia8ComoVIII() {
		
		Assert.assertEquals("VIII", escriba.copiar(8));
	}
}


