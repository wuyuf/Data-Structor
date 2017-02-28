package java_eleven;

class BinaryTree{
	class Node{			// 声明一个节点类
		private Comparable data ;	// 保存具体的内容
		private Node left ;			// 保存左子树
		private Node right ;		// 保存右子树
		public Node(Comparable data){
			this.data = data ;
		}
		public void addNode(Node newNode){
			// 确定是放在左子树还是右子树
			if(newNode.data.compareTo(this.data)<0){	// 内容小，放在左子树
				if(this.left==null){
					this.left = newNode ;	// 直接将新的节点设置成左子树
				}else{
					this.left.addNode(newNode) ;	// 继续向下判断
				}
			}
			if(newNode.data.compareTo(this.data)>=0){	// 放在右子树
				if(this.right==null){
					this.right = newNode ;	// 没有右子树则将此节点设置成右子树
				}else{
					this.right.addNode(newNode) ;	// 继续向下判断
				}
			}
		}
		public void printNode(){		//输出时采用中序遍历
			if(this.left!=null){
				this.left.printNode();
			}
			System.out.println(this.data + "\t");
			if(this.right!=null){
				this.right.printNode();
			}
		}
	}	
		private Node root;			//根元素
		public void add(Comparable data){	// 加入元素
			Node newNode = new Node(data);
			if(root==null){
				root = newNode;
			}else{
				root.addNode(newNode);
			}
		}
		public void print()	{
			this.root.printNode();
		}
	}

public class ComparableTreeDemo{
	public static void main(String args[]){
		BinaryTree bt = new BinaryTree() ;
		bt.add(8) ;
		bt.add(3) ;
		bt.add(3) ;
		bt.add(40) ;
		bt.add(9) ;
		bt.add(1) ;
		bt.add(5) ;
		bt.add(5) ;
		System.out.println("排序之后的结果：") ;
		bt.print() ;
	}
};