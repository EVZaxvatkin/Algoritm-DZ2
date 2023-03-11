package org.example;

public class ListNode {

    private int data;
    private ListNode next;

    ListNode(int data) {
        this.data=data;
        this.next=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    ListNode constructLinkedList() {
        ListNode head = null;
        ListNode tail = null;

        for (int i = 1; i <= 5; i++) {
            ListNode node = new ListNode(i);
            if (head == null){
                head = node;
            }
            else {
                tail.setNext(node);
            }
            tail=node;
        }
        return head;

    }

    ListNode reversList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current!=null){
            ListNode nextElement = current.getNext();
            current.setNext(previous);
            previous = current;
            current = nextElement;
        }
        return previous;

    }



}
