## Intuition
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.


## Approach
1. Inicializei uma variável `wealth` para armazenar o maior saldo encontrado, começando com 0.
2. Percorra cada cliente (linha da matriz `accounts`).
   - Para cada cliente, inicialize uma variável `soma` para calcular a soma dos saldos de suas contas.
   - Percorra todas as contas do cliente (colunas da matriz) e acumule os valores em `soma`.
3. Após calcular a soma das contas de um cliente, compare-a com o valor atual de `wealth`. Se for maior, atualize `wealth`.
4. Após processar todos os clientes, retorne o valor de `wealth` como o maior saldo encontrado.
## Complexity

- Time complexity: O(m * n)
- Space complexity: O(1)

## Runtime

- 0 ms

## Memory

- 42.84mb

## Code
```java
class Solution {
    public int maximumWealth(int[][] accounts) {
        int i, j;
        int wealth = 0;
        for(i = 0; i < accounts.length; i++){
            int soma = 0;
            
            for(j = 0; j < accounts[i].length; j++){
                int valor = accounts[i][j];
                soma = soma + valor;
            }
            if (soma > wealth) {
                wealth = soma;
            }
        }
        return wealth;
    }
}
```