package Mediator;

import java.util.Date;

//예제2
//Mediator
public class ChatRoom 
{
	public static void showMessage(User user, String message)
	{
	      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	}
}
