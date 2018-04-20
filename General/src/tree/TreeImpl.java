package tree;

public class TreeImpl {
	
	/*public TreeImpl(Tree tree) {
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tree tree1=new Tree();
Node node10=new Node(10);
tree1.insert(node10);
Node node20=new Node(20);
tree1.insert(node20);
Node node5=new Node(5);
tree1.insert(node5);
Node node7=new Node(7);
tree1.insert(node7);
Node node3=new Node(3);
tree1.insert(node3);
//tree1.printTree();

TreeImpl treeImpl=new TreeImpl();
//System.out.println(treeImpl.findPredecessor(node3,tree1.getRoot()));
System.out.println(treeImpl.findSuccessor(node20,tree1.getRoot()));
	//System.out.println(treeImpl.getNumberOfTreesPossible(6));
	}
	
	//find predecessor of an element
	public Node findPredecessor(Node node, Node root) {
		if(node.getLeftChild()!=null) {
			Node leftChild=node.getLeftChild();
				Node res=leftChild;
				
			while(res.getRightChild()!=null) {
				res=res.getRightChild();
			}
			return res;
		}else {
			Node temp=root;
			Node res=null;
			while(node.getData()!=temp.getData()) {
				if(node.getData()>temp.getData()) {
					res=temp;
					temp=temp.getRightChild();
				}else {
					
					temp=temp.getLeftChild();
					
				}
			}
			return res;
		}
	}
	
	//find successor of an element
	public Node findSuccessor(Node node, Node root) {

		if(node.getRightChild()!=null) {
			Node rightChild=node.getRightChild();
				Node res=rightChild;
			while(res.getLeftChild()!=null) {
				res=res.getLeftChild();
			}
			return res;
		}else {
			Node temp=root;
			Node res=null;
			while(node.getData()!=temp.getData()) {
				if(node.getData()>temp.getData()) {
					
					temp=temp.getRightChild();
				}else {
					res=temp;
					temp=temp.getLeftChild();
					
				}
			}
			return res;
		}
	
	}
	
	//find number of trees possible
	public int getNumberOfTreesPossible(int elem) {
		int a[]=new int[elem+1];
		a[0]=a[1]=1;
		for(int i=2;i<=elem;i++) {
			for(int j=0;j<i;j++) {
				a[i]+=a[j]*a[i-j-1];
			}
		}
		return a[elem];
	}

}
