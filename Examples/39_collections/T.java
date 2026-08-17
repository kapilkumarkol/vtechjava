class A {
    public static void main(String[] args) {
        Student s = new Student("om", 14);
        Employee e = new Employee("om", 14);
        
        boolean result = s.equals(e);
        System.out.println(result);

        
    }
}

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj != null) {
            Student x = this;
            Student y = (Student)obj;
    
            String nm1 = x.name;
            String nm2 = y.name;
    
            int ag1 = x.age;
            int ag2 = y.age;
    
            flag = nm1.equals(nm2) && ag1 == ag2;
        }

        return flag;
    }
}