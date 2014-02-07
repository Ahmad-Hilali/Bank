/*@author: Luis Luna aka engineerluna
 * Description: This class creates a list of events and puts them in order 
 * very similar to a PriorityQue
 * -insertEvent(Event): Inserts event in order
 * -getNextEvent(): Retrieves and removes the next/following event
 * -peek(): Retrieves the next/following event from 
 * -getNextEventType(): Retrieves and removes the first event in the list
 * -isEmpty(): Checks if the List is empty
 * -printEventList(): Prints the events in the lists
 */
package QueueProject;
import java.util.*;

public class EventList
{
         private ArrayList<Event>  eList;
         
         public EventList()
         {
               eList = new ArrayList<Event>(100);
         }
         
         public void insertEvent( Event newEvent)
         {
             //insert so that eList is maintained in time order of events
             if( eList.size() == 0)
                  eList.add(newEvent);
            else
          {
                  int k = 0;
                  int n = eList.size();
                  while( k < n  && newEvent.compareTo(eList.get(k)) >= 0)
                       k++;
                  eList.add(k, newEvent);
            }
            
         }
         
        public Event getNextEvent()
         {
               if ( eList.size() == 0)
                     return null;
               else
                  return ( eList.remove(0) );
            }
            
         public Event peek()  //peek at fist event on list
        {
            if ( eList.size() == 0)
                     return null;
               else
                  return ( eList.get(0));
            }

       public String getNextEventType()
       {
            Event e = eList.get(0);
            return  e.getEventType();
      }
            
      boolean isEmpty()
       {
             return eList.size() == 0 ;
       }    
       
       public void printEventList()
       {
            for( int k = 0; k < eList.size(); k++) 
            {
              Event e = eList.get(k);
              
               System.out.println( e.getEventType() + " " + 
                  e.getEventTime() + "  "  +e.getEventInfo()); 
            }
       }   
   }
