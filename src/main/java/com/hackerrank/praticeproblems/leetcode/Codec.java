package com.hackerrank.praticeproblems.leetcode;

import java.util.LinkedList;
import java.util.List;

class Node {
   public Node() {
   }
   public Node(int _val) {
      val = _val;
   }

   public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
   }
   public int val;
   public List<Node> children;
};

class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;

   TreeNode(int x) {
      val = x;
   }
}

public class Codec {
   // Encodes an n-ary tree to a binary tree.
   public TreeNode encode(Node root) {
      if(root == null) {
         return null;
      }

      TreeNode result =  new TreeNode(root.val);
      if(root.children.size() > 0) {
         result.left = encode(root.children.get(0));
      }
      TreeNode current = result.left;
      for (int i = 1; i < root.children.size(); i++) {
         current.right = encode(root.children.get(i));
         current = current.right;
      }
      return result;
   }

   // Decodes your binary tree to an n-ary tree.
   public Node decode(TreeNode root) {
      Node result = new Node(root.val, new LinkedList<>());
      if (root == null) {
         return null;
      }
      TreeNode current = root.left;
      while(current != null) {
         result.children.add(decode(current));
         current = current.right;
      }
      return result;
   }
}
