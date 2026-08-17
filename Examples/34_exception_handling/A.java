class B extends RuntimeException {

}

class A {
    public static void main(String[] args) {
               
        try {

        } 

        //Case 5:
        // catch(A e) {
        //     A.java:16: error: incompatible types: A cannot be converted to Throwable
        //         catch(A e) {
        //       ^
        //         1 error
        // }


        //Case 4:
        // catch(Error e) {

        // }


        //Case 3:
        // catch(B e) {

        // }

        
        //Case 2:
        // catch(Throwable e) {

        // }


        //Case 1:
        // catch(Object x) {
        // //     A.java:5: error: incompatible types: Object cannot be converted to Throwable
        // // } catch(Object x) {
        // }
    }
}