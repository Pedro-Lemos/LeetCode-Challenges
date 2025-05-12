class Resolution {
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