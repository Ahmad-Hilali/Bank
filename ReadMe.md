Description:
	This project implements a program that simulates a customer queue in a 
"Bank." The program reads a file that contains the names of the customers along 
with their arrival time and departure time as shown
	i.e.
Customer name 	Arrival Time	DepartureTime

Joe  		 10   		 6	
Sue  		 18 		 5


```

	It then computes the customer's departure time along with Bank 
Simulation Statistics that displays the number of customers taken care 
of and average waiting time.

```

 
The Customer Class conaints the following UML Diagram

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


Simulation Results:
 ------------------------------------------
```

luis@ubpc:~/Desktop/Project$ java BankSimulation 
Arrival SimTime: 10 Customer: [ Joe, 10, 6, 0]
Departure SimTime: 16 Customer: [ Joe, 10, 6, 16]
Arrival SimTime: 18 Customer: [ Sue, 18, 5, 0]
Arrival SimTime: 20 Customer: [ Jill, 20, 6, 0]
Arrival SimTime: 23 Customer: [ Sally, 23, 9, 0]
Departure SimTime: 23 Customer: [ Sue, 18, 5, 23]
Arrival SimTime: 26 Customer: [ Mary, 26, 10, 0]
Departure SimTime: 29 Customer: [ Jill, 20, 6, 29]
Arrival SimTime: 30 Customer: [ Tim, 30, 5, 0]
Arrival SimTime: 35 Customer: [ Cindy, 35, 2, 0]
Departure SimTime: 38 Customer: [ Sally, 23, 9, 38]
Arrival SimTime: 39 Customer: [ Max, 39, 4, 0]
Arrival SimTime: 44 Customer: [ Sue, 44, 10, 0]
Departure SimTime: 48 Customer: [ Mary, 26, 10, 48]
Departure SimTime: 53 Customer: [ Tim, 30, 5, 53]
Arrival SimTime: 55 Customer: [ Bob, 55, 10, 0]
Departure SimTime: 55 Customer: [ Cindy, 35, 2, 55]
Departure SimTime: 59 Customer: [ Max, 39, 4, 59]
Departure SimTime: 69 Customer: [ Sue, 44, 10, 69]
Departure SimTime: 79 Customer: [ Bob, 55, 10, 79]
Arrival SimTime: 90 Customer: [ Jerry, 90, 15, 0]
Departure SimTime: 105 Customer: [ Jerry, 90, 15, 105]

Bank Simulation Statistics
Simulation time at Completion: 105
Number of Customer: 11
Mean Wait Time: 9.272727272727273
Min Wait Time: 0
Max Wait Time: 18
Maximum Customer Queue Size: 5
Simulation is done

```
