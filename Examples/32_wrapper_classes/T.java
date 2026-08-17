class A {
    public static void main(String[] args) {
        Boolean s = true;
        Boolean t = true;
        Boolean u = true;

        System.out.println(s == t);
        System.out.println(u == t);

        // Boolean object with value true will be created ones
        // there after the same reference code is asssigned to other referencce variables as the same boolean values is assigned to them 

        // this reusability of a value is possible because the wrapper class objects are immutable.. 
    }
}