/*
 Implement a console based software system in java having following entities:

 Date has following attributes
 1. Day
 2. Month
 3. year
 
 Address has following attributes
 1. House Number
 2. Street Name
 3. ward
 4. Municipality/VDC
 5. District
 6. Province
 7. Country
 

 Program has following attributes
 1. Name of program
 2. Duration
 3. Level (Bachelor or Masters)

 An exam component has following attributes
 1. Type (Test, Exam, Assignment, Quizz, Presentation)
 2. Full marks
 3. Pass marks
 4. Weightage
 5. Obtained marks

 A subject has following attributes
 1. Name
 2. Code
 3. Credit
 4. Exam components

 Result contains
 1. Student Roll Number
 2. Subject list
 3. Marks list

Each student has following attributes
 1. Name
 2. Address
 3. Date of Birth
 4. Roll Number
 5. List of subjects 
 6. Program
 7. Semester
 8. Result 

 College has following properties
 1. College name
 2. Establishment Date
 3. Address
 4. List of programs
 5. List of students
 

 

 

 

 
 

 
 
 The college class should provide following functionalities:
 1. Provision of parameterized constructor to create objects of college
 2. Display programs offered by college
 3. List students according to program
 4. Display total number of students in the college
 5. Display summarized information of college
 6. Display students according to address
 7. Display results of student according to roll number 
 
 
 The class student should provide following functionalities:
 1. Display student details 
 2. Display results 
 3. Verify if age of student is greater than 40
 4. Display subjects being studied by student which has Quizz as exam component
 5. Tell if a student has passed in a particular subject or not.
 6. Tell the age of student

 The class subject should provide following functionalities:
 1. Display subject details
 2. Verify if presentation is exam component of a subject or not.
 
 
 
*/


class MyDate
{
  private int day, month, year;
  //finalructor of class Date
  MyDate(int d, int m, int y){
	  day=d;
	  month=m;
	  year=y;
  }
  public void setDay(int d){ day=d; } //setter method
  public int getDay(){ return day; } // getter method
  public void setMonth(int m){ month=m; } //setter method
  public int getMonth(){ return month; } // getter method
  public void setYear(int y){ year=y; } //setter method
  public int getYear(){ return year; } // getter method
}

class Address
{
  private int housenumber, ward;
  private String street, province , district, country;
  //finalructor of class Address
  Address(int hn, int w, String str, String pr, String dis, String coun){
	 housenumber=hn;
	 ward = w;
	 street = str;
	 province = pr;
	 district = dis;
	 country = coun;
  }
  
  public void setHouseNumber(int d){ housenumber=d; } //setter method
  public int getHouseNumber(){ return housenumber; } // getter method
  public void setWard(int w){ ward=w; } //setter method
  public int getward(){ return ward; } // getter method
  public void setStreet(String str){ street=str; } //setter method
  public String getStreet(){ return street; } // getter method
  public void setProvince(String p){ province=p; } //setter method
  public String getProvince(){ return province; } // getter method
  public void setDistrict(String d){ district=d; } //setter method
  public String getDistrict(){ return district; } // getter method
  public void setCountry(String c){ country=c; } //setter method
  public String getCountry(){ return country; } // getter method
}

class ExamComponent
{
   /* 
      Exam component  Numeric code
	  -------------	  ------------
      Test			- 0
	  Exam			- 1
	  Assignment	- 2
	  Quizz			- 3
	  Presentation	- 4
   
   */
   private int type, fullMark, passMark, weightage;	
   ExamComponent(int typ, int fm, int pm , int weight)   
   {
	  type = typ;
      fullMark = fm;
      passMark = pm;	
      weightage = weight;	  
   }
   
  public void setType(int t){ type=t; } //setter method
  public int getType(){ return type; } // getter method
  public void setFullMark(int fm){ fullMark=fm; } //setter method
  public int getFullMark(){ return fullMark; } // getter method
  public void setPassMark(int pm){ passMark=pm; } //setter method
  public int getPassMark(){ return passMark; } // getter method   
  public void setWeightage(int w){ weightage=w; } //setter method
  public int getWeightage(){ return weightage; } // getter method 
}

class Subject
{

