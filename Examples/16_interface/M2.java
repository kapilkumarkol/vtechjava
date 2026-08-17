interface W {
    void pro();
}

class A implements W {
    void pro() {
        System.out.println("Hello");
    }
}

// attempting to assign weaker access privileges; was public