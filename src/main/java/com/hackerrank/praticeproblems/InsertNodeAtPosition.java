package com.hackerrank.praticeproblems;


public class InsertNodeAtPosition {

   class SinglyLinkedListNode {
      int data;
      SinglyLinkedListNode next;
   }

   SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

      SinglyLinkedListNode newNode = new SinglyLinkedListNode();
      SinglyLinkedListNode currentNode = head;
      int index = 0;
      while (index < position - 1) {
         currentNode = currentNode.next;
         index++;
      }
      currentNode.next = newNode.next;
      newNode.next = currentNode;
      return head;
   }
}
