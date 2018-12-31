package words;

public class WordsCounter {


    public Integer wordsCounter(String str) {
        if(str.trim().isEmpty()) return 0;
        return str.trim().split(" ").length;
    }
}
