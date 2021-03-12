   // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        // if list empty 
        if (head == null){
            SinglyLinkedListNode insertNode = new SinglyLinkedListNode(data);
            head = insertNode;
        } else {
            SinglyLinkedListNode insertNode = new SinglyLinkedListNode(data);
            // pointer starting at head
            SinglyLinkedListNode ptr = head;

            // loop until no link 
            while(ptr.next != null){
                ptr = ptr.next;
            }
            // link 'insertNode' at tail
            ptr.next = insertNode;
        }
        return head;
    }