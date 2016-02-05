/*Teja Ambati
 *Computer Science Honors
 *Adress Book Project
 * 
 */

import java.util.Scanner;

public class contacts 
{
	String name; 
	String phone; 
	String adress; 
	String email; 
	String note; 
	
	public contacts()
	{
		name = " "; 
	}
	
	public contacts(String tempName, String tempPhone, String tempAdress, 
                        String tempEmail, String tempNote)
	{
		name = tempName; 
		phone = tempPhone; 
		adress = tempAdress; 
		email = tempEmail; 
		note = tempNote;
	}
	
	public String getName()
	{
		return name; 
	}
	
	public String getEverything()
	{
		return name + "/" + phone + "/" + email + "/" + adress + "/" + note; 
	}
	
	public String disp()
	{
		return ("<b>Name</b>: " + name + "<br><br><b>Phone</b>: " + phone + 
                        "<br><br><b>Adress</b>: " + adress + "<br><br><b>Email</b>: " + 
                        email + "<br><br><b>Note</b>: " + note); 
	}
}
