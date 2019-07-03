/*You are given a linked list of N nodes. The task is to remove the loop from the linked list, if present.

Input:
First line of input contains number of testcases T. T testcases follow. For each testcase, first line of input contains length N of the linked list and next line contains N data of the linked list. The third line contains the position of the node(from head) to which the last node will get connected. If it is 0 then there is no loop.

Output:
For each testcase, in a new line, 1 will be printed if loop is removed(correct answer) else 0 will be printed(for wrong answer).*/



class Loop{
    
    // This function will remove the loop from the linked list
    public static void removeTheLoop(Node head)
    {
        if(head==null){
            return;
        }
        Node slow=head;
        Node fast=head;
        do{
           fast=fast.next;
           if(fast==null){
               return;
           }else{
               slow=slow.next;
               fast=fast.next;
           }
        }while(fast!=null&&fast!=slow);
        
        if(fast==null){
            return;
        }
        Node b=head;
    while(1==1){
        slow=fast;
        while(slow.next!=fast&&slow.next!=b){
            slow=slow.next;
        }
        if(slow.next==b){
            slow.next=null;
            return;
        }
        b=b.next;
    }
    }
}
