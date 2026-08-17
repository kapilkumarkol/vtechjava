class A {
    public static void main(String[] args) {
        // boolean flag = "golu@gmail.com".matches("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}");
        boolean flag = "golu@gmail".matches("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}");
        
        System.out.println(flag);
    }
}