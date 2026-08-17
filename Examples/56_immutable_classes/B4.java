class A {
    public static void main(String[] args) {
        Student s = new Student("tilak", 13);
        

        System.out.println(s.getName());
        System.out.println(s.getAge());

        // s.setAge(12);
        // s.setName("golu");
        
        // s.name = "vinod";
        // s.age = 18;
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

    //step 4: create a parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }    


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }
}