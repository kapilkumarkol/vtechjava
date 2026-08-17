class A {
    A(int x) {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A a = new A();
    }     
}

// B.java:7: error: constructor A in class A cannot be applied to given types;
//         A a = new A();
//               ^
//   required: int
//   found: no arguments
//   reason: actual and formal argument lists differ in length
// 1 error