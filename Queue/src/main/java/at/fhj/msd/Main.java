package at.fhj.msd;

public class Main {

    private static int MAX_SIZE = 10;

    public static void main(String[] args) {

        StringQueue stringQueue = new StringQueue(MAX_SIZE);
        stringQueue.offer("1");
        System.out.println(stringQueue.peek());
        System.out.println(stringQueue.peek());

        System.out.println();
        stringQueue.element();
    }
}
