package edu.nyu.cs;

public class OrderedThing {
    private int position;

    public OrderedThing(int position) {
        this.position = position;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int position) {
        if (position >= 0) {
            this.position = position;
        }
    }
}
