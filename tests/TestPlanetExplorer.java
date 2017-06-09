import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_rotate_right() {
		PlanetExplorer pe = new PlanetExplorer(3,3,null);
		
		assertEquals("Greska", "(0,0,n)", pe.executeCommand("r"));
	}
}