	private String name, code;
	private int credit;
    private ExamComponent excomponents[];
	Subject(String nm, String cd, int crd, ExamComponent list[])
	{
		this.name = nm;
		this.code = cd;
		this.credit = crd;
		this.excomponents = list;
	}
  public void setName(String nm){ name=nm; } //setter method
  public int getName(){ return name; } // getter method
  public void setCode(String cd){ code=cd; } //setter method
  public String getCode(){ return code; } // getter method
  public void setCredit(int cr){ credit=cr; } //setter method
  public int getCredit(){ return credit; } // getter method 
  public void setType(int t){ type=t; } //setter method
  public int getType(){ return type; } // getter method
  public void setFullMark(int fm){ fullMark=fm; } //setter method
  public int getFullMark(){ return fullMark; } // getter method
  public void setExamComponents(ExamComponent ec[]){ excomponents=ec; } //setter method
  public ExamComponent[] getExamComponents(){ return excomponents; } // getter method 
  

}
	

class C
{
   public static void PRT(String s){System.out.print(s);}
   public static void PRTL(String s){System.out.println(s);}

   static final int EXMTYPE_TEST=0, EXMTYPE_EXAM=1, EXMTYPE_ASSIGNMENT=2, EXMTYPE_QUIZZ=3, EXMTYPE_PRESENTATION=4, EXMTYPE_PRACTICALTEST=5;
   static final String EXAMTYPE[] = {"Written Test", "Exam", "Assignemnt", "Quizz", "Presentation", "Practical Test"};
   
   static final int PROGRAM_BACHELOR=0, PROGRAM_MASTER=1;
   static final String PROGRAMTYPE[] = {"Bachelor", "Master"};
   
   static final int CP=0, CITW=1, ITM=2, MCFC=3, FSD=4, PD=5;
   static final String BSCIT1SUBJECTS[] = {"C Programming", "Computing and IT in Workplace", "Introduction to Management", 
                                            "Mathematical Concepts for Computing", "Fundamentals of Software Development", "Personality Development"};
   static final String BSCIT1SUBJECTCODES[] = {"CT018-3-1", "CT006-3-1", "BM007-3-1", "AQ010-3-1", "CT010-3-1", "NP-LBEF002"};
   
   static final int NP=0, SAD=1, IN=2, IDB=3, TC=4, FWDD=5, OSCA=6;
   static final String BSCIT2SUBJECTS[] = {"Nepal Parichay", "System Analysis and Design", "Introduction to Networks", 
                                            "Introduction to Databases", "Technical Communication", "Fundamentals of Web Design and Development",
                                            "Operating Systems and Computer Architecture"};
   static final String BSCIT2SUBJECTCODES[] = {"NP-LBEF001", "CT026-3-1", "CT043-3-1", "CT042-3-1", "NP-LBEF003", "CT053-3-1", "CT049-3-1"};											
   static final int EET=0, CI=1, OODJ=2, SNA=3, SDM=4, PSMOD=5, MWT=6;
   static final String BSCIT3SUBJECTS[] = {"Employee and Employment Trends", "Creativity and Innovation", "Object Oriented Development with Java", 
                                            "System and Network Administration", "System Development Methods", "Probability and Statistical Modeling",
											"Mobile and Wireless Technology"};		
   static final String BSCIT3SUBJECTCODES[] = {"MPU 3362", "BM006-3-2", "CT038-3-2", "CT106-3-2", "CT046-3-2", "AQ077-3-2", "CT090-3-2"};	
   
											
   static final int MA=0, MC=1, HRM=2, OB=3, SDM=4;
   static final String MBA1SUBJECTS[] = {"Managerial Accounting", "Managerial Communication", "Human Resource Management", 
                                            "Organization Behavior", "Statistical Decision Making"};
   static final String MBA1SUBJECTCODES[] = {"NPLBEFM001", "NPLBEFM002", "BM032-3-M", "BM034-3-M", "AQ054-3-M"};	
											
   static final int SMM=0, MF=1, ME=2, MCI=3, BL=4;
   static final String MBA2SUBJECTS[] = {"Strategic Marketing Management", "Managerial Finance", "Managerial Economics", 
                                            "Managing Creativity and Innovation", "Business Law"};
   static final String MBA2SUBJECTCODES[] = {"BM011-3-M", "AQ035-3-M", "MB033-3-M", "BM017-3-M", "NPLBEFM003"};	
   
