package edu.nyu.cs;

public class Character extends OrderedThing {
    private char value;

    public Character(char value, int position) {
        super(position);
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }
    
}
