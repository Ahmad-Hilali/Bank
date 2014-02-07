/*@author: Luis Luna aka engineerluna
 * Description: Node Class that does the following
 * getItem(): Returns Object in the Node
 * setItem(): Sets the head of the node to the Object
 * getNext(): Gets and retrieves the next Node
 * setNext(Node): Sets the following Node
 */
package QueueProject;

class Node
	{
		private Object item;
		private Node next;
		
		public Node(Object s)
			{
				item = s;
				next = null;
				}//END StringNode
		//----------------------
		
		public Node(Object s, Node nextnode)
			{
				item = s;
				next = nextnode;
				}//END StringNode
				
		//----------------------
	
		public Object getItem()
			{
				return item;
				}//END getItem
		//----------------------
		
		public void setItem(Object s)
			{
				item = s;
				}//END setItem
		//----------------------
		
		public Node getNext()
			{
				return next;
				}//END getNext
		//----------------------
		
		public void setNext(Node w)
			{
				next = w;
				}//END setNext
		//-----------------------------
						
}//END StringNode
