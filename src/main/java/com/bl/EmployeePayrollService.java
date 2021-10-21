package com.bl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService {CONSOLE_IO, FILE_IO, DB_IO, REST_IO}

    private List<PayrollData> employeePayrollList;

    public EmployeePayrollService() {
    }

    public EmployeePayrollService(List<PayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<PayrollData> PayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(PayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }

    private void writeEmployeePayrollData() {
        System.out.println("\n Writing Employee Roaster to console\n " + employeePayrollList);
    }

    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.print("Enter Employee ID: ");
        int id = consoleInputReader.nextInt();
        System.out.print("Enter Employee name: ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary: ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new PayrollData(id, name, salary));
    }
}