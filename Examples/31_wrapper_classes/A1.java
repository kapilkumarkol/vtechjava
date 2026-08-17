class A {
    public static void main(String[] args) {
        Integer x = (int)'B'; //ok
        // Integer x = (Integer)'B'; //not ok
        
        System.out.println(x);
    }
}

