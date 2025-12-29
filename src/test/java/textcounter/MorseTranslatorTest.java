package textcounter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MorseTranslatorTest {

    @Test
    void testTextToMorse_HEJ() {
        MorseTranslator t = new MorseTranslator();
        assertEquals(".... . .---", t.textToMorse("HEJ"));
    }

    @Test
    void testMorseToText_HEJ() {
        MorseTranslator t = new MorseTranslator();
        assertEquals("HEJ", t.morseToText(".... . .---"));
    }

    @Test
    void testTextToMorse_singleLetter_A() {
        MorseTranslator t = new MorseTranslator();
        assertEquals(".-", t.textToMorse("A"));
    }

    @Test
    void testTextToMorse_lowercaseWorks() {
        MorseTranslator t = new MorseTranslator();
        assertEquals(".... . .---", t.textToMorse("hej"));
    }

    @Test
    void testTextToMorse_invalidCharacter_throws() {
        MorseTranslator t = new MorseTranslator();
        assertThrows(IllegalArgumentException.class, () -> t.textToMorse("HELLO!"));
    }
}
