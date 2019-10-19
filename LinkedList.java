//https://www.cnblogs.com/en-heng/p/6385910.html


//Delete Node in a Linked List
public void deleteNode(ListNode node){
    node.val= node.next.val;
    node.next= node.next.next;
}

//Remove Linked Lists Elements
 public ListNode removeElements(ListNode head, int val){
     ListNode fakeHead= new ListNode(Integer.MIN_VALUE);
     fakeHead.next= head;
     for(ListNode curr=head, prev=fakeHead;curr!=null; curr=curr.next){
         if(curr.val==val){
             prev.next=curr.next;
         }else{
             prev=prev.next;
         }
     }
     return fakeHead.next;
 }

 //Remove Nth Node from End of List
public ListNode removeNthFromEnd(ListNode head, int n){
    ListNode fakeHead= new ListNode(integer.MIN_VALUE);
    fakeHead.next= head;
    ListNode slow=fakeHead, fast=fakeHead;
    for(int i=1;i<=n+1;i++){
        fast=fast.next;
    }
    while(fast!= null){
        fast=fast.next;
        slow=slow.next;
    }
    slow.next=slow.next.next;
    return fakeHead.next;
}

//Remove Duplicates from sorted list
public ListNode deleteDuplicates(ListNode head){
    ListNode fakeHead= new ListNode(Integer.MIN_VALUE);
    fakeHead.next= head;
    for(ListNode curr=head, prev=fakeHead; curr!=null && curr.next!=null;curr=curr.next){
        if(curr.val==curr.next.val){
            prev.next=curr.next;
        }else{
            prev= prev.next;
        }
    }
    return fakeHead.next;
}






