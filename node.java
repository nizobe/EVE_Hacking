public abstract class Node
{
	/* type of node
	TODO explain types
	*/
	int type;

	//0=hidden, 1=revealed
	int revealed;

	/* Neighboring nodes
	1 is top right, 2 is right, 3 is bottomr right, etc*/
	Node neighbor1;
	Node neighbor2;
	Node neighbor3;
	Node neighbor4;
	Node neighbor5;
	Node neighbor6;

	//reveal the node and trigger any events upon revealing
	void reveal();
}//end class Node