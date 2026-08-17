class User {

}

class Employee extends User {

}

class A {
    public static void main(String[] args) {
        Class klass = Employee.class;

        Class superClass = klass.getSuperclass();

        // System.out.println(superClass);
        System.out.println(superClass.getName());
    }
}