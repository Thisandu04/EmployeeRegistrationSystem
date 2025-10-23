import java.util.Scanner;

public class EmployeeRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("-----Employee Registration-----");

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Employee ID: ");
        int  empId = scanner.nextInt();

        scanner.close();

        if(EmailValidator.isValidEmail(email)){
            if(EmailValidator.isCompanyEmail(email)){
                Employee employee=new Employee(empId,name,email);
                employee.displayDetails();
            }else{
                System.out.println("This needs to be valid Company email");
            }
        }else{
            System.out.println("Invalid Email");
        }


        // Step 3: Register Employee
        System.out.println("\nEmployee registered successfully!");
        System.out.println("----- Employee Details -----");
        System.out.println("ID   : " + empId);
        System.out.println("Name : " + name);
        System.out.println("Email: " + email);
    }
}
