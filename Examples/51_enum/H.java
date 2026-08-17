enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class A {
    public static void main(String[] args) {
        Days day = MONDAY;
        System.out.println(day);
    }
}


// H.java:7: error: cannot find symbol
//         Days day = MONDAY;
//                    ^
//   symbol:   variable MONDAY
//   location: class A
// 1 error