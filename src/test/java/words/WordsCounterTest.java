package words;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordsCounterTest {

    private static final WordsCounter wordsCounter = new WordsCounter();


    @Test
    public void wordsCounter() {

        String voidSentence = "";
        Integer resultVoidSentence  = 0;

        String oneWordsSentence = "coucou";
        Integer resultOneWordsSentence  = 1;

        String twoWordsSentence = "Hello World";
        Integer resultTwoWordsSentence  = 2;

        String fiveWordsSentence = "C'est bientôt l'heure de manger";
        Integer resultFiveWordsSentence  = 5;

        String sixteenWordsSentence = "Le Kotlin, c'est pas trop mal comme langage, et c'est même plus stylé que le Java";
        Integer resultSixteenWordsSentence  = 16;

        assertEquals("Should find 0 words in " + voidSentence, resultVoidSentence, wordsCounter.wordsCounter(voidSentence));
        assertEquals("Should find 1 word in " + oneWordsSentence, resultOneWordsSentence, wordsCounter.wordsCounter(oneWordsSentence));
        assertEquals("Should find 2 words in " + twoWordsSentence, resultTwoWordsSentence, wordsCounter.wordsCounter(twoWordsSentence));
        assertEquals("Should find 5 words in " + fiveWordsSentence, resultFiveWordsSentence, wordsCounter.wordsCounter(fiveWordsSentence));
        assertEquals("Should find 16 words in " + sixteenWordsSentence, resultSixteenWordsSentence, wordsCounter.wordsCounter(sixteenWordsSentence));
    }


}