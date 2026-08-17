import java.util.LinkedList;

class A {
    public static void main(String[] args) {
        
        //LinkedList as a Stack
        LinkedList x = new LinkedList();

        x.push(12);
        x.push(41);
        x.push(67);
        x.push(34);
        x.push(9);
        
        while(0 < x.size()) {
            System.out.println(x.pop());
        }

        System.out.println(x);
    }
}