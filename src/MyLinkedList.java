
public class MyLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		KLinkedList linkedList=new KLinkedList();
		
		linkedList.add("1");
		linkedList.add("2");
		linkedList.add("3");
		linkedList.add("4");
		linkedList.add("before 2", 2);
		linkedList.add("5");

		System.out.println("linkedList - print linkedlist: " + linkedList);
        System.out.println("linkedList.size() - print linkedlist size: " + linkedList.size());
        System.out.println("linkedList.get(3) - get 3rd element: " + linkedList.get(3));
        System.out.println("linkedList.remove(4) - remove 2nd element: " + linkedList.remove(2));
        System.out.println("linkedList.get(3) - get 3rd element: " + linkedList.get(3));
        System.out.println("linkedList.size() - print linkedlist size: " + linkedList.size());
        System.out.println("linkedList - print linkedlist: " + linkedList);
	}

}
