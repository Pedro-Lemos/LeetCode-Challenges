## Intuition
Dado o head de uma linked list (lista encadeada), retorne o nó do meio da lista.

Se houver dois nós do meio (em listas com quantidade par de elementos), retorne o segundo nó do meio.

## Approach

- Crio dois "ponteiros" do tipo ListNode, o `fast` e o `slow`.
    - O `fast` irá caminhar 2 passos pelo nó
    - O `slow` irá caminhar 1 passo de cada vez pelo nó
- Enquanto eu verifico se o `fast` é nulo e se o `fast` dando 2 passos também é nulo (utilizando o laço while)
    - Caminho o `slow` uma única vez
    - Caminho o `fast` dois passos
- Quando `fast` for nulo, retorne `slow`


## Complexity

- Time complexity: O(n)
- Space complexity: O(1)

## Runtime

- 0 ms

## Memory

- 41.36mb

## Code
```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
```