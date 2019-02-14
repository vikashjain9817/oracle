

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	[a-zA-Z]  [0-9] . \s
		
		String mobilePattern ="^[7-9]\\d{9}$";
		
		String userNamePattern = "^r[A-Za-z]+vi$" ;
		
		String mobileNo;
		String userName;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Mobile No( 10 digits)");
	  
		mobileNo = scanner.next();
	
	    Pattern mobile=Pattern.compile(mobilePattern);
	   
	    Matcher matcher = mobile.matcher(mobileNo);
	    
	    if(matcher.find()){
	    	System.out.println("Correct Formate");
	    }
	    else
	    {
	    	System.out.println("Wrong Mobile Number format!");
	    }
	    
	    
	    System.out.println("Please Enter UserName( mandatory) ( it should be started with 'r' and follwed by any character and ends with \"vi\"");
		  
		userName = scanner.next();
	
	    Pattern userPattern=Pattern.compile(uaerNamePattern);
	   
	    matcher = userPattern.matcher(userName);
	    
	    
	    if(matcher.find()){
	    	System.out.println("Correct Formate");
	    }
	    else
	    {
	    	System.out.println("Wrong userName format!");
	    }
	    
	    
	    
	    
	   
	}

}
