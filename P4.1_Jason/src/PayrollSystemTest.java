//CS 2265 – Advanced Programming I
//
//Troy Online – Prof. Reggie Haseltine
//
//
//
//Program #4 - Java Application for Employee's Payroll System with User Interaction

import java.util.Scanner;

public class PayrollSystemTest

{
    public static void main( String args[] )
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for Salaried Employee information
        System.out.println("Enter information for Salaried Employee:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Social Security Number: ");
        String ssn = scanner.nextLine();
        System.out.print("Weekly Salary: ");
        double weeklySalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        System.out.print("Birth Month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Birth Day (1-31): ");
        int day = scanner.nextInt();
        System.out.print("Birth Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        Date bDate = new Date(month, day, year);

        SalariedEmployee salariedEmployee = new SalariedEmployee(firstName, lastName, ssn, bDate, weeklySalary);

// Prompt user for Hourly Employee information
        System.out.println("\nEnter information for Hourly Employee:");
        System.out.print("First Name: ");
        firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        lastName = scanner.nextLine();
        System.out.print("Social Security Number: ");
        ssn = scanner.nextLine();
        System.out.print("Hourly Wage: ");
        double hourlyWage = scanner.nextDouble();
        System.out.print("Hours Worked: ");
        int hoursWorked = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Birth Month (1-12): ");
        month = scanner.nextInt();
        System.out.print("Birth Day (1-31): ");
        day = scanner.nextInt();
        System.out.print("Birth Year: ");
        year = scanner.nextInt();
        scanner.nextLine();

        bDate = new Date(month, day, year);

        HourlyEmployee hourlyEmployee = new HourlyEmployee(firstName, lastName, ssn, bDate, hourlyWage, hoursWorked);

// Prompt user for Commission Employee information
        System.out.println("\nEnter information for Commission Employee:");
        System.out.print("First Name: ");
        firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        lastName = scanner.nextLine();
        System.out.print("Social Security Number: ");
        ssn = scanner.nextLine();
        System.out.print("Gross Sales: ");
        double grossSales = scanner.nextDouble();
        System.out.print("Commission Rate: ");
        double commissionRate = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        System.out.print("Birth Month (1-12): ");
        month = scanner.nextInt();
        System.out.print("Birth Day (1-31): ");
        day = scanner.nextInt();
        System.out.print("Birth Year: ");
        year = scanner.nextInt();
        scanner.nextLine();

        bDate = new Date(month, day, year);

        CommissionEmployee commissionEmployee = new CommissionEmployee(firstName, lastName, ssn, bDate, grossSales, commissionRate);

// Prompt user for Base Plus Commission Employee information
        System.out.println("\nEnter information for Base Plus Commission Employee:");
        System.out.print("First Name: ");
        firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        lastName = scanner.nextLine();
        System.out.print("Social Security Number: ");
        ssn = scanner.nextLine();
        System.out.print("Gross Sales: ");
        grossSales = scanner.nextDouble();
        System.out.print("Commission Rate: ");
        commissionRate = scanner.nextDouble();
        System.out.print("Base Salary: ");
        double baseSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        System.out.print("Birth Month (1-12): ");
        month = scanner.nextInt();
        System.out.print("Birth Day (1-31): ");
        day = scanner.nextInt();
        System.out.print("Birth Year: ");
        year = scanner.nextInt();
        scanner.nextLine();

        bDate = new Date(month, day, year);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(firstName, lastName, ssn, bDate, grossSales, commissionRate, baseSalary);






        System.out.println( "Employees processed individually:\n" );

        System.out.printf( "%s\n%s: $%,.2f\n\n",

                salariedEmployee, "earned", salariedEmployee.earnings() );

        System.out.printf( "%s\n%s: $%,.2f\n\n",

                hourlyEmployee, "earned", hourlyEmployee.earnings() );

        System.out.printf( "%s\n%s: $%,.2f\n\n",

                commissionEmployee, "earned", commissionEmployee.earnings() );

        System.out.printf( "%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings() );

        // create four-element Employee array
        Employee employees[] = new Employee[ 4 ];

        // initialize array with Employees
        employees[ 0 ] = salariedEmployee;
        employees[ 1 ] = hourlyEmployee;
        employees[ 2 ] = commissionEmployee;
        employees[ 3 ] = basePlusCommissionEmployee;



        System.out.println( "Employees processed polymorphically:\n" );



        // generically process each element in array employees

        for ( Employee currentEmployee : employees )

        {

            System.out.println( currentEmployee ); // invokes toString



            // determine whether element is a BasePlusCommissionEmployee
            if ( currentEmployee instanceof BasePlusCommissionEmployee )
            {
                // downcast Employee reference to
                // BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee = ( BasePlusCommissionEmployee ) currentEmployee;

                double oldBaseSalary = employee.getBaseSalary();
                employee.setBaseSalary( 1.10 * oldBaseSalary );

                System.out.printf("new base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary() );
            } // end if


            if (currentEmployee.bDate.month == 11){
                System.out.printf("monthly earned (with birthday bonus) $%,.2f\n\n", (currentEmployee.earnings() + 100) );}
            else
                System.out.printf("monthly earned $%,.2f\n\n", currentEmployee.earnings() );
        }



        // get type name of each object in employees array

        for ( int j = 0; j < employees.length; j++ )
            System.out.printf( "Employee %d is a %s\n", j,
                    employees[ j ].getClass().getName() );
    } // end main

} // end class PayrollSystemTest