import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_rotate_right_one_time() {
		PlanetExplorer pe = new PlanetExplorer(3,3,null);
		
		assertEquals("Greska", "(0,0,e)", pe.executeCommand("r"));
	}
	
	
	@Test
	public void test_rotate_right_two_times() {
		PlanetExplorer pe = new PlanetExplorer(3,3,null);
		
		pe.executeCommand("r");
		assertEquals("Greska", "(0,0,s)", pe.executeCommand("r"));
	}
	
	@Test
	public void test_rotate_right_three_times() {
		PlanetExplorer pe = new PlanetExplorer(3,3,null);
		
		pe.executeCommand("r");
		pe.executeCommand("r");
		assertEquals("Greska", "(0,0,w)", pe.executeCommand("r"));
	}
	
	@Test
	public void test_rotate_right_four_times() {
		PlanetExplorer pe = new PlanetExplorer(3,3,null);
		
		pe.executeCommand("r");
		pe.executeCommand("r");
		pe.executeCommand("r");
		assertEquals("Greska", "(0,0,n)", pe.executeCommand("r"));
	}
	
	
	@Test
	public void test_rotate_left_one_time() {
		PlanetExplorer pe = new PlanetExplorer(3,3,null);
		
		assertEquals("Greska", "(0,0,w)", pe.executeCommand("l"));
	}
	
	@Test
	public void test_rotate_left_two_times() {
		PlanetExplorer pe = new PlanetExplorer(3,3,null);
		
		pe.executeCommand("l");
		assertEquals("Greska", "(0,0,s)", pe.executeCommand("l"));
	}
	
	@Test
	public void test_rotate_left_three_times() {
		PlanetExplorer pe = new PlanetExplorer(3,3,null);
		
		pe.executeCommand("l");
		pe.executeCommand("l");
		assertEquals("Greska", "(0,0,e)", pe.executeCommand("l"));
	}
	
	
	@Test
	public void test_rotate_left_four_times() {
		PlanetExplorer pe = new PlanetExplorer(3,3,null);
		
		pe.executeCommand("l");
		pe.executeCommand("l");
		pe.executeCommand("l");
		assertEquals("Greska", "(0,0,n)", pe.executeCommand("l"));
	}
	
	@Test
	public void test_forward_north(){
		PlanetExplorer pe = new PlanetExplorer(3,3,null);
		
		assertEquals("Greska", "(0,0,n)", pe.executeCommand("f"));
		
	}
	
}
