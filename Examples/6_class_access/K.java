//IS-A relationship between Student and Pen

// where Pen is a parent class and Student is a Child class
// you can also say that the Pen is a Super Class and Student is a Sub Class
// in another words we can also say that the Pen is a Generalized class and The Student is a Specialized Class

        // Pen (Super/Parent/Generalized class)
        //  ^   
        //  |
        // Student (Sub/Child/Specialized Class)

// Student IS-A Pen

class Student extends Pen {
    public static void main(String[] args) {
        Student s = new Student();

        s.write();
    }
}

class Pen {
    void write() {
        System.out.println("I am writing...");
    }
}