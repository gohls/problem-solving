// Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        // if list is empty
        if (head == null){
            head = new SinglyLinkedListNode(data);
        } else {
            SinglyLinkedListNode insertNode = new SinglyLinkedListNode(data);
            // pointer entry at head 
            SinglyLinkedListNode ptr = head;
            
            // decrement 'position' before comparison
            // step through list while 'position' greater than 0
            // AND not end of list
            while (--position > 0 && ptr != null){
                ptr = ptr.next;
            }
            // insert 'insertNode' at 'position' and link with list
            insertNode.next = ptr.next;
            ptr.next = insertNode;
        }
        return head;  
    }