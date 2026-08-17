import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        
        list.add(56);
        list.add(21);
        list.add(23);
        list.add(65);
        list.add(76);
        list.add(21);

        System.out.println(list);

        Integer x = Integer.valueOf(2); 
        System.out.println(list.remove(x));

        System.out.println(list);
    }
}