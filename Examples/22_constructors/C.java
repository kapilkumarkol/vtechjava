class A {
    A() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        A x = new A(4);    
    }
}

// C.java:7: error: constructor A in class A cannot be applied to given types;
//         A x = new A(4);    
//               ^
//   required: no arguments
//   found: int
//   reason: actual and formal argument lists differ in length
// 1 error