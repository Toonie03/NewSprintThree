package models;

public class User {
	
	String name;
	String type;
	
	public User(String name, String type)
	{
	  super();
	  this.name = name;
	  this.type = type;
	}
	
	public void setName(String str)
	{
		name = str;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public String getName()
	{
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
	

}
