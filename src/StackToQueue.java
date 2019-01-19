import edu.princeton.cs.algs4.In;

public class StackToQueue<Item> {
    private Stack<Item> inStack;
    private Stack<Item> outStack;

    public StackToQueue(int capacity) {
        inStack = new Stack<>(capacity);
        outStack = new Stack<>(capacity);
    }

    public void enqueue(Item item) {
        inStack.push(item);
    }


    public Item dequeue() {
        Item tempVar;
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                tempVar = inStack.pop();
                outStack.push(tempVar);
            }
        }

        return outStack.pop();

    }

    public static void main(String[] args) {
        //test client (optional)

        In in = new In(args[0]);//input file
        StackToQueue<String> someThing = new StackToQueue<>(1);

        while (!in.isEmpty()) {
            String N = in.readString();         //N-by-N percolation system
            someThing.enqueue(N);
            if (("-").equals(N)) System.out.print(someThing.dequeue());

        }


    }
}
