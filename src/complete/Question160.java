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

}
