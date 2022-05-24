/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package College;

/**
 *
 * @author eerie
 */class Employee extends Person
{
	protected String office;
	protected double salary;
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double sal)
	{
		salary = sal;
	}
	public String getOffice()
	{
		return office;
	}
	
	public void setOffice(String off)
	{
		office=off;
	}
	protected MyDate date;
	public MyDate getDate()
	{
		return date;
	}
	public void setDate(MyDate d)
	{
		date=d;
	}
	
	public Employee(String name,String address, String email, long phone_number,String off, double sal, MyDate d)
	{
		super(name,address,email,phone_number);
		office=off;
		salary=sal;
		date=d;
	}
	@Override
	public String toString()
	{
		return super.toString() + " office:" + office + " Salary" + salary + " hired date:" + date;
	}
}
