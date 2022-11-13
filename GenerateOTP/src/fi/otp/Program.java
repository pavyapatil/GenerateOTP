package fi.otp;

import org.fi.utils.LinkedList;

public class Program {

	public static void main(String[] args) throws Exception
	{
           
            
            
	
		    LinkedList<String>  objList = new LinkedList<String>();
		    
		    GenerateOTP objOTP = new GenerateOTP(objList);
		
		    Thread objThread = new Thread(objOTP);
		    
			objThread.start();
		    
		    // objList.add(null);
		    
		    
		  System.out.println("otp :"+ objList.getNext());
		  
		  
		    
		}


	}
	


