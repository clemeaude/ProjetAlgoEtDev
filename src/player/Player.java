package player;

public class Player 
{
	public static String id;
	public static String password;
	
	public Player()	{}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		Player.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		Player.password = password;
	}
	
	public boolean ControlAccess(String _id, String _password)
	{
		if(equals(_id, id) && equals(_password, password))
			return true;
		return false;
	}
	
	public boolean equals(String a, String b)
	{
		boolean result = false;
		if(a.length() < b.length() || a.length() > b.length())
			result = false;
		else
		{
			for(int i=0; i<a.length(); i++)
			{
				if(a.charAt(i) == b.charAt(i))
					result = true;
				else 
					return false;
			}
		}
		return result;
	}
	
}
