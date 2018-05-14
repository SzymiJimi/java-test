package pl.sii.eu.test;

import org.junit.jupiter.api.Test;
import pl.sii.eu.UpperCaseCheckerImpl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UpperCaseCheckerTest {

    @Test
    public void testUpperCaseChecker(){
        UpperCaseCheckerImpl upperCaseChecker= new UpperCaseCheckerImpl();
        assertTrue( upperCaseChecker.hasUpperCaseLetters("Witam, pozdrawiam"));
        assertFalse( upperCaseChecker.hasUpperCaseLetters("witam, pozdrawiam"));
    }

}
