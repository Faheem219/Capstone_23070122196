class Node_SIT {
    int data;
    Node_SIT next;

    Node_SIT(int data) {
        this.data = data;
    }
}

public class SIT_202 {
    public static void main(String[] args) {
        Node_SIT head = new Node_SIT(10);

        head.next = new Node_SIT(20);
        head.next.next = new Node_SIT(10);
        head.next.next.next = new Node_SIT(20);
        head.next.next.next.next = new Node_SIT(50);

        head.next.next.next.next.next = head.next;

        boolean hasCycle = detectCycle(head);
        // printList(head);
    }

    static boolean detectCycle(Node_SIT head) {
        Node_SIT slow = head;
        Node_SIT fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                removeCycle(head, slow);
                return true;
            }

        }
        return false;
    }

    static void removeCycle(Node_SIT head, Node_SIT meetingPoint) {
        Node_SIT start = head;
        Node_SIT meeting = meetingPoint;

        // If cycle starts at head
        if (start == meeting) {
            // Find the last node in the cycle and set its next to null
            while (meeting.next != start) {
                meeting = meeting.next;
            }
            meeting.next = null;
            return;
        }

        // Move both pointers one step at a time until they meet
        // — they will meet at the cycle start node
        while (start.next != meeting.next) {
            start = start.next;
            meeting = meeting.next;
        }

        // meeting.next is the cycle start, break the cycle here
        meeting.next = null;
    }

    static void printList(Node_SIT head) {
        Node_SIT current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
