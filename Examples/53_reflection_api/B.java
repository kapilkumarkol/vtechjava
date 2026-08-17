class Employee {

}

class A {
    public static void main(String[] args) {
        Employee e = new Employee();
        
        Class klass = e.getClass();
        
        System.out.println(klass);
    }
}