package ro.ulbs.paradigme.lab2.ex2;

public class SimpleChainedNote implements Node {
    private int value;
    private SimpleChainedNote next;

    public SimpleChainedNote(int value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public SimpleChainedNote getNextNode() {
        return next;
    }

    public void setNextNode(SimpleChainedNote next) {
        this.next = next;
    }
}
