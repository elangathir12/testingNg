package testingng;

import java.util.HashMap;
import java.util.Map;

public class githubexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xyz= "aabccncncnncijehcieenmwpoowmniociwnv";
		
		//char  ju = xyz.charAt(12); ---// poisition
	         char[] jy =	xyz.toCharArray();
	         
	         Map <Character,Integer>lp= new HashMap<Character,Integer>();
	         
	         
	         
	         for(char gy : jy)
	         {
	        	 if(lp.containsKey(gy)) {
	        		int o =lp.get(gy);
	        		 lp.put(gy,o+1);
	        	 }else {
	        		 lp.put(gy,1);
	        	 }
	        	
	         } System.out.println(lp);
	}

}
