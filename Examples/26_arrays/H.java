class A {
    public static void main(String[] args) {
        int[] x = {45, 23, 78, 12, 99};

        // ----------------------        
        for(int i=0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }
        
        int halfLen = x.length/2;
        int c = 0;
        for(int i=0; i < halfLen; i++) {
            c = x[i];
            x[i] = x[x.length-i-1];
            x[x.length-i-1] = c;
        }  

        System.out.println("+++++++++++++++++");

        for(int i=0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }

        // ----------------------
    }
}