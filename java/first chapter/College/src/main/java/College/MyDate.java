/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package College;
import java.util.GregorianCalendar;
/**
 *0
 * @author eerie
 */
class MyDate
{
	int year,month,day;
	public MyDate()
	{
		GregorianCalendar c=  new GregorianCalendar();
		day = c.get(GregorianCalendar.DAY_OF_MONTH);
		month = c.get(GregorianCalendar.MONTH) +1;
		year = c.get(GregorianCalendar.YEAR);
	}
        @Override
	public String toString()
	{
		return day + "-" + month + "-" +year;
	}
}
