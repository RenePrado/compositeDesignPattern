import java.util.*;

public class Department implements NEUComponent {
    private String name;
    private List<NEUComponent> units = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(NEUComponent unit) {
        units.add(unit);
    }

    @Override
    public void getDetails() {
        System.out.println("\nDepartment: " + name);
        for (NEUComponent unit : units) {
            unit.getDetails();
        }
    }

    @Override
    public int getNumberOfStudents() {
        int count = 0;
        for (NEUComponent unit : units) {
            count += unit.getNumberOfStudents();
        }
        return count;
    }

    @Override
    public double getBudget() {
        double budget = 0;
        for (NEUComponent unit : units) {
            budget += unit.getBudget();
        }
        return budget;
    }
}