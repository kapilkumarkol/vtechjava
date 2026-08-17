class A {
    public static void main(String[] args) {
        int[] x;

        // more code...

        x = new int[] {120, 130, 140};  // ok
        // x = {120, 130, 140};            // not ok

        for(int t=0; t < x.length; t++) {
            System.out.println(x[t]);
        }
    }
}