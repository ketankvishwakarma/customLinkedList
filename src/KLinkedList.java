
public class KLinkedList {

	
	private Node head;
	private int listCount;
	
	//KLinkedList constructor
	public KLinkedList()
	{
		head=new Node(null);
		listCount=0;
	}
	
	public void add(Object data)
	{
		Node tempNode=new Node(data);
		Node currentNode=head;
		
		//starting at the head node, till it gets to null 
		while(currentNode.getNext()!=null)
		{
			currentNode=currentNode.getNext();
		}
		currentNode.setNext(tempNode);
		listCount++;
	}
	
	
	public void add(Object data,int index)
	{
		Node tempNode=new Node(data);
		Node currentNode=head;
		//crawl to the request index or 
		//the last element int the list, which ever comes first.
		for(int i = 1; i < index && currentNode.getNext() != null; i++)
		{
			currentNode=currentNode.getNext();
		}
		/**
		 * set the new node's next-node ref to 
		 * this node's next-node ref.
		 * */
		tempNode.setNext(currentNode.getNext());
		/**
		 * now set this node's next-node reference to the new node
		 * */
		currentNode.setNext(tempNode);
		//Increment counter
		listCount++;
	}
	

	public int size()
	{
		return listCount;
	}

	public Object get(int index) 
	{
		if(index<=0)
		{
			return null;
		}
		
		Node currentNode=head.getNext();
		for(int i=1;i<index;i++)
		{
			if(currentNode.getNext()==null)
			{
				return null;
			}
			currentNode=currentNode.getNext();
		}
		return currentNode.getData();
	}

	public boolean remove(int index) 
	{
		if(index<1||index>size())
		{
			return false;
		}
		
		Node currentNode=head;
		for(int i=1;i<index;i++){
			if(currentNode.getNext()==null)
			{
				return false;
			}
			currentNode=currentNode.getNext();
		}
		currentNode.setNext(currentNode.getNext().getNext());
		listCount--;
		return true;
	}
	
	public String toString()
	{
		Node currentNode=head.getNext();
		String output="";
		while(currentNode!=null){
			output +="[" +currentNode.getData().toString() +"]";
			currentNode=currentNode.getNext();
		}
		
		return output;
	}

}
