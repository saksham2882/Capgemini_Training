import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class EmployeeService {

    // Question 1:
    public static double sumOfSalary() {
        return EmployeeRepository.getEmployees().stream().map(e -> e.getSalary()).collect(Collectors.summingDouble(e -> e));
    }


    // Question 2:
    public static Map<String, Long> getDeptNameAndCountOfEmployees() {
        // return EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() != null).collect(Collectors.groupingBy(e -> e.getDepartment().getDepartmentName(), Collectors.counting()));
        return EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() != null).map(e -> e.getDepartment().getDepartmentName()).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }


    // Question 3:
    public static Employee getSeniorMostEmployee() {
        return EmployeeRepository.getEmployees().stream().min((e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate())).orElse(null);
    }


    // Question 4:
    public static void getEmployeeAndServiceDuration() {
        EmployeeRepository.getEmployees().stream().forEach(e -> {
            Period p = Period.between(e.getHireDate(), LocalDate.now());

            System.out.println(e.getFirstName() + " " + e.getLastName() + " -> " + p.getYears() * 12 + p.getMonths() + " months and " + p.getDays() + " days");
        });
    }


    // Question 5:
    public static List<Employee> getEmployeeWithoutDepartment() {
        return EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() == null).collect(Collectors.toList());
    }


    // Question 6:
    public static List<String> getDepartmentWithoutEmployee() {
        return EmployeeRepository.getDepartments().stream().filter(d -> EmployeeRepository.getEmployees().stream().noneMatch(e -> e.getDepartment() != null && e.getDepartment().getDepartmentId() == d.getDepartmentId())).map(d -> d.getDepartmentName()).collect(Collectors.toList());
    }
}
























