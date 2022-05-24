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
class Faculty extends Employee
{
	private String rank;
	private int hours;
	public int getHours()
	{
		return hours;
	}
	public void setHours(int hour)
	{
		hours=hour;
	}
	public String getRank()
	{
		return rank;
	}
	public void setRank(String r)
	{
		rank=r;
	}

    public Faculty(String rank, int hours, String name, String address, String email, long phone_number, String off, double sal, MyDate d) 
    {
        super(name, address, email, phone_number, off, sal, d);
        this.rank = rank;
        this.hours = hours;
    }
	
	
        @Override
	public String toString()
	{
		return super.toString() + " Faculty rank" +rank;
	}
}