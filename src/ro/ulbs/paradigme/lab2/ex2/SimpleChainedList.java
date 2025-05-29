package ro.ulbs.paradigme.lab2.ex2;

public class SimpleChainedList implements SortableList {
    private SimpleChainedNote head;

    public SimpleChainedList() {
        this.head = null;
    }

    public void addValue(int value) {
        SimpleChainedNote newNode = new SimpleChainedNote(value);
        if (head == null) {
            head = newNode;
        } else {
            SimpleChainedNote temp = head;
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(newNode);
        }
    }

    public int sumValues() {
        int sum = 0;
        SimpleChainedNote temp = head;
        while (temp != null) {
            sum += temp.getValue();
            temp = temp.getNextNode();
        }
        return sum;
    }

    @Override
    public boolean isSorted() {
        if (head == null) return true;
        SimpleChainedNote temp = head;
        while (temp.getNextNode() != null) {
            if (temp.getValue() > temp.getNextNode().getValue()) {
                return false;
            }
            temp = temp.getNextNode();
        }
        return true;
    }

    public void listNodes() {
        SimpleChainedNote temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " ");
            temp = temp.getNextNode();
        }
        System.out.println();
    }
}
