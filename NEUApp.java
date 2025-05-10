public class NEUApp {
    public static void main(String[] args) {
        Student s1 = new Student("Bogdanovic", "IT1001", 35000);
        Student s2 = new Student("Jovic", "IT1002", 32500);
        Student s3 = new Student("Alejandro", "CS1001", 33000);
        Student s4 = new Student("Vucenic", "CS1002", 31200);

        Teacher t1 = new Teacher("Professor Mark", "Information Technology", 75000);
        Teacher t2 = new Teacher("Professor Jerry", "Computer Science", 80000);

        Department it = new Department("Information Technology");
        it.add(t1);
        it.add(s1);
        it.add(s2);

        Department cs = new Department("Computer Science");
        cs.add(t2);
        cs.add(s3);
        cs.add(s4);

        College cics = new College("College of Computer Studies");
        cics.add(it);
        cics.add(cs); 

        cics.getDetails();
        System.out.println("\nTotal Students: " + cics.getNumberOfStudents());
        System.out.println("Total Budget: " + cics.getBudget());
    }
}