package edu.nyu.cs;

import java.util.ArrayList;

public class Word extends OrderedThing implements SequentiallyOrdered{

    private ArrayList<Character> characters = new ArrayList<Character>();
    private String word;

    public Word(String word, int position) {
        super(position);
        this.word = word;
        for (char c: this.word.toCharArray()) {
            Character temp = new Character(c, position);
            characters.add(temp);
        }
    }

    public String getValue() {
        return this.word;
    }

    public OrderedThing getFirst() {
        Character first = characters.get(0);
        return first;
    }
    public OrderedThing getLast() {
        Character last = characters.get(characters.size()-1);
        return last;
    }
    public ArrayList<OrderedThing> getSequence() {
        ArrayList<OrderedThing> temp = new ArrayList<OrderedThing>();
        for (Character character: characters) {
            temp.add(character);
        }
        return temp;
    }
    public int getPosition() {
        return super.getPosition();
    }
}
