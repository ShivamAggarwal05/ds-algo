package tree;

public class Tree {
	Node root=null;
	
	public Node getRoot() {
		return this.root;
	}
	
	public void insert(Node node) {
		//Node node= new Node(data);
		Node temp=root;
		if(getRoot()==null) {
		root=node;
		}else {
			boolean left=true;
			Node parent=null;
			while(temp!=null) {
				parent=temp;
			if(temp.getData()>node.getData()) {
				temp=temp.leftChild;
			}else {
				temp=temp.rightChild;
				left=false;
			}
			
			}
			if(left) {
				parent.setLeftChild(node);
			}
			else {
				parent.setRightChild(node);
			}
			node.setParent(parent);
		}
		System.out.println("inserted "+ node.getData());
		
	}
	public void printTree() {
		printInorder(root);
	}
public void printTree(String orderType) {
		switch(orderType) {
		
		case "PREORDER":
			printPreorder(root);
			break;
		case "INORDER":
			printInorder(root);
			break;
		case "POSTORDER":
			printPostorder(root);
			break;
		}
			
	}
public void printInorder(Node root) {
	//System.out.println(root);
	if(root!=null) {
	printInorder(root.getLeftChild());
	System.out.println(root.getData());
	printInorder(root.getRightChild());
	}
}
public void printPreorder(Node root) {
	if(root!=null) {
	System.out.println(root.getData());
	printInorder(root.getLeftChild());
	printInorder(root.getRightChild());
	}
}
public void printPostorder(Node root) {
	if(root!=null) {
	printInorder(root.getLeftChild());
	printInorder(root.getRightChild());
	System.out.println(root.getData());
	}
}
}
