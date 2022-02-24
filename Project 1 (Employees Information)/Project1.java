package project;

import java.util.Scanner;


public class Project1 {

    public static void main(String[] args) {

        int[] empno = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "01/01/2000", "12/06/2006"};
        char[] designCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};

        String[] deptName = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basicPay = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hraPay = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] itPay = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        int salary;
        int found = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Employee ID to get Details: ");
        int checkID = sc.nextInt();

        for(int i = 0; i < empno.length; i++){
            if(checkID == empno[i]){
                switch (designCode[i]){
                    case 'e':
                        salary = basicPay[i] + hraPay[i] + 20000 - itPay[i];
                        System.out.println("Emp No.    Emp Name      Department         Designation           Salary");
                        System.out.println(empno[i]+"        "+empName[i]+ "        "+deptName[i]+"            Engineer"+"            "+salary);
                        break;
                    case 'c':
                        salary = basicPay[i] + hraPay[i] + 32000 - itPay[i];
                        System.out.println("Emp No.    Emp Name    Department   Designation      Salary");
                        System.out.println(empno[i]+"        "+empName[i]+ "        "+deptName[i]+"        Consultant"+"        "+salary);
                        break;
                    case 'k':
                        salary = basicPay[i] + hraPay[i] + 12000 - itPay[i];
                        System.out.println("Emp No.    Emp Name    Department   Designation      Salary");
                        System.out.println(empno[i]+"        "+empName[i]+ "        "+deptName[i]+"        Clerk"+"          "+salary);
                        break;
                    case 'r':
                        salary = basicPay[i] + hraPay[i] + 15000 - itPay[i];
                        System.out.println("Emp No.    Emp Name        Department       Designation        Salary");
                        System.out.println(empno[i]+"        "+empName[i]+ "        "+deptName[i]+"        Receptionist"+"        "+salary);
                        break;
                    case 'm':
                        salary = basicPay[i] + hraPay[i] + 40000 - itPay[i];
                        System.out.println("Emp No.    Emp Name    Department   Designation      Salary");
                        System.out.println(empno[i]+"        "+empName[i]+ "        "+deptName[i]+"        Manager"+"        "+salary);
                        break;
                    default:
                        System.out.println("None");

                }
                
                found = 1;
            }
        }

        if(found != 1) {
            System.out.println("There is no employee with Employee ID:" + checkID);
        }

    }

}
