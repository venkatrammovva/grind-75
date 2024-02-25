package sol_015_ransom_note;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    RansomNote ransomNote = new RansomNote();

    @Test
    public void test1() {
        assertFalse(ransomNote.canConstruct("a", "b"));
        assertFalse(ransomNote.canConstruct("aa", "ab"));
        assertTrue(ransomNote.canConstruct("aa", "aab"));
    }

}