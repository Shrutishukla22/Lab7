import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentInformation {
	

	public static String[] getStudentInfo(int x)throws ArrayIndexOutOfBoundsException{
		
		
           String[][] studentInfo = {{"Blair","Troy","Thai Curry"},{"Amy","Auburn Hills","Salad"},{"DeeAnn","Ferndale","Brownies"},
        		   {"Gerrae","Detroit","SpaghettiSalad"},{"Lilly","Detroit","Beef Rice"}};
        	   
		     return studentInfo[x -1];

	}
	
	
	public static void main(String[] args)   {
		
		Scanner scan1=new Scanner(System.in);
	String choice = "yes"; int input=0;  
	System.out.println("Welcome to our Java Class!");
	while (choice.equalsIgnoreCase("yes")) {
		System.out.println("Which Student would you like to know about? please enter a number 1-20:");
		
		try{
             input =scan1.nextInt();
             scan1.nextLine();  
		}
		catch(InputMismatchException e){
			System.out.println("please enter number only");
			
			}
		
		
		try{
			String[] studentDetail = getStudentInfo(input);
				
	            System.out.println("Student " + input + " is " +studentDetail[0]);
	            System.out.println("what would you wnat to know about " + studentDetail[0]);
	            for(int i=0;i<studentDetail.length;i++){
	            System.out.println("enter home town OR favourite food");
	            String userInput =scan1.nextLine();
	            if(userInput.equalsIgnoreCase("home town")){
	            	System.out.println(studentDetail[0]+ " is from " + studentDetail[1]);
	            	
	            }else if(userInput.equalsIgnoreCase("favorite food")) {
	            	System.out.println(studentDetail[0]+ "'s favorite food is " + studentDetail[2]);
	            }
	            else{
	            	System.out.println("That data does not exist. please enter home town or favorite food");
	            	
	            }
			}  
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("That student does not exist please try again!");
		
		
		}       
		System.out.println("you want to continue? please enter yes or no:");
		
		choice = scan1.nextLine();
	}
	scan1.close();
	
	
}
}
