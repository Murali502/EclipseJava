package testDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Characteroccuraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stubr
		
		String str ="This is a demo";
		
		Map<Character,Integer> map=new HashMap<>();
		
		str.toCharArray();
	
		int chvalue =0;
		for(int i =0;i<=str.length()-1;i++);
		{
			 char ch =str.charAt(chvalue);
			if(map.containsKey(ch))
			{
				chvalue= map.get(ch);
				chvalue = chvalue+1;
				 map.put(ch, chvalue);
			}
			else
			{
				map.put(ch, 1);
				chvalue++;
			}
			
		}
          //System.out.println(map);
	}

}
