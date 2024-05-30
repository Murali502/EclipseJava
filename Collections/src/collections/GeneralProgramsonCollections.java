package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class GeneralProgramsonCollections {

	public static void splitinglist()
	{
		ArrayList<Object> li=new ArrayList<Object>();   
		ArrayList<Integer> intli=new ArrayList<Integer>();
		ArrayList<String> strli=new ArrayList<String>();
		
    li.add("Yellow");
    li.add("Red");
    li.add(1245);
    li.add("Black");
    li.add(5689);
    int i=0;
    int j=0;
  
    for (int j2 = 0; j2 < li.size(); j2++) {
    	final Pattern patternstring=Pattern.compile("^[A-Za-z, ]++$");
    	if(patternstring.matcher(li.get(i).toString()).matches())
    	{
    		strli.add(li.get(j2).toString());
    	}
    	final Pattern patternint=Pattern.compile(".*[^0-9].*");
    	
    	if(!patternint.matcher(li.get(i).toString()).matches())
    	{
    		intli.add(Integer.parseInt(li.get(j2).toString()));
    	}
		
	}

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		splitinglist();
		
		ArrayList<Object> li=new ArrayList<Object>();   
		ArrayList<Integer> intli=new ArrayList<Integer>();
		ArrayList<String> strli=new ArrayList<String>();
		
    li.add("Yellow");
    li.add("Red");
    li.add(1245);
    li.add("Black");
    li.add(5689);
    int i=0;
    int j=0;
      
   for (Object object : li) {
	   
if(object.getClass().getName().equals("java.lang.String"))
{
	i++;
	strli.add(object.toString());
	System.out.println("added string values"+i);
}
else if(object.getClass().getName().equals("java.lang.Integer"))
{
	j++;
	intli.add((Integer)object);
	System.out.println("added integer values"+j);
}

}
		
	}





public void splitarrayvalues()
{
	
	ArrayList<Object> li=new ArrayList<Object>();   
	ArrayList<Integer> intli=new ArrayList<Integer>();
	ArrayList<String> strli=new ArrayList<String>();
    
	li.add("Murali");
	li.add(123);
	int i=0;
	int j=0;
	
	for(Object obj:li)
	{
		if(obj.getClass().getName().equals("Java.lang.String"))
		{
			j++;
			strli.add(obj.toString());
			System.out.println("String values"+j);
		}
		else if(obj.getClass().getName().endsWith("Java.lang.String"))
		{
			i++;
			intli.add((Integer) obj);
			System.out.println("integer values"+ i);
		}
		
	}
	
}

}