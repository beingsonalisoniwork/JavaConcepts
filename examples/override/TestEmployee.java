package examples.override;

import java.util.HashSet; 

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Sonali");
        Employee e2 = new Employee(1, "Sonali");

        System.out.println(e1.equals(e2)); 
        // would have been 'false' if we did not override as it checks reference eqaulity
        System.out.println(e1.hashCode() == e2.hashCode());
        // would have given 'false' w/o override as equals is same as ==

        HashSet<Employee> set = new HashSet<>();
        set.add(new Employee(1, "Sonali"));
        System.out.println(set.contains(new Employee(1, "Sonali")));
        // without hashCode override, it would have given 'false'

        // for logical equality we have overriden the equals() and hasCode()
    }
}
