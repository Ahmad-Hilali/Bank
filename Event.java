/*@author: Luis Luna aka engineerluna
 * 
 */
package QueueProject;

public class Event
{
   private String eventType;
   private  int  eventTime ;   //lower numbers are higher priority
   private  Object eventInfo;
	
   public Event( String type, int t, Object  info)
   {
      eventType = type;
      eventTime = t;
      eventInfo  = info;
   }
      
   public int getEventTime()  
   { 
      return eventTime; 
   }
   public String getEventType()  
   { 
      return eventType; 
   }
   public Object getEventInfo()
   { 
      return eventInfo;
   }
      
   public int compareTo( Event e)
   {
      if( this.getEventTime()  < e.getEventTime() )
         return -1;
      else if ( this.getEventTime() == e.getEventTime())
         return 0;
      else
         return 1;
   }

}