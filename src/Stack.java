public class Stack<Item> {
    private Item[] s;
    private Item[] copy;
    private Item[] p;
    private int N = 0;
    private int count = 0;

    public Stack(int capacity) {
        s = (Item[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(Item item) {
        if (N > 0 && N == s.length) resize(2 * s.length);
        s[N++] = item;
    }

    public Item pop() {
        Item item = s[--N];
        s[N] = null;
        if (N > 0 && N == (s.length / 4)) resize(s.length / 2);
        return item;
    }


    private void resize(int length) {

        copy = (Item[]) new Object[length];
        System.arraycopy(s, 0, copy, 0, N);
        s = copy;

    }


}
