/*@author: Luis Luna aka engineerluna
 * Description:
 * Customer(String, int, int): Costumer Class constructor
 * String toString(): String to display customer information
 * int getArrivalTime(): Retrieves the Arrival time of the customer
 * int getDepartureTime: Retrieves the departure time of the customer
 * void setDepartureTime(int): Sets the departure time of the customer
 */
package QueueProject;

import java.util.*;

public class Customer
	{
		private String customerName;
		private int arrivalTime;
		private int serviceDuration;
		private int	departureTime;
		//--------------------------------------------------
		
		public Customer(String name, int at, int sd)
			{
				customerName = name;
				arrivalTime = at;
				serviceDuration = sd;
				}//END method Customer
		//--------------------------------------------------
		public String toString()
			{
				String s = "[ "+customerName+", "+arrivalTime+", "+serviceDuration+", "+departureTime+"]";
				return s;
				}//END method toString
		//--------------------------------------------------
		public int getArrivalTime()
			{
				return arrivalTime;
				}//END method getArrival
		//--------------------------------------------------
		public int getServiceDuration()
			{
				return serviceDuration;
				}//END method getServiceDuration
		//--------------------------------------------------
		public int getDepartureTime()
			{
				return departureTime;
				}//END method getDepartureTime
		//--------------------------------------------------
		public void setDepartureTime( int n)
			{
				departureTime = n;
				}//END method setDepartureTime
		//--------------------------------------------------
		
		
}//END class Customer