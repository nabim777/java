import java.util.GregorianCalendar;

class Person
{
	protected String name,address,email;
	protected long phone_number;
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String getEmail()
	{
		return email;
	}
	
	public long getPhone()
	{
		return phone_number;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setName(long phone)
	{
		phone_number=phone;
	}
	public Person(String nam, String addr, String mail, long phone)
	{
		name=nam;
		address=addr;
		email=mail;
		phone_number =phone;
	}
	
	@Override
	public String toString()
	{
		return "Name:" + name + " Address:" + address+ " email:" + email + " phone number:" +phone_number;
	}
	
	
	
}

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

class Employee extends Person
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

public class College 
{
    public static void main(String args[])
    {
        Student std = new Student("Ram","Kathmandu","ram123@gmail.com",98000000,Student.Status.junior);
        System.out.println(std);
		PartTime pt = new PartTime("Hari", "Pokhara", "Hari98@gmial.com", 98000000, "Public Relations" , 0 , new MyDate(),"Part Timer",5, 500.00);
		System.out.println(pt);
    
    }
}