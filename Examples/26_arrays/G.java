class A {
    public static void main(String[] args) {
        int[] x = {45, 23, 78, 12, 9};

        // ----------------------        
        for(int i=0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }

        System.out.println("+++++++++++++++++");
        
        int halfLen = x.length/2;
        int c = 0;
        for(int i=0, j = x.length-1; i < halfLen; i++, j--) {
            c = x[i];
            x[i] = x[j];
            x[j] = c;
        }  

        System.out.println("+++++++++++++++++");

        for(int i=0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }

        // ----------------------
    }
}