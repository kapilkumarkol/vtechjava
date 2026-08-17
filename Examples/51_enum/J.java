enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class A {
    public static void main(String[] args) {
        Days day = Days.FATHERSDAY;
        System.out.println(day);
    }
}

// J.java:7: error: cannot find symbol
//         Days day = Days.FATHERSDAY;
//                        ^
//   symbol:   variable FATHERSDAY
//   location: class Days
// 1 error