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
class PartTime extends Staff
{
    private int hours;
	private double wagePerHour;
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public PartTime(String name, String address, String email, long phone_number, String off, double sal, MyDate d, String title, int hours , double whrs) 
    {
        super(name, address, email, phone_number, off, sal, d, title);
        this.hours = hours;
		wagePerHour= whrs;
		super.setSalary((hours*wagePerHour));
		
    }
	
    @Override
	public String toString()
	{
		return "Part Time Employee "+ super.toString();
	}
	
}

