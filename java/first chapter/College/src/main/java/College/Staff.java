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

class Staff extends Employee
{
	protected String title;
	public void setTitle(String t)
	{
		title=t;
	}
	public String getTitle()
	{
		return title;
	}

    public Staff( String name, String address, String email, long phone_number, String off, double sal, MyDate d, String title) {
        super(name, address, email, phone_number, off, sal, d);
        this.title = title;
    }
	
	public String toString()
	{
		return super.toString() + " title" + title; 
	}
}
