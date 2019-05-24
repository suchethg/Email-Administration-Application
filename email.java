package JavaProjectsUdemy;

import java.util.Scanner;

public class email {

	
		// TODO Auto-generated method stub
		private String firstName;
		private String lastName;
		private String password;
		private String department;
		private int mailboxCapacity=500;
		private String alternateEmail;
		private int DefaultPasswordLength=10;
		private String email;
		private String CompanySuffix="company.com";
		//Constructor to recieve first name and last name
		public email(String firstName,String lastName)
		{
			this.firstName=firstName;
			this.lastName=lastName;
			
			
			//Call method asking for the department and it gonna return the department
			this.department=setDepartment();
		
			//call a method to return a  random password
			this.password=randomPassword(DefaultPasswordLength);
			
			
			//combine elements to generate email
			email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+CompanySuffix;
			
		}
		//Ask for the department
		private String setDepartment()
		{
			System.out.println("DEPARTMENT CODES \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None\nEnter Department code :");
			Scanner in = new Scanner(System.in);
			int deptChoice=in.nextInt();
			if(deptChoice==1){	return "sales";}
			else if(deptChoice==2) { return "dev";	}
			else if(deptChoice==3) {	return "acc"; }
			else { return "";}
			
		}
		//Generate a random password
		private String randomPassword(int length)
		{
			String passwordset="ABCDEFGHIJKLMNOPQRSTUVXYZ0123456789!@#$%^&*";
			char[] password=new char[length];
			int rand;
			for(int i=0;i<length;i++) {
			 rand=(int)(Math.random()*passwordset.length());
			 password[i]=passwordset.charAt(rand);
			
			}
			return new String(password);
		}
		
		//Set the mailbox capacity
		 public void mailboxcapacity(int capacity)
		 {
			 this.mailboxCapacity=capacity;
		 }
		//Set alternate email
		 public void setalternateEmail(String altEmail)
		 {
			 this.alternateEmail=altEmail;	
		 }
		
		//Change the password
		 public void changepassword(String password)
		 {
			 this.password=password;
		 }
		 public int getMailboxCapacity(){
			 return mailboxCapacity;
		 }
		 public String getAlternateEmail() {
			 return alternateEmail;	
		 }
		 public String getPassword() {
			 return password;
		 }
		 public String showinfo()
		 {
			 return "Name:"+firstName+" "+lastName+"\n"+
					 "Company Email "+email+"\n"+
					 "MailBox Capacity "+mailboxCapacity;
		 }
}
