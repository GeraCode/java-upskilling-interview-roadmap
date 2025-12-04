package com.geracode.javaupskillinginterviewroadmap.javastudy.leetcode;

/**
 * Code : https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
 */
public class Code1ALinkedList {
    
    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        // =======================
        // Case 1: 1,3,4,7,1,2,6
        // =======================
        ListNode c1 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(7, new ListNode(1, new ListNode(2, new ListNode(6)))))));

        System.out.println("\nCase 1 (original):");
        System.out.println(c1);
        c1 = sol.deleteMiddle(c1);
        System.out.println("Case 1 (modified):");
        System.out.println(c1);

        // =======================
        // Case 2: 1,2,3,4
        // =======================
        ListNode c2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        System.out.println("\nCase 2 (original):");
        System.out.println(c2);
        c2 = sol.deleteMiddle(c2);
        System.out.println("Case 2 (modified):");
        System.out.println(c2);

        // =======================
        // Case 3: 2,1
        // =======================
        ListNode c3 = new ListNode(2, new ListNode(1));

        System.out.println("\nCase 3 (original):");
        System.out.println(c3);
        c3 = sol.deleteMiddle(c3);
        System.out.println("Case 3 (modified):");
        System.out.println(c3);

        // =======================
        // Case 4: 1
        // =======================
        ListNode c4 = new ListNode(1);

        System.out.println("\nCase 4 (original):");
        System.out.println(c4);
        c4 = sol.deleteMiddle(c4);
        System.out.println("Case 4 (modified):");
        System.out.println(c4);
    }

    static class Solution {
        public ListNode deleteMiddle(ListNode head) { // [[1,2,3,4]]
            if (head.next == null) {
                return null;
            }
            int size = 0, middleNodeIndex = 0;
            ListNode curr = head;


            while (curr != null) {
                size++;
                curr = curr.next;
            }
            middleNodeIndex = size / 2;
            curr = head;
            for (int i = 0; i < middleNodeIndex - 1; i++) {
                curr = curr.next;
            }

                curr.next = curr.next.next;
            

            return head;
        }
    }


  /*
           // 1. Validate if the list is empty or if the head is null
           if head is null:
               return null // The list is empty


           // 2. Initialize variables
           size = 0
           current = head


           // 3. Calculate the size of the list
           while current is not null:
               size = size + 1
               current = current.next


           // 4. Calculate the index of the middle node
           middleNodeIndex = size // 2 // Use integer division to get the index of the middle node


           // 5. Delete the middle node
           current = head
           previous = null


           for i from 0 to middleNodeIndex:
               if i == middleNodeIndex:
                   // If we are at the middle node, skip it
                   if previous is not null:
                       previous.next = current.next // Skip the middle node
                   else:
                       // If the middle node is the first node, update the head
                       head = current.next // Update head if the middle node is the first node
                   break
               previous = current
               current = current.next


           // 6. Return the head of the modified list
           return head
   */


}
