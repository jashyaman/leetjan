package leetcode.jan;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	
	public static List<String> flow = null;
	
	public class Tree {
		
		public Tree() {
			data =0;
			leftNode = null;
			rightNode = null;
		}
		
		
		
		public Tree(int data) {
			super();
			this.data = data;
			leftNode = null;
			rightNode = null;
		}



		int data;
		Tree leftNode;
		Tree rightNode;
	}
	
	public Tree insertBST(Tree bstRoot ,int element) {
		
		if(bstRoot == null) {
			bstRoot = new Tree(element);
			return bstRoot;
		}
		
		if(bstRoot.data == 0) {
			bstRoot.data = element;
			return bstRoot;
		}
		
		if(bstRoot.data > element) {
			bstRoot.leftNode = insertBST(bstRoot.leftNode, element);
		} else {
			bstRoot.rightNode = insertBST(bstRoot.rightNode, element);
		}
		return bstRoot;
	}
	
	
	public Tree findInBST(Tree bstRoot, int element) {
		if(flow == null) {
			flow = new ArrayList<String>();
		}
		if(bstRoot == null) {
			System.out.println("element " +element+" not found");
			return null;
		} 
		
		if(bstRoot.data == element) {
			flow.add(bstRoot.data+"<");
			return bstRoot;
		}
		
		if(bstRoot.data > element) {
			flow.add(bstRoot.data + " -L> ");
			return findInBST(bstRoot.leftNode, element);
		} else {
			flow.add(bstRoot.data + " -R> ");
			return findInBST(bstRoot.rightNode, element);
		}
		
	}
	
	public boolean deleteInBST (Tree bstRoot, int element) {
		if(bstRoot == null) {
			return true;
		}
		
		
		
		
		
		return false;
	}

	
	
	
	
	public static void main(String[] args) {
		List<Integer> elements = new ArrayList<>();
		//16, 12, 30, 6 , 13, 23, 90, 4, 8, 14
		elements.add(16);
		elements.add(12);
		elements.add(30);
		elements.add(6);
		elements.add(13);
		elements.add(23);
		elements.add(90);
		elements.add(4);
		elements.add(8);
		elements.add(14);
		
		
		Tree bstRoot = null;
		for(int element : elements) {
			bstRoot
			 = new BinarySearchTree().insertBST(bstRoot, element);
		}
		
		bstRoot = new BinarySearchTree().findInBST(bstRoot, 8);
		
		System.out.println(flow);
		
		
		
	}
}
