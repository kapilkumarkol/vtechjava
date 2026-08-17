import java.util.PriorityQueue;

class A {
    public static void main(String[] args) {
        PriorityQueue<Integer> x = new PriorityQueue<Integer>();

        x.offer(12);
        x.offer(67);
        x.offer(23);
        x.offer(89);
        x.offer(100);

        for(Integer e : x) {
            System.out.println(e);
        }
    }
}