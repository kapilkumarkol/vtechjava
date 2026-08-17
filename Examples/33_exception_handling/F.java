// input: <no arg>, z, 0, 1, 2

class A {
    public static void main(String[] args) {
        System.out.println(1);
        
        try {
            int x = Integer.parseInt(args[0]);
            
            System.out.println(2);
            int[] arr = {4, 0, 3};
            System.out.println(arr[x]);
            
            System.out.println(3);
            int y = 12/arr[x];
        } catch(Exception e) {
            // System.out.println(e);
            e.printStackTrace();
        }

        System.out.println(4);
    }
}