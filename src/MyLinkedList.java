public class MyLinkedList 
{
	public INode head;
	public INode tail;
	public MyLinkedList()
	{
		this.head=null;
		this.tail=null;
	}
	public void add(INode newNode) 
	{
	    if(this.tail==null)
		this.tail=newNode;
    	    if(this.head==null)
		this.head=newNode;
   	 else
    		{
    		INode temporaryNode=this.head;
    		this.head=newNode;
    		this.head.setNext(temporaryNode);
	    	}
	}
	public void append(INode newNode) 
	{
    if(this.tail==null)
		this.tail=newNode;
    if(this.head==null)
		this.head=newNode;
    else
    	{
    	this.tail.setNext(newNode);
    	this.tail=newNode;
    	}
	}
	public void printMyNode()
	{
		StringBuffer myNodes=new StringBuffer("My Nodes:");
		INode temporaryNode=head;
		while(temporaryNode.getNext()!=null)
		{
			myNodes.append(temporaryNode.getKey());
			if(!temporaryNode.equals(tail))
				myNodes.append("->");
			temporaryNode=temporaryNode.getNext();
		}
		myNodes.append(temporaryNode.getKey());
		System.out.println(myNodes);
	}
}
