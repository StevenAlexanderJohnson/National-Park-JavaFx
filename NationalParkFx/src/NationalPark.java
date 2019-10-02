package returningNationalPark;

import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Button;


public class NationalPark 
{
	String parkName;
	String agentName;
	String date;
	ArrayList<String> events = new ArrayList<String>();
	
	void setParkName(String input)
	{
		this.parkName = input;
	}
	String getParkName()
	{
		return parkName;
	}
	
	void setAgentName(String input)
	{
		this.agentName = input;
	}
	String getAgentName()
	{
		return agentName;
	}
	
	void setEvent(String input)
	{
		events.add(input);
	}
	ArrayList<String> returnEvents()
	{
		return events;
	}
	
	void setDate(int day, int month, int year)
	{
		this.date = convertToString(day, month, year);
	}
	String getDate()
	{
		return date;
	}
	
	//Function that converts the day, month, year input of user into a string
	String convertToString(int day,int month,int year)
	{
		String output = Integer.toString(day) + "/" + Integer.toString(month) + "/" + Integer.toString(year);
		return output;
	}
	
	
	//This is the main function
	public static void main(String[] args)
	{
		//Declaring Array of Objects
		NationalPark[] Park = new NationalPark[56];
		//Creating a scanner for user input
		Scanner scan = new Scanner(System.in);
		//Initializing array of objects
		for(int i = 0; i < Park.length; i++)
		{
			Park[i] = new NationalPark();
		}
		
		//Variables
		//Input variable for the name of the parks
		String parkInput;
		
		
		
		
		//This prints out the all of the parks
		for(int i = 0; i != Park.length; i++)
		{
			System.out.println(Park[i].getParkName());
		}
		
		//Closes the scanner to avoid memeory leaks
		scan.close();
	}
}
