class A {
    static T t = new T() {
        void info() {
            System.out.println("Hi...");
        }

        void golu() {
            System.out.println("Bye..");
        }
    };

    public static void main(String[] args) {
        // t.golu();  //NOT OK

        t.info(); //OK
    }
}

class T {
    void info() {
        System.out.println("Hello Jetha Lal");
    }
}