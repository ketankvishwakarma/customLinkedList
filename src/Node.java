public class Node {
	/**
	 * reference to the next node in the chain, or NULL if there isn't one.
	 * */
	Node next;

	/*
	 * data carried by this node. could be of any type you need
	 */
	Object data;

	// node constructor
	public Node(Object dataValue) {
		next = null;
		data = dataValue;
	}

	//another constructor if we want to specify the node to point to.
	public Node(Object dataValue, Node nextValue) {
		next = nextValue;
		data = dataValue;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
