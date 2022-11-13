package fi.otp;

import org.fi.utils.LinkedList;

public class GenerateOTP implements Runnable  
{
      LinkedList<String> otpList;
	public GenerateOTP(LinkedList<String> para) 
	{
		otpList=para;
	}

	
	public void run() 
	{
		
		
		while(true){
			try {
			StringBuffer str = new StringBuffer();
			
			char [] vowels = {'A','E','I','O','U'};
			
			int index = (int) (Math.random()*5);
			str.append(vowels[index]);
			
			  for(int jTmp=0;jTmp<5;jTmp++)
			  {
				  float data = (float) Math.random();
				  
				  int value = (int)(data*10);
				  
				  str.append(value);
			  }

			otpList.add(str.toString());

			  Thread.sleep(1000);
			System.out.println(str.toString());
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	
	}

	
	
		
	}


