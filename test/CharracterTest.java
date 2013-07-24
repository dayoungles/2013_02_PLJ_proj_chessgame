import junit.framework.TestCase;


public class CharracterTest extends TestCase {
	public void testWhitespace() throws Exception {
		assertEquals(true, Character.isWhitespace('\n') );
		assertEquals(true, Character.isWhitespace('\t'));
		assertEquals(true, Character.isWhitespace(' '));
	}
	public void testIdentifier() throws Exception {
		assertEquals(false, Character.isJavaIdentifierPart('^'));
		assertEquals(false, Character.isJavaIdentifierPart('@'));
	}
}
