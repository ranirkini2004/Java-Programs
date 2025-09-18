package linkedList;

public class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node {
        String data;
        Node next;



        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

        public void addFirst(String data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        }

        public void printList(){
            if(head==null){
                System.out.println("List is empty");
            }
            Node currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data+"->");
                currNode=currNode.next;
            }
            System.out.println("null");
        }

        public void deleteFirst(){
           if(head==null){
               System.out.println("List is empty");
               return;
           }
           size--;
           head=head.next;
        }
        public void deleteLast(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            size--;
            if(head.next==null){
                head=null;
                return;
            }
            Node secondNode=head;
            Node last=head.next;

            while(last.next!=null){
                last=last.next;
                secondNode=secondNode.next;
            }
            secondNode.next=null;
        }

        public int getSize(){
           return size;
        }

        public static void main(String[] args) {
           LL list=new LL();
           list.addFirst("is");
           list.addFirst("am");
           list.printList();
           list.addLast("rani");
           list.printList();
           list.deleteFirst();
           list.deleteLast();
           list.printList();
            System.out.println(list.getSize());
            list.addLast("kini");
            System.out.println(list.getSize());
        }
    }

