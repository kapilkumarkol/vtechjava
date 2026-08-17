class A {
    public static void main(String[] args) {
        int[] x = {34, 12, 77, 56};

        // ----------------------
        int max = x[0];
        
        for(int i=0; i < x.length; i++) {
            if(x[i] > max) {
                max = x[i];
            }
        }

        System.out.println(max);

        // ----------------------

    }
}