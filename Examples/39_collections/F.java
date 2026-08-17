import java.util.LinkedList;

class A {
    public static void main(String[] args) {
        
        //LinkedList as a List
        LinkedList x = new LinkedList();

        x.add(12);
        x.add(41);
        x.add(67);
        x.add(34);
        x.add(9);
        
        while(0<x.size()) {
            System.out.println(x.remove(0));
        }

        System.out.println(x);
    }
}