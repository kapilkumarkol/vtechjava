class X {
    static int r = 10;
}

class A extends X {
    static {
        System.out.println(super.r);
    }

    {
        System.out.println(super.r);
    }
}

