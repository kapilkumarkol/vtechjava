interface X {
    void pro();
}

class T implements X {
    public void pro() {
        System.out.println("Hello");
    }
}

class Z extends T implements X {
    
}