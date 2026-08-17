class A {
    public static void main(String[] args) {
        //Case 1:
        // Student[] x = new Student[2];
        // x[0] = new Student("Yam", 13);
        // x[1] = new Student("indr", 15);

        //Case 2:
        Student[] x = {
                        new Student("om", 12), 
                        new Student("golu", 13), 
                        new Student("ram", 15)
                      };        
    
        for(int i=0; i < x.length; i++) {
            System.out.println(x[i]);
        }
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
}