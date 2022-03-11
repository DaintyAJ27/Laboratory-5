import java.util.Scanner;
/**
 * @author Sibayan, Alvin Jay M.
 * 
 * Create a Java Program with the Following Requirements
 * 
 * getInformation() - which takes in salary(per hour), number of hours of work per day of 
 * the employee as parameters.
 * addSalary() - adds Php 4,000 to the Monthly Salary of employee if the Monthly salary 
 * computed is less than Php 10,000
 * addOvertimePay() - adds Php 2,000 to the salary of an employee if the number of hours 
 * of work per day is more than 6 hours
 * 
 * The program should
 * 
 * Be able to take the salary, number of hours of work per day from keyboard input.
 * Compute and Display the Initial monthly salary of the Employee.
 * Compute and Display the Final Monthly salary of the Employee.
 * accessors and mutators.
 * monthly working days = 25
 */
public class App {
    public static void main(String[] args) throws Exception {
        
         try (Scanner sc = new Scanner(System.in)) {
            {
                
                Float num1, num2;

                //ask the user an input
                System.out.println("");
                System.out.println("Lab Activity 5");
                System.out.println("Enter Hourly Rate (PHP):");
                num1 = sc.nextFloat();
                System.out.println("Enter daily working Hours:");
                num2 = sc.nextFloat();

                //This code will store the output of num1 and num2 and will pass to the setter and getter
                salCalculator i = new salCalculator(num1, num2);

                //print the computed salary
                System.out.println("Computing Monthly Salary.....");
                System.out.println("Result " + i.computeMonthly());

                //methods
                i.addSalary();
                i.addOvertimePay();
            }
        }
    } //end of main
    
} //end of class

