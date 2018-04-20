package tree;

public class Node {
Node leftChild;
Node rightChild;
Node parent;
int data;

public Node(int data) {
	this.data=data;
}
public Node getLeftChild() {
	return leftChild;
}
public void setLeftChild(Node leftChild) {
	this.leftChild = leftChild;
}
public Node getRightChild() {
	return rightChild;
}
public void setRightChild(Node rightChild) {
	this.rightChild = rightChild;
}
public Node getParent() {
	return parent;
}
public void setParent(Node parent) {
	this.parent = parent;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
@Override
public String toString() {
	return "Node [data=" + data + "]";
}


}
