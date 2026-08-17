class A {
    public static void main(String[] args) {
        Student s = new Student();
        
        System.out.println(s);
        System.out.println(Integer.toHexString(s.hashCode()));
    }
}

class Student { }