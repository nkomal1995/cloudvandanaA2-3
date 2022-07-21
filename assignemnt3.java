// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      	Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sentense");
		String s=new String();
		s=sc.nextLine();   
		
		
        System.out.println("Enter letter");
		String s1=new String();
		s1=sc.nextLine();

        int indexV = s.indexOf(s1);

        if(indexV>0){
             int length = s.length();
             String result=new String();
             result = s.substring(indexV+1, length);
             System.out.println(result);  

        }
        else{
           System.out.println("The letter does not exist in the sentence");
        }
		
        

		
		
    }
}