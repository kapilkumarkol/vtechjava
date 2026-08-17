class A {
    public static void main(String[] args) {
        Student[] x = {
                        new Student("om", 7), 
                        new Student("ram", 12), 
                        new Student("golu", 17)
                      };

        System.out.println(x[1].age);              
    }    
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age  = age;
    }
}