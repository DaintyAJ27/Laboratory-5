public class salCalculator {

    //access modifier
    private Float hourlyRate;
    private Float workHours;
    public Float computedMonthly;

    //Constructor
    public salCalculator(Float hourlyRate, Float workHours) {
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }
    //setter and getter
    public Float getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(Float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public Float getWorkhours() {
        return workHours;
    }
    public void setWorkhours(Float workHours) {
        this.workHours = workHours;
    }
    public Float computeMonthly() {
        return 25 * (this.hourlyRate * this.workHours);
    } //end of setter and getter

// adds Php 4,000 to the Monthly Salary of employee if the Monthly salary computed is less than Php 10,000
public void addSalary() {
    if (computeMonthly()<10000){
        computedMonthly = computeMonthly() + 4000;
        System.out.println("Monthly Salary is not a Livable Wage, adding salary....");
    } else {
        computedMonthly = computeMonthly();
        System.out.println("Monthly Salary is a Livable Wage....  ");
    }
}
// adds Php 2,000 to the salary of an employee if the number of hours of work per day is more than 6 hours
public void addOvertimePay() {
    if (this.workHours>6){
        computedMonthly += 2000;
        System.out.println("Working Hours is More Than Required, adding overtime pay....");
        System.out.println("Final Salary : "+ computedMonthly);
    } else {
        System.out.println("Working Hours is below 6 hours, no overtime pay....");
        System.out.println("Final Salary : "+ computedMonthly);
        }  
    }
} //end of class
