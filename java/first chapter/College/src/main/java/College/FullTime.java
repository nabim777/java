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
class FullTime extends Staff
{

    public FullTime(String name, String address, String email, long phone_number, String off, double sal, MyDate d, String title) {
        super(name, address, email, phone_number, off, sal, d, title);
    }
        @Override
	public String toString()
	{
		return "Full time employee: "+super.toString(); 
	}
	
	
}