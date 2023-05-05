package edu.nyu.cs;

import org.mockito.internal.matchers.InstanceOf;

import java.util.ArrayList;

public class TestSequence {
    public static void main(String[] args) {

        // starter code
        System.out.println("\nHello World!\n");

        // the sentence we are going to use -> John 13:34 NIV
        String testString = "A new command I give you: Love one another. As I have loved you, so you must love one another.";
        
        // sentence
        // the testString to a Sentence object
        Sentence testSentence = new Sentence(testString);

        // getSentence() method
        System.out.println(testSentence.getSetence()+"\n");

        // getFirst() method
        Word firstWord = (Word) testSentence.getFirst();
        System.out.println(firstWord.getValue());

        // getLast() method
        Word lastWord = (Word) testSentence.getLast();
        System.out.println(lastWord.getValue()+"\n");

        // getSequence() method
        ArrayList<OrderedThing> testSequence = testSentence.getSequence();
        for (OrderedThing sequence: testSequence) {
            Word seq = (Word) sequence;
            System.out.println(seq.getValue());
        }

        // word: lastWord
        // getValue() method
        System.out.println("\n"+lastWord.getValue()+"\n");

        // getFirst() method
        Character first = (Character) lastWord.getFirst();
        System.out.println(first.getValue());

        // getLast() method
        Character last = (Character) lastWord.getLast();
        System.out.println(last.getValue()+"\n");

        // getSequence() method
        ArrayList<OrderedThing> wordSequence = lastWord.getSequence();
        for (OrderedThing sequence: wordSequence) {
            Character character = (Character) sequence;
            System.out.println(character.getValue());
        }

        // getPosition() method
        System.out.println("\n"+lastWord.getPosition());
    }
}
