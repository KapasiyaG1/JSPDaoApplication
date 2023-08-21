
package connect;
import java.util.Scanner;
import model.Employee;
import dao.EmployeeDAO;
import java.util.*;
public class TestMain 
{
    public static void main(String[] args) throws Exception
    {
           int choice;
        do
          {    
             System.out.println("--------------Employee DAO Application----------------");        
             System.out.println("1.Insert Record \n 2.Search By Id \n 3.Search All \n 4. Delete by Id \n 5.Exit");
             System.out.println("-------------------------------------------------------");
             Scanner scan=new Scanner(System.in);
             System.out.println("Enter your choice");
             choice=scan.nextInt();
          
             switch(choice)
             {
                 case 1:insertRecord();break;
                 case 2:searchDataById();break;
                 case 3:searchAllrecord();break;
                 case 4: deleteRecordById();break;
                 case 5: System.exit(0);
                 default:System.out.println("Invalid choice");    
             }
          }while(choice!=5);
    }   
 public static void  insertRecord() throws Exception
 {
 
        int eid;
            String ename;
            int salary;
            String edept;
            String sql;
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter Employee Id");
            eid=EmployeeDAO.autoIncr();
            System.out.println(eid);
            System.out.println("Enter Employee Name");
            ename=scan.next();
            System.out.println("Enter Employee Salary");
            salary=scan.nextInt();
            System.out.println("Enter Employee Department");
            edept=scan.next();
            Employee E=new Employee();
            E.setEmpid(eid);
            E.setEmpname(ename);
            E.setEmpsalary(salary);
            E.setEmpdept(edept);
            EmployeeDAO ed=new EmployeeDAO();
            if(ed.insertStudent(E))
                System.out.println("Record inserted.......");
      
     
     
 }
 
 public static void deleteRecordById() throws Exception
 {
                 int eid;
            Scanner scan=new Scanner(System.in);
            EmployeeDAO ed=new EmployeeDAO();           
            System.out.println("Enter Employee Id for delete");
            eid=scan.nextInt();        
            Employee E1=null;
            E1=ed.searchById(eid);
            if(E1==null)
              System.out.println("Record not found....");  
           else
            {
                //System.out.println(E1);
                System.out.println(E1.getEmpid());
                System.out.println(E1.getEmpname());
                System.out.println(E1.getEmpsalary());
                System.out.println(E1.getEmpdept());
                System.out.println("Are your sure want to delete");
                String choice;
                choice=scan.next();
                if(choice.equals("y") || choice.equals("Y"))
                {
                      if(ed.deleteById(eid))
                          System.out.println("Record deleted........");
                }
            }  

 }
 
 
 
 public static void searchAllrecord() throws Exception
 {
    
        EmployeeDAO ed=new EmployeeDAO();
        List<Employee>mylist1=new ArrayList<Employee>();
            mylist1=ed.searchAll();
            for(Employee E:mylist1)
            {
               System.out.println(E.getEmpid()+ "  " + E.getEmpname() + "  " + E.getEmpsalary() + "  " + E.getEmpdept()); 
            }
 
 }
 
 public static void searchDataById() throws Exception
 {
                  int eid;
            Scanner scan=new Scanner(System.in);
            EmployeeDAO ed=new EmployeeDAO();           
            System.out.println("Enter Employee Id");
            eid=scan.nextInt();
            Employee E1=null;
            E1=ed.searchById(eid);
            if(E1==null)
              System.out.println("Record not found....");  
           else
            {
                //System.out.println(E1);
                System.out.println(E1.getEmpid());
                System.out.println(E1.getEmpname());
                System.out.println(E1.getEmpsalary());
                System.out.println(E1.getEmpdept());
            }  
    }

 
 }        
 