   static final int TXN=0, RM=1, MO=2, GSM=3, TM=4;
   static final String MBA3SUBJECTS[] = {"Taxation", "Research Methodology", "Managing Organizations", 
                                            "Global Strategic Management", "Technology Management"};
   static final String MBA3SUBJECTCODES[] = {"NPLBEFM004", "BM054-6-M", "BM020-3-M", "BM039-3-M", "CT081-3-M"};	
   
   static final int ENT=0, PJ=1;
   static final String MBA4SUBJECTS[] = {"Entrepreneuership", "Project"};	
   static final String MBA4SUBJECTCODES[] = {"BM038-3-M", "BM053-12-M"};	   
}

class Program
{
	/*
      Level  		   Numeric code
	  -------------	  ------------
      Bachelor			- 0
	  Masters			- 1	   
	
	*/
	
     private String name;
     private int duration,level;
     Program (String nam, int dur, int lev)
	 {
		 name = nam;
         duration = dur;
         level = lev;		 
	 }
     public void setName(int nam){ name=nam; } //setter method
     public String getName(){ return name; } // getter method
     public void setDuration(int d){ duration=d; } //setter method
     public int getDuration(){ return duration; } // getter method
     public void setLevel(int lv){ level=lv; } //setter method
     public int getLevel(){ return level; } // getter method
}

class Result
{
  private int rollNumber;
  private Subject subjectList[];
  private int marksList[];
  Result(int rn, Subject sl[], int ml[])
  {
	rollNumber = rn;
    subjectList = sl;
    marksList = ml;	
  }
  public void setRollNumber(int roll){ rollNumber=roll; } //setter method
  public int getRollNumber(){ return rollNumber; } // getter method
  public void setSubjectList(Subject subs[]){ subjectList=subs; } //setter method
  public Subject[] getSubjectList(){ return subjectList; } // getter method 
  public void setMarksList(int marks[]){ marksList=marks; } //setter method
  public int[] getMarksList(){ return marksList; } // getter method 
}

class Student
{
    private String name;
    private Address adr;
    private MyDate dob;
    private int roll;
    private Subject subjectList[]; 
    private Program program;
    private int semester;
    private Result result;
	
	public Student(String nam, Address ad, MyDate db, int rol, Subject slist[], Program p, int sem, Result res)
	{
		name=nam;
		adr=ad;
		dob=db;
		roll=rol;
		subjectList=slist;
		program=p;
		semester=sem;
		result=res;
	}
    public void setName(String nam){ name=nam; } //setter method
    public String getName(){ return name; } // getter method
    public void setAddress(Address adrs){ adr=adrs; } //setter method
	public Address getAddress(){ return adr; } // getter method
    public void setDOB(MyDate dat){ dob=dat; } //setter method
	public MyDate getDOB(){ return dob; } // getter method
	public void setRoll(int rol){ roll=rol; } // getter method
    public int getRoll(){ return roll; } // getter method
    public void setSubjectList(Subject subs[]){ subjectList=subs; } //setter method
    public Subject[] getSubjectList(){ return subjectList; } // getter method 
    public void setProgram(Program p){ program=p; } //setter method
    public Program getProgram(){ return program; } // getter method 
    public void setSemester(int sem){ semester=sem; } //setter method
    public int getSemester(){ return semester; } // getter method
    public void setResult(Result r){ result=res; } //setter method
    public Result getResult(){ return result; } // getter method 
}

public class College
{
	String name;
	Address adr;
	Date dateOfEstablishment;
	Program programList[];
	Student studentList[];
	//finalructor of class College
	College(String name, Address ad, Date doe, Program prgList[], Student studList[])
	{
		this.name = name;
		this.adr=ad;
		this.dateOfEstablishment=doe;
		this.programList=prgList;
		this.studentList=studList;
	}
	
    public void setName(String name){ this.name=name; } //setter method
    public String getName(){ return name; } // getter method
    public void setAddress(Address adr){ this.adr=adr; } //setter method
    public Address getAddress(){ return adr; } // getter method 
    public void setProgramList(Program plist[]){ programList=plist; } //setter method
    public Program[] getProgramList(){ return programList; } // getter method 	
    public void setStudentList(Student slist[]){ studentListList=slist; } //setter method
    public Student[] getStudentList(){ return studentList; } // getter method 
	
	
	public static void main(String args[])
	{
		
	}
}



