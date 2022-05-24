/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package College;

/**
 *
 * @author eerie
 */
public class College 
{
    public static void main(String args[])
    {
        Student std = new Student("Ram","Kathmandu","ram123@gmail.com",98000000,Student.Status.junior);
        System.out.println(std);
	PartTime pt = new PartTime("Hari", "Pokhara", "Hari98@gmail.com", 98000000, "Public Relations" , 0 , new MyDate(),"Part Timer",5, 500.00);
	System.out.println(pt);
        Employee emp = new Employee("Shyam","Butwal", "Shyam11@gmail.com", 98000000,"Public Relations" ,50000.00, new MyDate());
        System.out.println(emp);
    
    }
}
