public class NEUApp {
    public static void main(String[] args) {
        Student s1 = new Student("Bogdanovic", "IT1001", 35000);
        Student s2 = new Student("Jovic", "IT1002", 32500);
        Student s3 = new Student("Alejandro", "CS1001", 33000);
        Student s4 = new Student("Vucenic", "CS1002", 31200);

        Teacher t1 = new Teacher("Professor Mark", "Information Technology", 75000);
        Teacher t2 = new Teacher("Professor Jerry", "Computer Science", 80000);

        Department it = new Department("Information Technology");
        it.addUnit(t1);
        it.addUnit(s1);
        it.addUnit(s2);

        Department cs = new Department("Computer Science");
        cs.addUnit(t2);
        cs.addUnit(s3);
        cs.addUnit(s4);

        College cics = new College("College of Computer Studies");
        cics.addUnit(it);
        cics.addUnit(cs);

        cics.getDetails();
        System.out.println("\nTotal Students: " + cics.getStudentCount());
        System.out.println("Total Budget: " + cics.getBudget());
    }
}