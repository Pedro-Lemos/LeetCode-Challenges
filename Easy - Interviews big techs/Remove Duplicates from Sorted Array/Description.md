## Intuition
Dado um array ordenado nums, você precisa:

- Remover os elementos duplicados in-place (no próprio array),
- Retornar quantos valores únicos existem (k),
E garantir que os primeiros k elementos do array contenham esses valores únicos, na mesma ordem que estavam.

## Approach
Essa técnica usa dois índices:

- i: Aponta para a posição onde vamos colocar o próximo valor único.
- j: Percorre o array do início ao fim, comparando com nums[i].

🔄 Lógica:
1. Começamos com i = 0 (primeiro valor é sempre único).
2. De j = 1 até o fim do array:
    - Se nums[j] for diferente de nums[i], encontramos um novo número único.
    - Aumentamos i e colocamos esse valor novo em nums[i].
3. No final, os valores únicos estarão de nums[0] até nums[i].
4. Retornamos i + 1, que é o total de valores únicos.

## Complexity

- Time complexity: O(n)
- Space complexity: O(1)

## Runtime

- 1 ms

## Memory

- 44.8mb

## Code
```java
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
```