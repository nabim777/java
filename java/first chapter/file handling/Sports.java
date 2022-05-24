/*
 *   Develop a console based java application for management of a football league.
 *
 *   A football league has following attributes:
 *   1) ID
 *   2) Name
 *   3) Establishment Date
 *   4) List of clubs
 *   5) Country
 *
 *   A club has following attributes:
 *   1) ID
 *   2) Name
 *   3) establishment date
 *   4) Position in current season
 *   5) List of players
 *
 *   A player has following attributes:
 *
 *   1) ID
 *   2) Name
 *   3) Date of Birth
 *   4) Playing position
 *       0 - goalkeeper
 *       1 - defender
 *       2 - striker   
 *       3 - midfield
 *       4 - left wing
 *       5 - right wing
 *   5) salary
 *   6) Nationality
 *   7) Goals scored
 *
 *
 *   Following facilities should be provided by the appliction:
 *   1) Display details of all the clubs in a league
 *   2) Display all the players in a club
 *   3) Display players according to nationality
 *   4) Display details of a single player
 *   5) Display the league table for the current season
 *   6) Display players of league accordig to playing position
 *   7) Update salary , dob and goals scored by a player
 *   8) Delete a player 
 *   9) Transfer a player to another club
 *   10) Register player
 *   11) Register club
 *   12) Register league 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
class Player
{
	
	 private int ID;
     private String name;
     private String dob;
     private String position;
     private double salary;
     private String nationality;
     private int goalsScored;
	
	 Player(int ID, String name, String dob, String position, double salary,String nationality, int goalsScored)
	 {
	 	this.ID = ID;
	 	this.dob=dob;
	 	this.goalsScored=goalsScored;
	 	this.name=name;
	 	this.nationality=nationality;
	 	this.position=position;
	 	this.salary = salary;
	 }
	 
	 public void setID(int id){ this.ID = id; }
	 public int getID(){ return ID;}
	 public void setName(String name){ this.name = name; }
	 public String getName(){ return name;}
	 public void setDob(String db){ this.dob = db; }
	 public String getDob(){ return dob;}	 
	 public void setPosition(String p){ this.position = p; }
	 public String getPosition(){ return this.position;}	
	 public void setSalary(double s){ this.salary = s; }
	 public double getSalary(){ return this.salary;}
	 public void setNationality(String n){ this.nationality = n; }
	 public String getNationality(){ return this.nationality;}
	 public void setGoalsScored(int g){ this.goalsScored = g; }
	 public int getGoalsScored(){ return this.goalsScored;}
	 
	 public static void display(int id)
	 {
	 	int pid;
	 	try
	 	{
		 	File file = new File("Player.txt");
		 	FileReader reader = new FileReader(file);
		 	BufferedReader br = new BufferedReader(reader);
		 	StringTokenizer st;
		 	String s; int club;
		 	int i;
		 	while((s=br.readLine()) != null)
		 	{
		 		st = new StringTokenizer(s, ",");
		 		pid = Integer.parseInt(st.nextToken());
		 		if(id == pid)
		 		{
		 		   System.out.print ("\nID:" + pid);
		 		   System.out.print("  Name:" + st.nextToken());
		 		   System.out.print("  Date of Birth:" + st.nextToken());
		 		   System.out.print("  Nationality:" + st.nextToken() );
		 		   System.out.print("  Salary:" + st.nextToken() );
		 		   System.out.print("  Goal Scored:" + st.nextToken());
		 		   System.out.print("  Position:" + st.nextToken());
		 		   
		 		}
		 		
		 	}
		 	br.close();
		 	reader.close(); 		
	 	}catch(Exception e)
	 	{
	 		
	 	}
	 }
	 public static void registerPlayer(Player p)
	 {
	 	try
	 	{
		 	File f = new File("Player.txt");
		 	FileWriter fw= new FileWriter(f,true);
		 	BufferedWriter bw = new BufferedWriter(fw);
		 	PrintWriter out= new PrintWriter(bw);
		 	out.print(p.getID()+ ",");
		 	out.print(p.getName()+ ",");
		 	out.print(p.getDob()+ ",");
		 	out.print(p.getNationality()+ ",");
		 	out.print(p.getSalary()+ ",");
		 	out.print(p.getGoalsScored()+ ",");
		 	out.print(p.getPosition());
		 	out.print("\n");
		 	out.close();
		 	bw.close();
		 	fw.close();
	 	}catch(Exception e)
	 	{
	 		System.out.println(e);
	 	}
	 	
	 	
	 }
	 public static void displayPlayersAccordingToNationality(String nat)
	 {
	 	String country; int pid;
	 	try
	 	{
		 	File file = new File("Player.txt");
		 	FileReader reader = new FileReader(file);
		 	BufferedReader br = new BufferedReader(reader);
		 	StringTokenizer st;
		 	String s; int club;
		 	int i;
		 	while((s=br.readLine()) != null)
		 	{	
		 		st = new StringTokenizer(s, ",");
		 		pid = Integer.parseInt(st.nextToken());
		 		st.nextToken();
		 		st.nextToken();
		 		country = st.nextToken();
		 		if(nat.equalsIgnoreCase(country))
		 		{
					Player.display(pid);		 		   
		 		}
		 		
		 	}
		 	br.close();
		 	reader.close(); 		
	 	}catch(Exception e)
	 	{
	 		
	 	}
	 }
	 public static void displayPlayersAccordingToPosition(String pos)
	 {
	 	String poss; int pid;
	 	try
	 	{
		 	File file = new File("Player.txt");
		 	FileReader reader = new FileReader(file);
		 	BufferedReader br = new BufferedReader(reader);
		 	StringTokenizer st;
		 	String s; int club;
		 	int i;
		 	while((s=br.readLine()) != null)
		 	{
		 		st = new StringTokenizer(s, ",");
		 		pid = Integer.parseInt(st.nextToken());
		 		st.nextToken();
		 		st.nextToken();
		 		st.nextToken();
		 		st.nextToken();
		 		st.nextToken();
		 		poss = st.nextToken();
		 		if(pos.equalsIgnoreCase(poss))
		 		{
					Player.display(pid);		 		   
		 		}
		 		
		 	}
		 	br.close();
		 	reader.close(); 		
	 	}catch(Exception e)
	 	{
	 		
	 	}
	 }
  public static void updateSalary(int id) throws IOException
	 {
		int pid;
		double updatedSalary;
	 	BufferedReader areader = new BufferedReader(new InputStreamReader(System.in));
	 	System.out.println("Enter Updated Salary");
	 	updatedSalary= Double.parseDouble(areader.readLine());
	 	try
	 	{	
		 	File file = new File("Player.txt");
		 	FileReader reader = new FileReader(file);
		 	BufferedReader br = new BufferedReader(reader);
		 	File f = new File("Temp.txt");
		 	FileWriter fw= new FileWriter(f);
		 	BufferedWriter bw = new BufferedWriter(fw);
		 	PrintWriter out= new PrintWriter(bw);
		 	StringTokenizer st;
		 	String s; int club;
		 	while((s=br.readLine()) != null)
		 	{
		 		st = new StringTokenizer(s, ",");
		 		pid = Integer.parseInt(st.nextToken());
		 		if(pid!=id)
		 		{
				 	out.print(pid+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(Double.parseDouble(st.nextToken())+ ",");
				 	out.print(Integer.parseInt(st.nextToken())+ ",");
				 	out.print(st.nextToken()+"\n");

		 		}
		 		else
		 		{
		 			out.print(pid+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(updatedSalary+ ",");
				 	st.nextToken();
				 	out.print(Integer.parseInt(st.nextToken())+ ",");
				 	out.print(st.nextToken()+"\n");	
		 		}
		 	}
		 		out.close();
				bw.close();
				fw.close();
				br.close();
		 	 	reader.close();	
 			if(!file.delete())
		 	{
        			System.out.println("Could not delete file");
        			return;
      		}
      		if (!f.renameTo(file))
      		{
      			 
        		System.out.println("Could not rename file");
        		return;
      		}
	 	}catch(Exception e)
	 	{
	 		
	 	}
	 }
	 public static void updateDOB(int id) throws IOException
	 {
		int pid;
		String updatedDOB;
	 	BufferedReader areader = new BufferedReader(new InputStreamReader(System.in));
	 	System.out.println("Enter Updated DOB");
	 	updatedDOB= areader.readLine();
	 	try
	 	{   
		 	File file = new File("Player.txt");
		 	FileReader reader = new FileReader(file);
		 	BufferedReader br = new BufferedReader(reader);
		 	File f = new File("Temp.txt");
		 	FileWriter fw= new FileWriter(f);
		 	BufferedWriter bw = new BufferedWriter(fw);
		 	PrintWriter out= new PrintWriter(bw);
		 	StringTokenizer st;
		 	String s; int club;
		 	while((s=br.readLine()) != null)
		 	{
		 		st = new StringTokenizer(s, ",");
		 		pid = Integer.parseInt(st.nextToken());
		 		if(pid!=id)
		 		{
				 	out.print(pid+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(Double.parseDouble(st.nextToken())+ ",");
				 	out.print(Integer.parseInt(st.nextToken())+ ",");
				 	out.print(st.nextToken()+"\n");

		 		}
		 		else
		 		{
		 			out.print(pid+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(updatedDOB+ ",");
				 	st.nextToken();
				 	out.print(st.nextToken()+ ",");
				 	out.print(Double.parseDouble(st.nextToken())+ ",");
				 	out.print(Integer.parseInt(st.nextToken())+ ",");
				 	out.print(st.nextToken()+"\n");	
		 		}
		 	}
		 		out.close();
				bw.close();
				fw.close();
				br.close();
		 	 	reader.close();	
 			if(!file.delete())
		 	{
        			System.out.println("Could not delete file");
        			return;
      		}
      		if (!f.renameTo(file))
      		{
      			 
        		System.out.println("Could not rename file");
        		return;
      		}
	 	}catch(Exception e)
	 	{
	 		
	 	}
	 }
	 public static void updateGoalsScored(int id) throws IOException
	 {
		int pid;
		int updatedGoal;
	 	BufferedReader areader = new BufferedReader(new InputStreamReader(System.in));
	 	System.out.println("Enter Updated Goals Scored:");
	 	updatedGoal= Integer.parseInt(areader.readLine());
	 	try
	 	{	
		 	File file = new File("Player.txt");
		 	FileReader reader = new FileReader(file);
		 	BufferedReader br = new BufferedReader(reader);
		 	File f = new File("Temp.txt");
		 	FileWriter fw= new FileWriter(f);
		 	BufferedWriter bw = new BufferedWriter(fw);
		 	PrintWriter out= new PrintWriter(bw);
		 	StringTokenizer st;
		 	String s; int club;
		 	while((s=br.readLine()) != null)
		 	{
		 		st = new StringTokenizer(s, ",");
		 		pid = Integer.parseInt(st.nextToken());
		 		if(pid!=id)
		 		{
				 	out.print(pid+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(Double.parseDouble(st.nextToken())+ ",");
				 	out.print(Integer.parseInt(st.nextToken())+ ",");
				 	out.print(st.nextToken()+"\n");

		 		}
		 		else
		 		{
		 			out.print(pid+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(Double.parseDouble(st.nextToken())+ ",");
				 	out.print(updatedGoal+ ",");
				 	st.nextToken();
				 	out.print(st.nextToken()+"\n");	
		 		}
		 	}
		 		out.close();
				bw.close();
				fw.close();
				br.close();
		 	 	reader.close();
 			if(!file.delete())
		 	{
        			System.out.println("Could not delete file");
        			return;
      		}
      		if (!f.renameTo(file))
      		{
      			 
        		System.out.println("Could not rename file");
        		return;
      		}
	 	}catch(Exception e)
	 	{
	 		
	 	}
	 }
	 
	 public static void deletePlayer(int id)
	 {
	 	int pid;
	 	try
	 	{	
		 	File file = new File("Player.txt");
		 	FileReader reader = new FileReader(file);
		 	BufferedReader br = new BufferedReader(reader);
		 	File f = new File("Temp.txt");
		 	FileWriter fw= new FileWriter(f);
		 	BufferedWriter bw = new BufferedWriter(fw);
		 	PrintWriter out= new PrintWriter(bw);
		 	StringTokenizer st;
		 	String s; int club;
		 	int i;
		 	while((s=br.readLine()) != null)
		 	{
		 		st = new StringTokenizer(s, ",");
		 		pid = Integer.parseInt(st.nextToken());
		 		if(pid!=id)
		 		{
				 	out.print(pid+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(st.nextToken()+ ",");
				 	out.print(Float.parseFloat(st.nextToken())+ ",");
				 	out.print(Integer.parseInt(st.nextToken())+ ",");
				 	out.print(st.nextToken()+"\n");

		 		}
		 	}
		 		out.close();
				bw.close();
				fw.close();
				br.close();
		 	    reader.close();	
		 	
 			if(!file.delete())
		 	{
        			System.out.println("Could not delete file");
        			return;
      		}
      		if (!f.renameTo(file))
      		{
      			 
        		System.out.println("Could not rename file");
        		return;
      		}
	 	}catch(Exception e)
	 	{
	 		
	 	}
	 }
}

 
class Club
{
	 private int ID;
     private String name;
     private String establishmentDate;
     private int position;
     private Player playerList[];
	
	 Club(int ID, String name, String doe, int position, Player plist[])
	 {
	 	this.ID = ID;
	 	this.establishmentDate=doe;
	 	this.name=name;
	 	this.position=position;
	 	this.playerList = plist;
	 }
	 
	 public void setID(int id){ this.ID = id; }
	 public int getID(){ return ID;}
	 public void setName(String name){ this.name = name; }
	 public String getName(){ return name;}
	 public void setDateOfEstablishment(String de){ this.establishmentDate = de; }
	 public String getDateOfEstablishment(){ return this.establishmentDate;}	 
	 public void setPosition(int p){ this.position = p; }
	 public int getPosition(){ return this.position;}	
	 public void setPlayerList(Player l[]){ this.playerList = l; }
	 public Player[] getPlayerList(){ return this.playerList;}
	 
	 
	 public static void display(int id)
	 {
	 	int cid;
	 	try
	 	{
		 	File file = new File("Club.txt");
		 	FileReader reader = new FileReader(file);
		 	BufferedReader br = new BufferedReader(reader);
		 	StringTokenizer st;
		 	String s; int club;
		 	int i;
		 	while((s=br.readLine()) != null)
		 	{
		 		st = new StringTokenizer(s, ",");
		 		cid = Integer.parseInt(st.nextToken());
		 		if(id == cid)
		 		{
		 		   System.out.print ("\nID:" + cid);
		 		   System.out.print("\tName:" + st.nextToken() );
		 		   System.out.print("\tDate of Establishment:" + st.nextToken() );
		 		   System.out.print("\tPosition:" + st.nextToken() );
		 		   
		 		}
		 		
		 	}
		 	br.close();
		 	reader.close(); 		
	 	}catch(Exception e)
	 	{
	 		
	 	}
	 }
	 public static void displayPlayers(int cid)
	 {
	 	int pid;
	 	try
	 	{
		 	File file = new File("clubplayer.txt");
		 	FileReader reader = new FileReader(file);
		 	BufferedReader br = new BufferedReader(reader);
		 	StringTokenizer st;
		 	String s; int club;
		 	while((s=br.readLine()) != null)
		 	{
		 		st = new StringTokenizer(s, ",");
		 		club = Integer.parseInt(st.nextToken());
		 		if(club == cid)
		 		{
		 		   pid = Integer.parseInt(st.nextToken());
		 		   Player.display(pid);
		 		   
		 		}
		 		
		 	}
		 	br.close();
		 	reader.close(); 		
	 	}catch(Exception e)
	 	{
	 		
	 	}

	 }
	 public static void registerClub(Club c)
	 {
	 
	 	try
	 	{
		 	File f = new File("Club.txt");
		 	FileWriter fw= new FileWriter(f,true);
		 	BufferedWriter bw = new BufferedWriter(fw);
		 	PrintWriter out= new PrintWriter(bw);
		 	out.print(c.getID()+ ",");
		 	out.print(c.getName()+ ",");
		 	out.print(c.getDateOfEstablishment()+ ",");
		 	out.print(c.getPosition());
		 	out.print("\n");
		 	out.close();
		 	bw.close();
		 	fw.close();
	 	}catch(Exception e)
	 	{
	 		System.out.println(e);
	 	}
	 }
}
 
class League
{
	 private int ID;
     private String name;
     private String establishmentDate;
     private String country;
     private Club clubList[];
	
	 League(int ID, String name, String doe, String country, Club clist[])
	 {
	 	this.ID = ID;
	 	this.establishmentDate=doe;
	 	this.name=name;
	 	this.country=country;
	 	this.clubList = clist;
	 }
	 
	 League()
	 {
	 	
	 }
	 
	 public void setID(int id){ this.ID = id; }
	 public int getID(){ return ID;}
	 public void setName(String name){ this.name = name; }
	 public String getName(){ return name;}
	 public void setDateOfEstablishment(String de){ this.establishmentDate = de; }
	 public String getDateOfEstablishment(){ return this.establishmentDate;}	 
	 public void setCountry(String c){ this.country = c; }
	 public String getCountry(){ return this.country;}	
	 public void setClubList(Club l[]){ this.clubList = l; }
	 public Club[] getClubList(){ return this.clubList;}
	 
	 
	 
	 public void displayLeagueTable()
	 {
	 	Club clubs[] = getClubList();
	 	Arrays.sort(clubs, new Comparator<Club>()
	 	{
	 		public int compare(Club a,Club b)
	 		{
	 			return a.getPosition() - b.getPosition();
	 		}
	 	});
		for(Club cl : clubs )
		{
			Sports.prt("League Table:\n");
			Sports.prt(String.valueOf(cl.getPosition())+ "\t" + cl.getName());
			
		}
	 }
	 
	 public static void display(int id)
	 {
	 	int lid;
	 	try
	 	{
		 	File file = new File("Club.txt");
		 	FileReader reader = new FileReader(file);
		 	BufferedReader br = new BufferedReader(reader);
		 	StringTokenizer st;
		 	String s; int club;
		 	int i;
		 	while((s=br.readLine()) != null)
		 	{
		 		st = new StringTokenizer(s, ",");
		 		lid = Integer.parseInt(st.nextToken());
		 		if(id == lid)
		 		{
		 		   System.out.print ("\nID:" + lid);
		 		   System.out.print("\tName:" + st.nextToken() );
		 		   System.out.print("\tDate of Establishment:" + st.nextToken() );
		 		   System.out.print("\tCountry:" + st.nextToken() );
		 		   
		 		}
		 		
		 	}
		 	br.close();
		 	reader.close(); 		
	 	}catch(Exception e)
	 	{
	 		
	 	}
	 }
	 public static void displayAllClubs(int id)
	 {
	 	int lid,cid;
	 	try
	 	{
		 	File file = new File("leagueclub.txt");
		 	FileReader reader = new FileReader(file);
		 	BufferedReader br = new BufferedReader(reader);
		 	StringTokenizer st;
		 	String s; int club;
		 	int i;
		 	while((s=br.readLine()) != null)
		 	{
		 		st = new StringTokenizer(s, ",");
		 		lid = Integer.parseInt(st.nextToken());
		 		if(id == lid)
		 		{
					cid= Integer.parseInt(st.nextToken());
					Club.display(cid);
		 		   
		 		}
		 		
		 	}
		 	br.close();
		 	reader.close(); 		
	 	}catch(Exception e)
	 	{
	 		
	 	}
	 }	 
	 public static void displayPlayers(int lid)
	 {
	 	int cid;
	 	try
	 	{
		 	File file = new File("legueclub.txt");
		 	FileReader reader = new FileReader(file);
		 	BufferedReader br = new BufferedReader(reader);
		 	StringTokenizer st;
		 	String s; int leg;
		 	while((s=br.readLine()) != null)
		 	{
		 		st = new StringTokenizer(s, ",");
		 		leg = Integer.parseInt(st.nextToken());
		 		if(leg == lid)
		 		{
		 		   cid = Integer.parseInt(st.nextToken());
		 		   Club.displayPlayers(cid);
		 		   
		 		}
		 		
		 	}
		 	br.close();
		 	reader.close(); 		
	 	}catch(Exception e)
	 	{
	 		
	 	}

	 }
	 
	 public static void displayAllLeaguePlayers(int lid)
	 {
	 	int cid;
	 	try
	 	{
		 	File file = new File("legueclub.txt");
		 	FileReader reader = new FileReader(file);
		 	BufferedReader br = new BufferedReader(reader);
		 	StringTokenizer st;
		 	String s; int leg;
		 	while((s=br.readLine()) != null)
		 	{
		 		st = new StringTokenizer(s, ",");
		 		leg = Integer.parseInt(st.nextToken());
		 		if(leg == lid)
		 		{
		 		   cid = Integer.parseInt(st.nextToken());
		 		   Club.display(cid);
		 		   
		 		}
		 		
		 	}
		 	br.close();
		 	reader.close(); 		
	 	}catch(Exception e)
	 	{
	 		
	 	}

	 }
	 
		
	 public static void transferPlayer(int pid, int cid)
	 {  
	 	int playerID,clubID;
	 	try
	 	{
	 		File file = new File("clubplayer.txt");
		 	FileReader reader = new FileReader(file);
		 	BufferedReader br = new BufferedReader(reader);
		 	File f = new File("Temp.txt");
		 	FileWriter fw= new FileWriter(f);
		 	BufferedWriter bw = new BufferedWriter(fw);
		 	PrintWriter out= new PrintWriter(bw);
		 	StringTokenizer st;
		 	String s; int club;
		 	while((s=br.readLine()) != null)
		 	{
		 		st = new StringTokenizer(s, ",");
		 		clubID = Integer.parseInt(st.nextToken());
		 		playerID = Integer.parseInt(st.nextToken());
		 		if(playerID!=pid)
		 		{
				 	out.print(clubID+ ",");
					out.print(playerID+ "\n");
		 		}
		 		else 
		 		{
		 			out.print(cid+",");
		 			out.print(pid+"\n");
		 		}
		 		
		 	}
		 		out.close();
				bw.close();
				fw.close();
				br.close();
		 	 	reader.close();	
		 		
 			if(!file.delete())
		 	{
        			System.out.println("Could not delete file");
        			return;
      		}
      		if (!f.renameTo(file))
      		{
      			 
        		System.out.println("Could not rename file");
        		return;
      		}
	 	}catch(Exception e)
	 	{
	 		
	 	}
	 }
	 

	 
	 public static void registerLeague(League l)
	 {
	 	try
	 	{
		 	File f = new File("League.txt");
		 	FileWriter fw= new FileWriter(f,true);
		 	BufferedWriter bw = new BufferedWriter(fw);
		 	PrintWriter out= new PrintWriter(bw);
		 	out.print(l.getID()+ ",");
		 	out.print(l.getName()+ ",");
		 	out.print(l.getDateOfEstablishment()+ ",");
		 	out.print(l.getCountry());
			out.print("\n");
		 	out.close();
		 	bw.close();
		 	fw.close();
	 	}catch(Exception e)
	 	{
	 		System.out.println(e);
	 	}
	 }
	 
	 public static void assignPlayerToClub() 
	 {
	 	int pid=0; int cid=0;
	 	try
	 	{
		 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 	Sports.prt("Enter player ID:");
		 	pid= Integer.parseInt(br.readLine());
		 	Sports.prt("Enter club ID:");
		 	cid = Integer.parseInt(br.readLine());		
	 	}catch(IOException e)
	 	{
	 		System.out.println(e);
	 	}
	
		try
		{
			File f = new File("clubplayer.txt");
			FileWriter fw= new FileWriter(f,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out= new PrintWriter(bw);
			out.print(cid+ ",");
			out.print(pid+ "\n");
			out.close();
			bw.close();
			fw.close();
		}catch(Exception e)
		{
		System.out.println(e);
		}
	 	 	
	 	
	 }
	 
	 
	 public static void assignClubToLeague() 
	 {
	 	int cid=0; int lid=0;
	 	try
	 	{
		 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 	Sports.prt("Enter club ID:");
		 	cid= Integer.parseInt(br.readLine());
		 	Sports.prt("Enter league id:");
		 	lid = Integer.parseInt(br.readLine());		
	 	}catch(IOException e)
	 	{
	 		System.out.println(e);
	 	}
	
		try
		{
			File f = new File("leagueclub.txt");
			FileWriter fw= new FileWriter(f,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out= new PrintWriter(bw);
			out.print(lid+ ",");
			out.print(cid+ "\n");
			out.close();
			bw.close();
			fw.close();
		}catch(Exception e)
		{
		System.out.println(e);
		}
	 	 	
	 	
	 }


}



public class Sports
{
	
	public static void main(String args[]) throws IOException
	{
		int choice;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		League league = new League();
		//League league = createLeague();
		do
		{
		     prt("\nMy football league");	
		     prt("------------------");	
		     prt("1) Display details of all the clubs in  league");
		     prt("2) Display all the players in a club");
		     prt("3) Display players according to nationality");
		     prt("4) Display details of a single player");
		     prt("5) Display the league table for the current season");
		     prt("6) Display players of league according to playing position");
		     prt("7) Update salary , dob and goals scored by a player");
		     prt("8) Delete a player ");
		     prt("9) Transfer a player to another club");
		     prt("10) Register player");
		     prt("11) Register club ");
		     prt("12) Register league");
		     prt("13) Assign Player to club");
		     prt("14) Assign Club to league");
		     prt("15) Exit");		     
		     prt("Which operation to perform?\n");
		     choice = Integer.parseInt(reader.readLine());
		     switch(choice)
		     {
		     	case 1: prt("Enter league id:");
				        int lid = Integer.parseInt(reader.readLine());
					    League.displayAllClubs(lid);
					    break;
		     	case 2: prt("Enter club id:");
				        int cid = Integer.parseInt(reader.readLine());
					    Club.displayPlayers(cid);
					    break;
				case 3: Sports.prt("Enter Nationality:");
				        String nat = reader.readLine();
					    Player.displayPlayersAccordingToNationality(nat);
					    break;
				case 4: prt("Enter player id:");
				        int pid = Integer.parseInt(reader.readLine());
					    Player.display(pid);
					    break;
				case 6: prt("Enter Position:");
				        String pos = reader.readLine();
					    Player.displayPlayersAccordingToPosition(pos);
					    break;
				case 7:	
		     			prt("Enter ID of player whose details you want to update:");
		     			pid = Integer.parseInt(reader.readLine());
		     			boolean x=true;
				 		do
						{	
							prt("What information do you want to update?");
							prt("1) Salary\n");
							prt("2) Date of Birth\n");
							prt("3) Goals Scored\n");
							prt("4) Exit \n");
							int ch = Integer.parseInt(reader.readLine());
							switch(ch)
							{
								case 1: 
										Player.updateSalary(pid);
										prt("Salary of player updated succesfully!");
										break;
								case 2: Player.updateDOB(pid);
										prt("Date of birth of player updated succesfully!");
										break;
								case 3: Player.updateGoalsScored(pid);
										prt("Number of goals scored by player updated succesfully!");
										break;
								case 4: prt("Players details updated succcesfully"); x=false; break;
								default: prt("Invalid input!!Enter [1-4]!!");
							}
						}while(x);
 					    break;
				case 8: prt("Enter player id to delete:");
				        pid = Integer.parseInt(reader.readLine());
					    Player.deletePlayer(pid);
					    break;
				case 9: 
						prt("Enter Player ID you want to transfer:");
						pid = Integer.parseInt(reader.readLine());
						prt("Enter Club you want to transfer to:");
						cid = Integer.parseInt(reader.readLine());
						League.transferPlayer(pid,cid);
						break;
				

		     	case 10: 
		     			Player p = createPlayer();
		     			Player.registerPlayer(p);
		     			break; 
		     	case 11:
		     			Club c = createClub1();
		     			Club.registerClub(c);
		     			break;
		     	case 12: 
		     			League l = createLeague1();
		     			League.registerLeague(l);
		     			break;
				case 13:
						League.assignPlayerToClub();
						break;
				case 14: 
						League.assignClubToLeague();
						break;
		     	case 15:
		     			prt("Bye!Bye!"); return;
		     	default: 
		     			prt("Invalid input!! Enter [1-13]");	
		     
		     }
		      

		}while(true);
	}
	
	
	public static void prt(String s) {
		System.out.println(s);
	}
	
	public static League createLeague() throws IOException{
		int ID; String name; String doe; String country; Club clist[];
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		prt("Enter LEAGUE ID:");  ID = Integer.parseInt(reader.readLine());
		prt("Enter LEAGUE Name:");  name = reader.readLine();
		prt("Enter Date of Establishment:");  doe = reader.readLine();
		prt("Enter Country:");  country = reader.readLine();
		clist = new Club[4];
		for(int i=0; i<4; i++)
		{
		   clist[i] = createClub();	
		}
		League lg = new League(ID, name, doe, country, clist);
		return lg;
	}
	
		public static League createLeague1() throws IOException
	{
		int ID; String name; String doe; String country; Club clist[]=null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		prt("Enter LEAGUE ID:");  ID = Integer.parseInt(reader.readLine());
		prt("Enter LEAGUE Name:");  name = reader.readLine();
		prt("Enter Date of Establishment:");  doe = reader.readLine();
		prt("Enter Country:");  country = reader.readLine();
		League lg = new League(ID, name, doe, country, clist);
		return lg;
	}
	
	public static Club createClub() throws IOException
	{
	    int ID; String name; String doe; int position; Player plist[];	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		prt("Enter CLUB ID:");  ID = Integer.parseInt(reader.readLine());
		prt("Enter CLUB Name:");  name = reader.readLine();
		prt("Enter Date of Establishment:");  doe = reader.readLine();
		prt("Enter position:");  position = Integer.parseInt(reader.readLine());
		plist = new Player[3];
		for(int i=0; i<3; i++)
		{
		   plist[i] = createPlayer();	
		}
		Club clb = new Club(ID, name, doe, position, plist);
		return clb;	
	}
	
	public static Club createClub1() throws IOException
	{
	    int ID; String name; String doe; int position; Player plist[] = null;	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		prt("Enter CLUB ID:");  ID = Integer.parseInt(reader.readLine());
		prt("Enter CLUB Name:");  name = reader.readLine();
		prt("Enter Date of Establishment:");  doe = reader.readLine();
		prt("Enter position:");  position = Integer.parseInt(reader.readLine());
		Club clb = new Club(ID, name, doe, position, plist);
		return clb;	
	}
	

	public static Player createPlayer() throws IOException
	{
	    int ID; String name; String dob; String position; double salary; String nationality; int goalsScored;	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		prt("Enter PLAYER ID:");  ID = Integer.parseInt(reader.readLine());
		prt("Enter PLAYER Name:");  name = reader.readLine();
		prt("Enter Date of Birth:");  dob = reader.readLine();
		prt("Enter natonality:");  nationality = reader.readLine();
		prt("Enter salary:");  salary = Double.parseDouble(reader.readLine());
		prt("Enter goals scored:"); goalsScored = Integer.parseInt(reader.readLine());
		prt("Enter position:");  position = reader.readLine();
		Player p = new Player(ID, name, dob, position, salary, nationality, goalsScored);
		return p;			
	}
	
	
}