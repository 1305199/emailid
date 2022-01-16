package email;

import java.util.Scanner;
public class EmailId {

	
	public static void main(String[] args) {
		emailToSearch();
	}	
	static void emailToSearch()
	{
	                Scanner sc = new Scanner(System.in);
					System.out.println("Enter email to search");
					String email=sc.nextLine();
					
					
            searchEmail(email);
				
	           
			
		
		
     }
		public static void searchEmail( String email)
		{
			String[] employeeEmails={"nikita12@gmail.com","niku@gmail.com","patole@gmail.com","niks34@gmail.com","132gmail.com"};
			
		
			for (String email2 :employeeEmails)
			{
			
				if(email2.equals(email))
				{
					System.out.println("Email is valid");
					System.out.println(email);
					break;
				
				}
				else
				{
					System.out.println("Email is not valid");
					break;
				}
			
		}

     }
		
		
}