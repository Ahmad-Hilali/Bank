Description:
	This project implements a program that simulates a customer queue in a 
"Bank." The program reads a file that contains the names of the customers along 
with their arrival time and departure time as shown
	i.e.
Customer name 	Arrival Time	DepartureTime

Joe  		 10   		 6	
Sue  		 18 		 5



	It then computes the customer's departure time along with Bank Simulation
Statistics that displays the number of customers taken care of and average 
waiting time


 
with the following UML Diagram 

 Customer:	
 ------------------------------------------
	private String 	customerName
	private int 	arrivalTime
	private int	serviceDuration
	private int	departureTime
 ------------------------------------------
	public Customer(String name, int at, int sd)
	public String toString()
	public int getArrivalTime()
	public int getServiceDuration()
	public int getDepartureTime()
 ------------------------------------------
	

It contains a reference-based Queue that holds Objects similar to the Java Queue
interface and a List that holds Events. 

