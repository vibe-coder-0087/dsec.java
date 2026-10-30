class class1 {

    String name;
    String dept;
    int age;

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.dept = "CSE";
        s1.age=20;
        s1.name = "Varun";
        Student s2 = new Student();

        s2.name = "Saran";
        s2.dept = "CSE";
        s2.age=21;

        System.out.println("Student 1 Name: " + s1.name);
        System.out.println("Student 1 Dept: "+ s1.dept);
        System.out.println("Student 1 Age: " +s1.age);
        System.out.println("Student 2 Name: " + s2.name);
        System.out.println("Student 2 Dept: "+ s2.dept);
        System.out.println("Student 2 Age: " +s2.age);
    }
}