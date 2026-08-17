import java.util.LinkedList;

class A {
    public static void main(String[] args) {
        
        //LinkedList as a Queue
        LinkedList x = new LinkedList();

        x.offer(12);
        x.offer(41);
        x.offer(67);
        x.offer(34);
        x.offer(9);
        
        int len = x.size();
        for(int i=0;i<len;i++) {
            // System.out.println(x.peek());
            System.out.println(x.poll());
        }

        System.out.println(x);
    }
}