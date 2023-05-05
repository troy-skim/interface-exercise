package edu.nyu.cs;

import java.util.ArrayList;

public class Sentence implements SequentiallyOrdered {

    private ArrayList<Word> words = new ArrayList<Word>();
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
        String[] wordStrings = this.sentence.split("[^\\w']+");
        for (int i = 0; i<wordStrings.length; ++i) {
            Word word = new Word(wordStrings[i], i);
            words.add(word);
        }
    }

    public String getSetence() {
        return this.sentence;
    }

    public OrderedThing getFirst() {
        return words.get(0);
    }
    public OrderedThing getLast() {
        return words.get(words.size()-1);
    }
    public ArrayList<OrderedThing> getSequence() {
        ArrayList<OrderedThing> temp = new ArrayList<OrderedThing>();
        for (Word word: words) {
            temp.add(word);
        }
        return temp;
    }
}
