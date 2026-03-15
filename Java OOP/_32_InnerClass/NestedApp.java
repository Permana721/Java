package _32_InnerClass;

public class NestedApp {
    static void main(String[] args) {

        Company company = new Company();
        company.setName("Ipuh Corp");

        Company.Employee employee =  company.new Employee();
        employee.setName("Permana");

        System.out.println("Company Name : " + employee.getCompany());
        System.out.println("Employee Name : " + employee.getName());
    }
}
