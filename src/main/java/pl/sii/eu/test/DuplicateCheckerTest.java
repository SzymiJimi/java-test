package pl.sii.eu.test;

import org.junit.jupiter.api.Test;
import pl.sii.eu.DuplicateCheckerImpl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DuplicateCheckerTest {

    @Test
    public void testDuplicateChecker(){
        DuplicateCheckerImpl duplicateChecker = new DuplicateCheckerImpl();
        assertTrue(duplicateChecker.hasDuplicateCharacters("ASDFG asdh      erA"));
        assertFalse(duplicateChecker.hasDuplicateCharacters("ASDFG asdh      erg"));
    }

}
