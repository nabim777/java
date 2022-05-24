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
class Student extends Person
{
	 enum Status 
	 {
		freshman,
		sophomore,
		junior,
		senior
	 };
	 Status status;
	 public Status getStatus()
	 {
		 return status;
	 }
	 public void setStatus(Status s)
	 {
		 status=s;
	 }

	public Student(String nam, String addr, String mail, long phone, Status status) 
	{
		super(nam, addr, mail, phone);
		this.status = status;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " Status:" + status;
	}

}
