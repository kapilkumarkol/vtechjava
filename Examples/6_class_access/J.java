//HAS-A relationship(Association) between Student and Pen class
//A usage based relarionship....

// Student HAS-A Pen

class Student {
    public static void main(String[] args) {
        Pen pen = new Pen();

        pen.write();
    }
}

class Pen {
    void write() {
        System.out.println("writing some thing...");
    }
}