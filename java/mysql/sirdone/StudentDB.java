import java.util.*;

public class StudentDB
{
	public static void main(String args[])
	{
		int choose;
		int idd;
		Student st;
		Scanner scan = new Scanner(System.in);
		StudentQuery sq= new StudentQuery();
		while(true)

		{
			prt("Student Management System");
			prt("-------------------------");
			prt("1.INSERT student");
			prt("2.SEARCH student by name");
			prt("3.DELETE student");
			prt("4.UPDATE student");
			prt("5.LIST all student");
			prt("-------------------------");
			prt("Choose an option:");
			choose = scan.nextInt();
			
			switch(choose)
			{
				case 1: st = createStudent();
					sq.insertStudent(st); 
					break;

				case 2: prt("Enter name of student");
					String name= scan.next();
					sq.searchStudent(name);
					break;

				case 3: 

				case 4: prt("Enter id of student for update");
					idd= scan.nextInt();
					sq.updateCity(idd); break;
					

				case 5: sq.listAllStudents();
			}
		}
	}

	public static void prt(String s)
	{
		System.out.println(s);
	}

	public static Student createStudent()
	{
		String name, phone, city;
		Scanner scan1 = new Scanner(System.in);

		prt("Enter Details of Student:");
		prt("Name: "); name=scan1.next();
		prt("Phone No: "); phone=scan1.next();
		prt("City: "); city=scan1.next();

		Student s = new Student(name, phone, city);
		return s;
	}
}
