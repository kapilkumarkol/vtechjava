class A {
    public static void main(String[] args) {
        try {

        } catch(IndexOutOfBoundsException e) {

        } catch(ArrayIndexOutOfBoundsException e) {

        }
    }
}

// G.java:7: error: exception ArrayIndexOutOfBoundsException has already been caught
//         } catch(ArrayIndexOutOfBoundsException e) {
//           ^
// 1 error