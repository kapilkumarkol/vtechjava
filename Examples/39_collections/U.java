class A {
    public static void main(String[] args) {
        Student s = new Student("om", 14);
        Student t = new Student("om", 14);
        Student u = new Student("mo", 14);
        
        //test 2: hashCode()
        System.out.println(s.equals(u));
        System.out.println(s.hashCode());
        System.out.println(u.hashCode());

        //test 2: hashCode()
        // System.out.println(s.equals(t));
        // System.out.println(s.hashCode());
        // System.out.println(t.hashCode());

        //test 1: hashCode()
        // System.out.println(s.hashCode());
        // System.out.println(s.hashCode());
        // System.out.println(s.hashCode());
        // System.out.println(s.hashCode());
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

        if(obj != null && obj instanceof Student) {
            Student x = this;
            Student y = (Student)obj;
    
            String nm1 = x.name;
            String nm2 = y.name;
    
            flag = nm1.equals(nm2);
        }

        return flag;
    }

    public int hashCode() {
        int sum = 0;

        String abc = " abcdefghijklmnopqrstuvwxyz";

        for(int i=0; i<name.length(); i++)  {
            sum = sum + abc.indexOf(name.charAt(i));
        }

        return sum;        
    }
}