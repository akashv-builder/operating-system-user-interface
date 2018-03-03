import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.sql.*;
import java.io.*;
import sun.audio.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class audioplay extends JFrame
{
	public String loc1;
	String aud[]={"audio1.wav","audio2.wav","audio3.wav"};
	public audioplay(String loc1)
	{
        
		
		this.loc1=loc1;
		int i;
		i=Integer.parseInt(loc1);
		try 
		{
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(audioplay.class.getResource(aud[i]));
			Clip clip = AudioSystem.getClip();
			clip.open(audioIn);
			clip.start();
		} 
		catch(Exception ex)
		{
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    
		}

	}
	
}










