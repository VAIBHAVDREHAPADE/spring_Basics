package com.vhinkdynamic.spring.learnspringframework.game;

import org.springframework.stereotype.Component;


public class SuperContraGame implements GamingConsole{
	
	public void up()
	{System.out.println("SuperContraGame UP");}
	public void down()
	{
System.out.println("SuperContraGame Down");
}
	public void left()
{
System.out.println("SuperContraGame LEFT");
}	
	public void right()
{
System.out.println("SuperContraGame Right");
}

}
