// Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head) {
        // if list is empty, print nothing 
        if(head == null){
        } else {
            SinglyLinkedListNode ptr = head;
            
            // print data until end of list
            while (ptr != null){
                System.out.print(ptr.data + "\n");
                ptr = ptr.next;
            }
        }
    }