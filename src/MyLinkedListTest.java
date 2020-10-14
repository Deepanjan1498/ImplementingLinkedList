import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
public class MyLinkedListTest
{
	@Test
	public void givenNumbersAddedToLinkedListShouldBeAddedToTop() 
	{
	MyNode<Integer> myFirstNode=new MyNode<Integer>(70);
    	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
    	MyNode<Integer> myThirdNode=new MyNode<Integer>(56);
    	MyLinkedList myLinkedList=new MyLinkedList();
    	myLinkedList.add(myFirstNode);
    	myLinkedList.add(mySecondNode);
    	myLinkedList.add(myThirdNode);
    	myLinkedList.printMyNode();
    	boolean result=myLinkedList.head.equals(myThirdNode)&&
    					myLinkedList.head.getNext().equals(mySecondNode)&&
    					myLinkedList.tail.equals(myFirstNode);
    	Assert.assertTrue(result);
	}
	@Test
	public void givenNumbersAppendedToLinkedListShouldBeAddedToLast() 
	{
		MyNode<Integer> myFirstNode=new MyNode<Integer>(56);
    	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
    	MyNode<Integer> myThirdNode=new MyNode<Integer>(70);
    	MyLinkedList myLinkedList=new MyLinkedList();
    	myLinkedList.add(myFirstNode);
    	myLinkedList.append(mySecondNode);
    	myLinkedList.append(myThirdNode);
    	myLinkedList.printMyNode();
    	boolean result=myLinkedList.head.equals(myFirstNode)&&
    					myLinkedList.head.getNext().equals(mySecondNode)&&
    					myLinkedList.tail.equals(myThirdNode);
    	Assert.assertTrue(result);
	}
	@Test
	public void givenNumberWhenInsertedInLinkedListShouldReturnTheList() 
	{
		MyNode<Integer> myFirstNode=new MyNode<Integer>(56);
    	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
    	MyNode<Integer> myThirdNode=new MyNode<Integer>(70);
    	MyLinkedList myLinkedList=new MyLinkedList();
    	myLinkedList.add(myFirstNode);
    	myLinkedList.append(myThirdNode);
    	myLinkedList.insert(myFirstNode,mySecondNode);
    	myLinkedList.printMyNode();
    	boolean result=myLinkedList.head.equals(myFirstNode)&&
    					myLinkedList.head.getNext().equals(mySecondNode)&&
    					myLinkedList.tail.equals(myThirdNode);
    	Assert.assertTrue(result);
	}
	@Test
	public void firstNumberWhenDeletedShouldReturnLinkedList() 
	{
		MyNode<Integer> myFirstNode=new MyNode<Integer>(56);
    	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
    	MyNode<Integer> myThirdNode=new MyNode<Integer>(70);
    	MyLinkedList myLinkedList=new MyLinkedList();
    	myLinkedList.add(myFirstNode);
    	myLinkedList.append(myThirdNode);
    	myLinkedList.insert(myFirstNode,mySecondNode);
    	myLinkedList.pop();
    	myLinkedList.printMyNode();
    	boolean result=myLinkedList.head.equals(mySecondNode)&&
    					myLinkedList.tail.equals(myThirdNode);
    	Assert.assertTrue(result);
	}
	@Test
	public void lastElementWhenDeletedShouldReturnLinkedList() 
	{
		MyNode<Integer> myFirstNode=new MyNode<Integer>(56);
    	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
    	MyNode<Integer> myThirdNode=new MyNode<Integer>(70);
    	MyLinkedList myLinkedList=new MyLinkedList();
    	myLinkedList.add(myFirstNode);
    	myLinkedList.append(myThirdNode);
    	myLinkedList.insert(myFirstNode,mySecondNode);
    	myLinkedList.popLast();
    	myLinkedList.printMyNode();
    	boolean result=myLinkedList.head.equals(myFirstNode)&&
    					myLinkedList.tail.equals(mySecondNode);
    	Assert.assertTrue(result);
	}
	@Test
	public void givenNodeValueToBeSearchedShouldPassTestCase() 
	{
		MyNode<Integer> myFirstNode=new MyNode<Integer>(56);
    	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
    	MyNode<Integer> myThirdNode=new MyNode<Integer>(70);
    	MyLinkedList myLinkedList=new MyLinkedList();
    	myLinkedList.add(myFirstNode);
    	myLinkedList.append(myThirdNode);
    	myLinkedList.insert(myFirstNode,mySecondNode);
    	myLinkedList.printMyNode();
    	MyNode<Integer> search = (MyNode<Integer>) myLinkedList.search(30);
    	Assert.assertEquals(search,mySecondNode);
	}
	@Test
	public void toSearchLinkedListToInsertNodeShouldPassTestCase() 
	{
		MyNode<Integer> myFirstNode=new MyNode<Integer>(56);
    	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
    	MyNode<Integer> myThirdNode=new MyNode<Integer>(70);
    	MyNode<Integer> myFourthNode=new MyNode<Integer>(40);
    	MyLinkedList myLinkedList=new MyLinkedList();
    	myLinkedList.add(myFirstNode);
    	myLinkedList.append(myThirdNode);
    	myLinkedList.insert(myFirstNode,mySecondNode);
    	myLinkedList.searchLinkedListAndInsertNode(30,myFourthNode);
    	myLinkedList.printMyNode();
    	MyNode<Integer> newNode= (MyNode<Integer>) myLinkedList.searchLinkedListAndInsertNode(30,myFourthNode);
    	Assert.assertEquals(newNode,mySecondNode);
	}
	@Test
	public void toSearchLinkedListAndDeleteTheNode() 
	{
		MyNode<Integer> myFirstNode=new MyNode<Integer>(56);
    	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
    	MyNode<Integer> myThirdNode=new MyNode<Integer>(70);
    	MyNode<Integer> myFourthNode=new MyNode<Integer>(40);
    	MyLinkedList myLinkedList=new MyLinkedList();
    	myLinkedList.add(myFirstNode);
    	myLinkedList.append(myThirdNode);
    	myLinkedList.insert(myFirstNode,mySecondNode);
    	myLinkedList.searchLinkedListAndInsertNode(30,myFourthNode);
    	myLinkedList.searchLinkedListAndDeleteNode(40);
    	myLinkedList.printMyNode();
    	MyNode<Integer> newNode= (MyNode<Integer>) myLinkedList.searchLinkedListAndInsertNode(30,myFourthNode);
    	Assert.assertEquals(newNode,mySecondNode);
	}
	@Test
	public void givenLinkedListSortedInAscendingOrderShouldPassTestCase() 
	{
		MyNode<Integer> myFirstNode=new MyNode<Integer>(56);
    	MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
    	MyNode<Integer> myThirdNode=new MyNode<Integer>(40);
    	MyNode<Integer> myFourthNode=new MyNode<Integer>(70);
    	MySortedLinkedList myLinkedList=new MySortedLinkedList();
    	myLinkedList.addSorted(myFirstNode);
    	myLinkedList.addSorted(mySecondNode);
    	myLinkedList.addSorted(myThirdNode);
    	myLinkedList.addSorted(myFourthNode);
    	myLinkedList.printMyNode();
    	boolean result = myLinkedList.head.equals(mySecondNode) && myLinkedList.head.getNext().equals(myFirstNode) && myLinkedList.head.getNext().getNext().equals(myFourthNode);
		Assert.assertEquals(true,result);
	}
}
