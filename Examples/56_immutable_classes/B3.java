class A {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("umesh");
        s.setAge(12);

        System.out.println(s.getName());
        System.out.println(s.getAge());
        
        s.setName("raghav");
        s.setAge(18);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}

//step 1: declare your class final
final class Student {

    //step 2: mark private to all of your instance variables
    private String name;
    private int age;

    //step 3: remove setter methods
    // public void setName(String name) {
    //     this.name = name;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // } 

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }
}