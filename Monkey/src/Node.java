public class Node {
    private int name;
    private Node next;
    public Node(int aName,Node nextNode){
        this.name=aName;
        this.next=nextNode;
    }
    public void setName(int aName){
        this.name=aName;
    }
    public void setNext(Node aNext){
        this.next=aNext;
    }
    public int getName(){return this.name;}
    public Node getNext(){return this.next;}
}