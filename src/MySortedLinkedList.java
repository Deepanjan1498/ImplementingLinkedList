
public class MySortedLinkedList {
	public INode head;
	public INode tail;
	public int size=0;
	public MySortedLinkedList() {
		this.head = null;
		this.tail = null;
	}	
	
	public void printMyNode()
	{
		StringBuffer myNodes=new StringBuffer("My Nodes:");
		INode tempNode=head;
		while(tempNode.getNext()!=null)
		{
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail))
				myNodes.append("->");
			tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

	public void addSorted(INode newNode) 
	{
		INode tempNode;
		if (head == null || ((Comparable) head.getKey()).compareTo(newNode.getKey()) >= 0) {
			newNode.setNext(head);
			head = newNode;
		}
		else
		{ tempNode = head;
			while (tempNode.getNext() != null && ((Comparable) tempNode.getNext().getKey()).compareTo(newNode.getKey()) < 0) 
			{
				tempNode = tempNode.getNext();
				newNode.setNext(tempNode.getNext());
				tempNode.setNext(newNode);
			}
			size++;
		}
	}
	

}

