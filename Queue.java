/*@author: Luis Luna aka engineerluna
 * Description: Referenced-based Queue Class that holds Objects
 * -enqueue(Object item): Adds Object to Queue
 * -boolean isEmpty(): Checks if Queue is empty
 * -int size(): Returns the size of the Queue
 * -Object dequeue() throws QueueException: Gets and retrieves the head of the Queue if any
 * -Object peek() throws QueueException: Retrieves the head of the Queue if any
 * -void printQueueContents(): Displays the Contents of the Queue
*/
package QueueProject;

public class Queue
{
	private Node front;
	private Node rear;
	private int size;
	
	public Queue()
		{
			front = null;
			rear = null;
			size =0;
		}
	//Inserts a specified object into the queue
	public void enqueue(Object item)
		{
			if(isEmpty())
				{
					Node w = new Node(item);
					front = w;
					rear = w;
					size++;
					}
			else
				{
					Node w = new Node(item);
					rear.setNext(w);
					rear = rear.getNext();
					size++;
					}
		}
	public boolean isEmpty()
		{
			return(size==0);
		}
	public int size()
		{
			return size;
		}
	//Retrieves and removes the head of the queue
	public Object dequeue() throws QueueException
		{
			if(size==0)
				throw new QueueException("Error!");
			else if(size==1)
				{
					Object temp = front.getItem();
					front = null;
					rear = null;
					size--;
					return temp;
				}
			else
				{
					Object temp = front.getItem();
					front = front.getNext();
					size--;
					return temp;
				}
		}
	//Retrieves, but does not remove, the head of the queue or it
	//returns null if it's empty
	public Object peek() throws QueueException
		{
			if(isEmpty())
				throw new QueueException("Error 2");
			else
				return(front.getItem());
		}
	public void printQueueContents()
		{
			if(isEmpty())
				System.out.println("Empty Queue");
			else
				{
					Node current = front;
					
					while(current != null)
						{
							System.out.print(current.getItem()+ " ");
							current = current.getNext();
						}
				}
		}
					
					
	}//end CLASS QUEUE