import java.util.*;
class Gross_net_salary{
    public static void main(String[] args) {
        double da,hra,cca,pt,pf,gross,net,basic;
        try (Scanner sc = new Scanner(System.in)) {
            String empname = new String();
            String empno = new String();
            System.out.print("Enter Employee Name: ");
            empname = sc.nextLine();
            System.out.print("Enter Employee Number: ");
            empno = sc.next();
            System.out.print("Enter Basic: ");
            basic = sc.nextDouble();
        }
        da = 0.7*basic;
        hra = 0.3*basic;
        cca=240;
        pf=0.1*basic;
        pt=100;
        gross = basic+da+hra;
        net = gross-pt-cca-pf;


        System.out.println("Gross Salary: "+gross);
        System.out.println("Net Salary: "+net);
    }
}
