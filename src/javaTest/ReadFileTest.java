package javaTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReadFileTest {

	ReadFile reader1 = new ReadFile();
	
	@Test
	public void testFilereader() {
		assertEquals("yep-yep-yep--some-test-here-", reader1.fileReader("test.txt"));
	}

}
