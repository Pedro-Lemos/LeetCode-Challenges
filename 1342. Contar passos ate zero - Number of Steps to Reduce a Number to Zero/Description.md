## Intuition
Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

## Approach

- Verifico se há uma condição de parada, por exemplo, se o `n` for zero, retorne 0;
- Verifico se o `n` dado pela função é par, verificando se a divisão do número por 2 é 0;
    - Se for eu divido esse número por 2
    - Se não for, subtraio 1 do numero inteiro
- Retorno a recursão desse método somando 1 passo à chamada recursiva.

## Complexity

- Time complexity: O(log n)
- Space complexity: O(log n)

## Runtime

- 0 ms

## Memory

- 40.46mb

## Code
```java
class Solution {
    public int numberOfSteps(int num) {
        if(num == 0) return 0;
        if(num % 2 == 0){
            num = num / 2;
        } else {
            num = num - 1;
        }
        return 1 + numberOfSteps(num);
    }
}
```