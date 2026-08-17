class A {
    public static void main(String[] args) {
        ThreadGroup parentMostThreadGroup = Thread.currentThread().getThreadGroup().getParent();

        System.out.println(parentMostThreadGroup.getName());

        parentMostThreadGroup.list();
    }
}