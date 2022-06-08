package complete;

import objects.ListNode;

// Attempt 1 Completed -> 06/08/2022
public class Question160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        ListNode secondTemp = headB;

        while (temp != null) {

            while (secondTemp != null) {
                if (temp == secondTemp)
                    return temp;
                secondTemp = secondTemp.next;
            }

            secondTemp = headB;
            temp = temp.next;
        }
        return null;
    }

    // Second attempt to make it O(1) for memory and O(N) for time complexity
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        int aSize = getSize(headA), bSize = getSize(headB);

        // Case: ListNode headA is bigger
        while (aSize > bSize) {
            aSize--;
            headA = headA.next;
        }

        // Case: ListNode headB is bigger
        while (bSize > aSize) {
            bSize--;
            headB = headB.next;
        }

        // Setting the intersecting points
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    public int getSize(ListNode node) {
        ListNode temp = node;
        int counter = 0;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
    }

}
