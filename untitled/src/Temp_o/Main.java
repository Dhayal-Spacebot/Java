package Temp_o;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("zAlice",21, 32.45);
        Employee emp2 = new Employee("fBob", 55000, 28);
        Employee emp3 = new Employee("oCharlie", 70000, 35);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(emp2);
        employees.add(emp3);

        List<Employee> sortByName = employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).toList();

        List<Employee> sortBySal = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
        sortBySal.forEach(c -> System.out.println(c.getSalary()));

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll.descendingIterator().forEachRemaining(ll1::add);
        System.out.println(ll1);

    }
}