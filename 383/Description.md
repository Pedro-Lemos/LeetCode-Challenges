## Intuition
Você recebe duas strings:

`ransomNote` – a nota que alguém quer escrever.

`magazine` – os caracteres disponíveis para escrever a nota.

Retorne `true` se for possível construir `ransomNote` a partir dos caracteres de magazine.
Cada letra de `magazine` pode ser usada apenas uma vez.

## Approach

1. Conta as letras de ``magazine`` num array de tamanho fixo (int[26]).
2. Itera sobre ``ransomNote``, verificando se cada letra está disponível em magazine.


## Complexity

- Time complexity: O(n + m)
- Space complexity: O(1)

## Runtime

- 2 ms

## Memory

- 45.06mb

## Code
```java
/class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false;
            }
            count[c - 'a']--;
        }
        return true;
    }
}
```