package QueueProject;
import java.util.*;
import java.io.*;

public class BankSimulation
	{
		private Queue custQ;
		private EventList eventList;
		private int simTime;
		private int minTime;
		private int maxTime;
		private int cNum;
		private double mean;
		private int max;
//--------------------------------------------------------	
	public BankSimulation()
	{
		custQ = new Queue(); 
		eventList = new EventList();
		simTime = 0;
		cNum=0;
		mean =0;
		max =0;
		minTime=2^31-1;
		maxTime=0;
	}
//--------------------------------------------------------
	public void initializeEventList(String fileName)
 	{
		
		//Input file format: String double int on each line
		File inputFile = new File(fileName);
		
		try
		{
			Scanner fileIn = new Scanner(inputFile);
			//Read Information until the end of the file
			String name = "";
			int arrivalTime;	//Time in INT
			int serviceDurationTime;	//Time in INT
		
			while( fileIn.hasNext())
			{
				name = fileIn.next();
				arrivalTime = fileIn.nextInt();
				serviceDurationTime = fileIn.nextInt();
				Customer customer = new Customer(name, arrivalTime, serviceDurationTime);
				cNum++;
				Event e = new Event("A", customer.getArrivalTime(), customer);
				eventList.insertEvent(e);
			}
			fileIn.close();

		}
		catch (Exception e)
		{
			System.out.println("Error! "+ e);
		} 	
		
	}//END initializeEvent
//--------------------------------------------------------
	 private void processArrival() 
	{   
		Event temp = eventList.getNextEvent();
		Customer tempC =(Customer)(temp.getEventInfo());
		simTime = tempC.getArrivalTime();
		System.out.println("Arrival SimTime: "+simTime+ " Customer: "+ tempC);
		custQ.enqueue(tempC);
		if(custQ.size() > max)
			max++;

	

		if(custQ.peek()==tempC)
		{	
			tempC.setDepartureTime(simTime+tempC.getServiceDuration());
			Event depart = new Event("D", tempC.getDepartureTime(), tempC);
			eventList.insertEvent(depart);
		}

	}
//--------------------------------------------------------
	private void processDeparture()
	{
		int waitTime=0;
		Event temp = eventList.getNextEvent();
		simTime = temp.getEventTime();
		Customer tempC = (Customer) (custQ.dequeue());
		System.out.println("Departure SimTime: " + simTime + " Customer: " + tempC);
		waitTime = tempC.getDepartureTime()-(tempC.getArrivalTime()+tempC.getServiceDuration());
		
		if(waitTime>maxTime)
			maxTime=waitTime;
		if(minTime>waitTime)
			minTime=waitTime;

		
		
		mean = mean+waitTime;
		
		if (!custQ.isEmpty())
		{
			Customer tempC2= (Customer) (custQ.peek());
			tempC2.setDepartureTime(simTime+tempC2.getServiceDuration());
			Event departure =  new Event("D", tempC2.getDepartureTime(), tempC2);
			eventList.insertEvent(departure);
		}		
			
	}
//--------------------------------------------------------
	public void run()
	{
		while(!eventList.isEmpty())
		{
			String temp = eventList.getNextEventType();
			if(temp.compareToIgnoreCase("A")==0)
				processArrival();
			else	
				processDeparture();
	
		}//END While
		
		System.out.println("\nBank Simulation Statistics");
		System.out.println("Simulation time at Completion: "+ simTime);
		System.out.println("Number of Customer: "+cNum);
		System.out.println("Mean Wait Time: "+ mean/cNum);
		System.out.println("Min Wait Time: "+ minTime);
		System.out.println("Max Wait Time: " +maxTime);
		System.out.println("Maximum Customer Queue Size: "+ max);
	}

//--------------------------------------------------------
	public static void main(String[] args)
	{
		Queue newQ = new Queue();
		BankSimulation bankSim = new BankSimulation();
		bankSim.initializeEventList("customerdata.txt");
		bankSim.run();
		System.out.println("Simulation is done");
	}

}//END BankSimulation