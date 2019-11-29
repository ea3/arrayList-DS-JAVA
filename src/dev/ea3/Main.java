package dev.ea3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
//        Employee emilio = new Employee("Emilio", "Araos", 1233);
//        Employee lucia = new Employee("Lucia", "Terc", 4433);
//        Employee brenda = new Employee("Brenda", "Montes", 1256733);
//
//        employeeList.add(emilio);
//        employeeList.add(lucia);
//        employeeList.add(brenda);


        employeeList.add(new Employee("Jane", "Jones", 8282));
        employeeList.add(new Employee("Lucas", "Tundre", 5573));
        employeeList.add(new Employee("Pete", "limber", 1127));
        employeeList.add(new Employee("Silvia", "Lis", 44772));

//        employeeList.forEach(employee -> System.out.println(employee));


        for(Employee employee: employeeList){
            System.out.println(employee);
        }


//        System.out.println(employeeList.get(1));
//        System.out.println(employeeList.isEmpty());
         employeeList.set(1,new Employee("John", "Adams", 3484));


//        System.out.println(employeeList.size());
//        System.out.println(employeeList. getClass());
        employeeList.add(4, new Employee("Emilio", "Araos", 212112));

//        employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//        for(Employee employee: employeeArray){
//            System.out.println(employee);
//        }

        System.out.println(employeeList.contains(new Employee("Jane", "Jones", 8282)));

        System.out.println(employeeList.indexOf(new Employee("Silvia", "Lis", 44772)));

        employeeList.remove(2);
        System.out.println("----------------");
        for(Employee employee: employeeList){
            System.out.println(employee);
        }

    }
}
