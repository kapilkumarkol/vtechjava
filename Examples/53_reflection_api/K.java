class User {

}

class Employee extends User implements Smart, Intelligent {

}

class A {
    public static void main(String[] args) {
        Class klass = Employee.class;

        Class superClass = klass.getSuperclass();

        // System.out.println(superClass);
        System.out.println(superClass.getName());

        Class[] classes = klass.getInterfaces();

        for(Class kl : classes) {
            System.out.println(kl.getName());
        }
    }
}

interface Smart {

}

interface Intelligent {

}