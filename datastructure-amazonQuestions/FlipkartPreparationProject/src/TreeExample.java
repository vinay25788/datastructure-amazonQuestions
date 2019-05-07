
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author w w w. j a v a g i s t s . c o m
 *
 */

public class TreeExample {

	static Node<String> root;
	static Map<String,Node> map = new HashMap<>();
	static class Node<T> {

		private T data = null;

		private List<Node<T>> children = new ArrayList<>();

		

		private Node<T> parent = null;

		public Node(T data) {
			this.data = data;
		}

		public Node<T> addChild(Node<T> child) {
			child.setParent(this);
			this.children.add(child);
			map.put((String)child.data,child);
			return child;
		}

		public void addChildren(List<Node<T>> children) {
			children.forEach(each -> each.setParent(this));
			
			this.children.addAll(children);
			
		}

		public List<Node<T>> getChildren() {
			return children;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		private void setParent(Node<T> parent) {
			this.parent = parent;
		}

		public Node<T> getParent() {
			return parent;
		}

		/*
		 * private static Node<String> createTree() { Node<String> root = new
		 * Node<>("root");
		 * 
		 * Node<String> node1 = root.addChild(new Node<String>("node 1"));
		 * 
		 * Node<String> node11 = node1.addChild(new Node<String>("node 11"));
		 * Node<String> node111 = node11.addChild(new Node<String>("node 111"));
		 * Node<String> node112 = node11.addChild(new Node<String>("node 112"));
		 * 
		 * Node<String> node12 = node1.addChild(new Node<String>("node 12"));
		 * 
		 * Node<String> node2 = root.addChild(new Node<String>("node 2"));
		 * 
		 * Node<String> node21 = node2.addChild(new Node<String>("node 21"));
		 * Node<String> node211 = node2.addChild(new Node<String>("node 22")); return
		 * root; }
		 */

		public void deleteNode(String emp) {
			if(map.containsKey(emp)) {
				Node empNode = map.get(emp);
				Node parent = empNode.getParent();
			if (parent != null) {
				int index = this.parent.getChildren().indexOf(this);
				this.parent.getChildren().remove(this);
				for (Node<T> each : getChildren()) {
					each.setParent(this.parent);
				}
				this.parent.getChildren().addAll(index, this.getChildren());
			} else {
				deleteRootNode();
			}
			this.getChildren().clear();
		}
		}
		public Node<T> deleteRootNode() {
			if (parent != null) {
				throw new IllegalStateException("deleteRootNode not called on root");
			}
			Node<T> newParent = null;
			if (!getChildren().isEmpty()) {
				newParent = getChildren().get(0);
				newParent.setParent(null);
				getChildren().remove(0);
				for (Node<T> each : getChildren()) {
					each.setParent(newParent);
				}
				newParent.getChildren().addAll(getChildren());
			}
			this.getChildren().clear();
			return newParent;
		}

	}

	public static void main(String[] args) {
		// Node<String> root = createTree();
		Node<String> root = new Node<>("CTO");

		Node<String> node1 = root.addChild(new Node<String>("M1"));

		Node<String> node11 = node1.addChild(new Node<String>("TeamLead1"));
		Node<String> node111 = node11.addChild(new Node<String>("E1"));
		Node<String> node112 = node11.addChild(new Node<String>("E2"));

		Node<String> node12 = node1.addChild(new Node<String>("TeamLead2"));

		Node<String> node2 = root.addChild(new Node<String>("M2"));

		Node<String> node21 = node2.addChild(new Node<String>("E3"));
		Node<String> node211 = node2.addChild(new Node<String>("E4"));
		TreeExample.root = root;
		printParent(node211.data);
		System.out.println(" print hierchy of company");
		printTree(root," ");
		System.out.println("parmote");
		promoteEmployee(node211.data);
		printTree(root," ");
	}

	private static Node<String> createTree() {
		Node<String> root = new Node<>("root");

		Node<String> node1 = root.addChild(new Node<String>("node 1"));

		Node<String> node11 = node1.addChild(new Node<String>("node 11"));
		Node<String> node111 = node11.addChild(new Node<String>("node 111"));
		Node<String> node112 = node11.addChild(new Node<String>("node 112"));

		Node<String> node12 = node1.addChild(new Node<String>("node 12"));

		Node<String> node2 = root.addChild(new Node<String>("node 2"));

		Node<String> node21 = node2.addChild(new Node<String>("node 21"));
		Node<String> node211 = node2.addChild(new Node<String>("node 22"));
		return root;
	}

	private static <T> void printTree(Node<T> node, String appender) {

		
	//	if(map.containsKey(node.data)) {
			
		//if (root.map.containsKey(node.getData())) {
			System.out.println(appender + node.getData());
			node.getChildren().forEach(each -> printTree(each, appender + appender));
		//}
		//}
	}
	
	public static void printParent(String emp)
	{
		if(map.containsKey(emp))
		{
			Node node= map.get(emp);
			printParent(node," ");
		}
		else
		{
			System.out.println("employee not found");
			 return;
		}
	}
	
	public static void promoteEmployee(String emp)
	{
		if(map.containsKey(emp))
		{
			Node node = map.get(emp);
			Node parent = node.getParent();
			Node parentOfParent =null;
			if(parent !=null)
			{
				parentOfParent = parent.getParent();
			}
			
			
			
			if(parentOfParent !=null)
			{
				parentOfParent.addChild(node);
			}
			node.parent = parentOfParent;
			parent.children.remove(node);
		}
	}
	
	public static  <T> Node printParent(Node<T> node,String appender)
	{
		
		if(node == null)
			return null;
		printParent(node.getParent(),appender);
		System.out.println(node.getData());
		return node;
	}
}