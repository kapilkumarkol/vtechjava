class A {
    public static void main(String[] args) {
        int[] x = {34, 12, 77, 56, 67, 33, 96};

        // ----------------------
        boolean flag = false;

        for(int i = 0; i < x.length; i++) {
            if(x[i] % 2 == 1) {
                System.out.println("+++");                
                flag = true;
                break;
            } 
        }

        if(flag)
            System.out.println("Odd Found");
        else
            System.out.println("No Odd Record Found");
        // ----------------------
    }
}