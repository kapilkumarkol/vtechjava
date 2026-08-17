import java.util.PriorityQueue;

class A {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.offer(89);
        q.offer(13);
        q.offer(56);
        q.offer(23);
        q.offer(4);
        q.offer(67);
        q.offer(89);

        // System.out.println(set);

        int size = q.size();
        for(int i=0; i<size; i++) {
            System.out.println(q.poll());
        }

        System.out.println(q);
    }
}