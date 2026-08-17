class A {
    public static void main(String[] args) {
        Student s1 = new Student("om", 14);
        Student s2 = new Student("om", 14);
        Student s3 = new Student("om", 14);
        
        // boolean result = s1.equals(s2);
        // System.out.println(result);

        //5:null test  --------------- NullPointerException -----------
        System.out.println(s1.equals(null));
        System.out.println(s2.equals(null));
        System.out.println(s3.equals(null));

        //4:consistent test:
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s2));


        //3:transitive test
        // System.out.println(s1.equals(s2));
        // System.out.println(s2.equals(s3));
        // System.out.println(s1.equals(s3));

        //2:symmetric test
        // System.out.println(s1.equals(s2));
        // System.out.println(s2.equals(s1));

        //1: reflexive test
        // System.out.println(s1.equals(s1));
        // System.out.println(s2.equals(s2));
        // System.out.println(s3.equals(s3));

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
        Student x = this;
        Student y = (Student)obj;

        String nm1 = x.name;
        String nm2 = y.name;

        int ag1 = x.age;
        int ag2 = y.age;

        return nm1.equals(nm2) && ag1 == ag2;
    }
}