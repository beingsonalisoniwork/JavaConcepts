package examples.override;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {return id;}
    public String getName() {return name;}

    // Override equals() 
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true; // self check
        if(obj == null || getClass() != obj.getClass()) return false; // null and type check

        Employee other = (Employee) obj;
        return id == other.id && Objects.equals(name, other.name);
    }

    // Override hashCode() 
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // toString for debugging
    @Override
    public String toString() {return "Employee{id=" + id + ", name='" + name + "'}";}
}
