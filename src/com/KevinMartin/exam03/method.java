package com.KevinMartin.exam03;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

class WordCollection implements Iterable<String>{
    private List<String> words = new ArrayList<>();

    @Override
    public void forEach(Consumer<? super String> action) {

    }

    @Override
    public Iterator<String> iterator() {
        return words.iterator();
    }

    public void addWord(String word) {
        words.add(word);
    }
}


public class method {
    public static void main(String[] args) {
        WordCollection someWords = new WordCollection();
        someWords.addWord("Display");
        someWords.addWord("these");
        someWords.addWord("words");
        someWords.addWord("using");
        someWords.addWord("a");
        someWords.addWord("for-each");
        someWords.addWord("loop.");

        for(String word: someWords) {
            System.out.println(word);
        }
    }
}