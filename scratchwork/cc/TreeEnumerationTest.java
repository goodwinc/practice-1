package practice.cc;

import java.util.Enumeration;

import practice.util.TreeNode;

/*
 * i implemented the java.util.Enumeration interface with different
 * traversals of binary trees. note that typically these traversals
 * are done through recursion. however i found that non iterative
 * solution using a java.util.Stack is more suited for
 * java.util.Enumeration interface
 */

public class TreeEnumerationTest {
	public static void main(String[] args) {
		TreeNode<Integer> singleNode = new TreeNode<Integer>(new Integer(1));

		TreeNode<Integer> rootNode = new TreeNode<Integer>(new Integer(4));
		rootNode.left = new TreeNode<Integer>(new Integer(2));
		rootNode.left.left = new TreeNode<Integer>(new Integer(1));
		rootNode.left.left.left = new TreeNode<Integer>(new Integer(0));
		rootNode.left.right = new TreeNode<Integer>(new Integer(3));
		rootNode.right = new TreeNode<Integer>(new Integer(5));
		rootNode.right.right = new TreeNode<Integer>(new Integer(6));

		testPreOrderTraversal(null);
		testPreOrderTraversal(singleNode);
		testPreOrderTraversal(rootNode);
		
		testInOrderTraversal(null);
		testInOrderTraversal(singleNode);
		testInOrderTraversal(rootNode);

		testPostOrderTraversal(null);
		testPostOrderTraversal(singleNode);
		testPostOrderTraversal(rootNode);
	}

	private static void printEnumeration(Enumeration<Integer> e) {
		while (e.hasMoreElements()) {
			Integer node = e.nextElement();
			System.out.print(" " + node.toString() + " ");
		}
		System.out.println("");
	}

	private static void testPreOrderTraversal(TreeNode<Integer> root) {
		Enumeration<Integer> enumerator = new PreOrderTreeEnumeration<Integer>(root);
		printEnumeration(enumerator);
	}

	private static void testInOrderTraversal(TreeNode<Integer> root) {
		Enumeration<Integer> enumerator = new InOrderTreeEnumeration<Integer>(root);
		printEnumeration(enumerator);
	}

	private static void testPostOrderTraversal(TreeNode<Integer> root) {
		Enumeration<Integer> enumerator = new PostOrderTreeEnumeration<Integer>(root);
		printEnumeration(enumerator);
	}
}
