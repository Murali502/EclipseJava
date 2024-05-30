package Core;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

public class ScenarioContext {

	private HashMap<String,Object> a =new HashMap();
	
	public ScenarioContext()
	{}

	public Object get(String var1)
	{
		return this.a.get(var1);
	}
	
	public void registerInstance(String var1,Object driver)
	{
		this.a.put(var1, driver);
	}
	public void remove(String var1)
	{
		this.a.remove(var1);
	}
	public void update(String var1,Object var2)
	{
		
		this.a.remove(var1);
		this.a.put(var1, var2);
	}
	
	public boolean containsKey(String var1)
	{
		return this.a.containsKey(var1);
	}
	}
