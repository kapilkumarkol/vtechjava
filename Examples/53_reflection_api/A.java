class Student {

}

class A {
    public static void main(String[] args) throws ClassNotFoundException {
        Class klass = Class.forName("Student");   
        
        System.out.println(klass);
    }
}