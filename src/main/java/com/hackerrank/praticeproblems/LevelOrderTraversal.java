package com.hackerrank.praticeproblems;

import java.util.LinkedList;

public class LevelOrderTraversal {
   public static void levelOrder(Node root) {

      if (root == null) {
         return;
      }
      // Queue - constant time - popping nodes off the queue
      // Insertion and deletion in queues takes place from the opposite ends of the list.
      // The insertion(enqueue) takes place at the rear of the list
      // and the deletion(dequeue) takes place from the front of the list.
      //levelOrder(root.left);
      //levelOrder(root.right);

      LinkedList<Node> queue = new LinkedList<>();
      queue.add(root);

      while (!queue.isEmpty()) {
         Node current_node = queue.poll();
         System.out.print(current_node.data + " ");
         if (current_node.left != null) queue.add(current_node.left);
         if (current_node.right != null) queue.add(current_node.right);
      }
   }

   class Node {
      int data;
      Node left;
      Node right;
   }

}
