package com.skydust.springsource.basearithmetic;

import java.util.Stack;

public class BinaryTree {

	private TreeNode root;

	public BinaryTree() {
		root = new TreeNode(1, "A");
	}

	/**
	 * 
	 * @param root
	 */
	public void createBinTree(TreeNode root) {
		TreeNode nodeB = new TreeNode(2, "B");
		TreeNode nodeC = new TreeNode(3, "C");
		TreeNode nodeD = new TreeNode(4, "D");
		TreeNode nodeE = new TreeNode(5, "E");
		TreeNode nodeF = new TreeNode(6, "F");
		TreeNode nodeG = new TreeNode(7, "G");
		TreeNode nodeH = new TreeNode(8, "H");
		root.leftNode = nodeB;
		root.rightNode = nodeC;
		nodeB.leftNode = nodeD;
		nodeB.rightNode = nodeE;
		nodeD.rightNode = nodeG;
		nodeC.leftNode = nodeF;
		nodeC.rightNode = nodeH;
	}

	private class TreeNode {
		private int key;

		private String data;

		private TreeNode leftNode;

		private TreeNode rightNode;

		public TreeNode(int key, String data) {
			this.key = key;
			this.data = data;
		}

	}

	public int size() {
		return size(root);
	}

	private int size(TreeNode subNode) {
		if (subNode == null) {
			return 0;
		}
		return 1 + size(subNode.leftNode) + size(subNode.rightNode);
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createBinTree(tree.root);
		int size = tree.size(tree.root);
		System.out.println("节点数共" + size + "个");
		int height = tree.height(tree.root);
		System.out.println("树形结构高度："+height);
		System.out.println("前序遍历：");
		tree.preOrder(tree.root);
		
		System.out.println();
		System.out.println("非递归方法实现的前序遍历");
		tree.noRecPreOrder(tree.root);
		
		System.out.println();
		System.out.println("中序遍历：");
		tree.inOrder(tree.root);
		
		System.out.println();
		System.out.println("非递归方法实现中序遍历");
		tree.noRecInOrder(tree.root);
		
		System.out.println();
		System.out.println("后序遍历：");
		tree.postOrder(tree.root);
		
		System.out.println();
		System.out.println("非递归方法实现后序遍历");
		tree.noRecPostOrder(tree.root);
		
	}

	private int height(TreeNode subNode) {
		if (subNode == null) {
			return 0;
		}
		int i = height(subNode.leftNode);
		int j = height(subNode.rightNode);
		return i < j ? (j + 1) : (i + 1);
	}
	/**
	 * 前序遍历
	 */
	public void preOrder(TreeNode node){
		if(node != null){
			visited(node);
			preOrder(node.leftNode);
			preOrder(node.rightNode);
		}
	}
	/**
	 * 非递归方法实现的前序遍历
	 * @param node
	 */
	public void noRecPreOrder(TreeNode node){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(node != null || stack.size()>0){
			while(node != null){
				visited(node);
				stack.push(node);
				node = node.leftNode;
			}
			if(stack.size()>0){
				node = stack.pop();
				node = node.rightNode;
			}
		}
	}
	/**
	 * 中序遍历
	 * @param node
	 */
	public void inOrder(TreeNode node){
		if(node != null){
			inOrder(node.leftNode);
			visited(node);
			inOrder(node.rightNode);
		}
	}
	/**
	 * 非递归方法实现中序遍历
	 * @param node
	 */
	public void noRecInOrder(TreeNode node){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(node != null || stack.size()>0){
			while(node != null){
				stack.push(node);
				node = node.leftNode;
			}
			if(stack.size()>0){
				node = stack.pop();
				visited(node);
				node = node.rightNode;
			}
		}
	}
	/**
	 * 后序遍历
	 * @param node
	 */
	public void postOrder(TreeNode node){
		if(node != null){
			postOrder(node.leftNode);
			postOrder(node.rightNode);
			visited(node);
		}
	}
	/**
	 * 非递归方法实现后序遍历
	 * @param node
	 */
	public void noRecPostOrder(TreeNode node){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(node != null){
			while(node != null){
				node = node.leftNode;
			}
		}
	}

	private void visited(TreeNode node) {
		System.out.print(node.data+ " ");
	}
}
