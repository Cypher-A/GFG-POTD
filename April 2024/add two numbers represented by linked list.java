class Solution{
    
    static Node reverse(Node head){
        
        Node curr = head;
        Node prev = null;
        
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }
        
        return prev;
        
    }
    
    static Node add(Node first , Node second){
        
        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;
        
        while(first != null || second != null || carry > 0){
            
            int sum = carry;
            
            if(first != null){
               sum += first.data;
               first = first.next;
            }
            
             if(second != null){
               sum += second.data;
               second = second.next;
            }
            
            carry = sum/10;
            current.next = new Node(sum%10); 
            current = current.next;
        }
        return dummy.next;
        
    }
    static Node addTwoLists(Node first, Node second){
        
        Node list1 = reverse(first);
        Node  list2 = reverse(second);
        
        Node ans = add(list1 , list2);
        
        ans = reverse(ans);
        
        Node cur = ans;
        
        while(cur != null && cur.data == 0){
            cur = cur.next;
        }
        
        return cur == null ? new Node(0) : cur;
    }
    
}
