import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet dholakpur = new HashSet();

        dholakpur.add(new Employee("golu", 34));
        dholakpur.add(new Employee("bheem", 42));
        dholakpur.add(new Employee("chutki", 28));
        dholakpur.add(new Employee("raju", 4));
        dholakpur.add(new Employee("jaggu", 12));
        dholakpur.add(new Employee("kaliya", 30));
        dholakpur.add(new Employee("golu", 34));

        System.out.println(dholakpur);

        Employee x = new Employee("golu", 34);
        System.out.println(dholakpur.contains(x));
        System.out.println(dholakpur.remove(x));
        System.out.println(dholakpur);
    }
}

class Employee {
    String name;
    int age; 

    public String toString() {
        return name + " - " + age+"\n";
    }

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj != null && obj instanceof Employee) {
            Employee x = this;
            Employee y = (Employee)obj;
    
            String nm1 = x.name;
            String nm2 = y.name;
    
            flag = nm1.equals(nm2);
        }

        return flag;
    }

    public int hashCode() {
        int sum = 0;

        String abc = " abcdefghijklmnopqrstuvwxyz";

        for(int i=0; i<name.length(); i++)  {
            sum = sum + abc.indexOf(name.charAt(i));
        }

        return sum;        
    }

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}