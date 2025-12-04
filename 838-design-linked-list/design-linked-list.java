class MyLinkedList {

    ListNode head;
    ListNode tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;

        ListNode curr = head;
        int i = 0;

        while (i < index) {
            curr = curr.next;
            i++;
        }

        return curr.val;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }

        size++;
    }

    public void addAtTail(int val) {
        ListNode node = new ListNode(val);

        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;             // do nothing
        if (index < 0) index = 0;             // treat negative as 0

        // insert at head
        if (index == 0) {
            addAtHead(val);
            return;
        }

        // insert at tail
        if (index == size) {
            addAtTail(val);
            return;
        }

        // insert in middle
        ListNode curr = head;
        int i = 0;

        while (i < index - 1) {
            curr = curr.next;
            i++;
        }

        ListNode node = new ListNode(val);
        node.next = curr.next;
        curr.next = node;

        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (head == null) return;

        // delete head
        if (index == 0) {
            head = head.next;
            size--;

            // if list becomes empty
            if (size == 0) {
                tail = null;
            }
            return;
        }

        // delete middle or tail
        ListNode curr = head;
        int i = 0;

        while (i < index - 1) {
            curr = curr.next;
            i++;
        }

        ListNode del = curr.next;
        curr.next = del.next;

        // if deleting tail
        if (curr.next == null) {
            tail = curr;
        }

        size--;
    }

}
