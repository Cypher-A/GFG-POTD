class Solution {
    Node arrangeCV(Node head) {
        if (head == null || head.next == null)
            return head;

        // Pointers for vowel and consonant sections
        Node vowelHead = new Node('0');
        Node consonantHead = new Node('0');
        Node vowelTail = vowelHead;
        Node consonantTail = consonantHead;

        Node curr = head;

        while (curr != null) {
            if (isVowel(curr.data)) {
                vowelTail.next = curr;
                vowelTail = vowelTail.next;
            } else {
                consonantTail.next = curr;
                consonantTail = consonantTail.next;
            }
            curr = curr.next;
        }

        // Joining vowel and consonant sections
        vowelTail.next = consonantHead.next;
        consonantTail.next = null;

        // New head is the head of the vowel section
        return vowelHead.next;
    }

    // Function to check if a character is a vowel
    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

