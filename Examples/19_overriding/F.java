class A {
    int pro(int a) {
        return 1;
    }
}

class B extends A {
    // parameter type matched
    // return type must match if the return type is a primitive type 
    // Legal case of method overrirding
    byte pro(int a) {
        byte x = 2;

        return x;
    }
}

/*
F.java:11: error: pro(int) in B cannot override pro(int) in A
    byte pro(int a) {
         ^
  return type byte is not compatible with int
1 error 
 */


