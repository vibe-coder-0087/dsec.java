class Student {

    String name;
    String dept;
    int mark1;
    int mark2;
    public int age;

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.dept = "CSE";
        s1.mark1 = 70;
        s1.mark2 = 60;
        s1.name = "Varun";

        Student s2 = s1;

        s2.name = "Saran";
        s2.dept = "CSE";
        s2.mark1 = 80;
        s2.mark2 = 75;

        System.out.println(s2 == s1);

        System.out.println("Student 1 Name: " + s1.name);
        System.out.println("Student 2 Name: " + s2.name);
        System.out.println("Mark 1: " + s1.mark1);
        System.out.println("Mark 2: " + s1.mark2);
        System.out.println("Dept:" + s1.dept);
    }
}