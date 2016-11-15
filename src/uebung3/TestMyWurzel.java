package uebung3;

import org.junit.Assert;
import org.junit.Test;

public class TestMyWurzel {
	
	@Test
	public void testMyWurzel() {
		Assert.assertEquals("Die Wurzel aus 9 ist 3", MyWurzel.sqrt(5));
	}

}
