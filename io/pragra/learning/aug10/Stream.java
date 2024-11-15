package io.pragra.learning.aug10;

import java.util.*;
import java.util.stream.Collectors;



public class Stream {
    public static void main(String[] args) {
//        Employee e1 = new Employee(1,"Madhumitha","Srivatsa","8892804678", 120000.0);
//        Employee e2 = new Employee(2,"Rashmi","Sindhu","8553601510", 110000.0);
//        Employee e3 = new Employee(3,"Milind","Puranik","9449031418", 100000.0);
//        Employee e4 = new Employee(4,"Madhuri","Srinath","8892597862", 125000.0);
//        Employee e5 = new Employee(5,"Ramesh","Sathya","9449031234", 130000.0);
//
//        List<Employee> empList = new ArrayList<>();
//
//        empList.add(e1);
//        empList.add(e2);
//        empList.add(e3);
//        empList.add(e4);
//        empList.add(e5);

        List<Employee> empList = new ArrayList<>(
                Arrays.asList(
                        Employee.builder().empId(1).firstName("Madhumitha").lastName("Srivatsa").phoneNumber("8892804678").salary(120000.0).build(),
                        Employee.builder().empId(2).firstName("Rashmi").lastName("Sindhu").phoneNumber("8553601510").salary(110000.0).build(),
                        Employee.builder().empId(3).firstName("Milind").lastName("Puranik").phoneNumber("9449031418").salary(100000.0).build(),
                        Employee.builder().empId(4).firstName("Madhuri").lastName("Srinath").phoneNumber("8892597862").salary(125000.0).build(),
                        Employee.builder().empId(5).firstName("Ramesh").lastName("Sathya").phoneNumber("9449031234").salary(130000.0).build(),
                        Employee.builder().empId(1).firstName("Madhumitha").lastName("Srivatsa").phoneNumber("8892804678").salary(120000.0).build()
                )
        );


        List<Employee> empSalaryList = empList.stream().filter(e-> e.getSalary()>110000.0).collect(Collectors.toList());
        System.out.println(empSalaryList);

        List<String> empFirstNames = empList.stream().filter(e-> e.getSalary()<125000.0).map(e -> e.getFirstName()).collect(Collectors.toList());
        empFirstNames.forEach(System.out::println);

        Map<Integer,String> empMap =  empList.stream().filter(e->e.getSalary()<115000).collect(Collectors.toMap(employee->employee.getEmpId(),employee->employee.getFirstName()));
        System.out.println(empMap);

        long empCount = empList.stream().count();
        System.out.println("The no. of employees present: " + empCount);

        long distinctEmpCount = empList.stream().distinct().count();
        System.out.println("The no. of employees present after distinct: " + distinctEmpCount);

        Double empSalarySum = empList.stream().mapToDouble(i->i.getSalary()).reduce(0.0, (a, b) -> a + b);
        System.out.println("The sum of salaries of all the employees: " + empSalarySum);

        List<String> naturalSorted = empList.stream().map(i->i.getFirstName()).sorted().collect(Collectors.toList());
        System.out.println("Natural Sorted Order: " + naturalSorted);

        List<String> customSorted = empList.stream().map(i->i.getFirstName()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Customized Sorted in Reverse Order: " + customSorted);

        List<String> lengthSorted = empList.stream().map(i->i.getFirstName()).sorted(Comparator.comparingInt(i->i.length())).collect(Collectors.toList());
        System.out.println("Sorted in Ascending Order of length: " + lengthSorted);

        boolean isEmpSalary = empList.stream().anyMatch(i -> i.getSalary() >= 155000);
        System.out.println("Is there any employee having this salary: "+ isEmpSalary);

        boolean isEmpPresent = empList.stream().anyMatch(i -> i.getFirstName().equals("Madhumitha"));
        System.out.println("Is the employee present: "+ isEmpPresent);

        Optional<Employee> anyEmployee = empList.stream().findAny();
        if(anyEmployee.isPresent())
        {
            System.out.println("Pick any Employee from the list: "+ anyEmployee.get());
        }
        else {
            System.out.println("There is no data in the list");
        }

        Optional<Employee> firstEmployee = empList.stream().findFirst();
        if(firstEmployee.isPresent())
        {
            System.out.println("Pick first Employee from the list: "+ firstEmployee.get());
        }
        else {
            System.out.println("There is no data in the list");
        }

        List<Employee> sortedList = empList.stream().sorted((obj1, obj2) -> {
            String s1 = obj1.getFirstName();
            String s2 = obj2.getFirstName();
            return s1.compareTo(s2);
        }).collect(Collectors.toList());
        System.out.println(sortedList);

        List<Employee> sortedDescList = empList.stream().sorted((obj1, obj2) -> {
            String s1 = obj1.getFirstName();
            String s2 = obj2.getFirstName();
            return s2.compareTo(s1);
        }).collect(Collectors.toList());
        System.out.println(sortedDescList);

    }
}
