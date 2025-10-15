class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class addLinkedListAtPosition {
    
    public Node insertPos(Node head, int pos, int val) {
        if(pos<1){
            return head;
        }
        if (pos == 1) {
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }
        Node curr = head;
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null)
            return head;
        Node newNode = new Node(val);
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }
}
