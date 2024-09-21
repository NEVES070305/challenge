public class Main {
    public static void main(String[] args) {

        int quantidade_de_colunas = 3;
        int quantidade_de_linhas = 5;
        
        int[][] matriz = new int[quantidade_de_linhas][quantidade_de_colunas];

        int maior_valor_da_sumatriz = 0;

        for (int i = 0; i < quantidade_de_linhas; i++) {
            for (int j = 0; j < quantidade_de_colunas; j++) {
                matriz[i][j] = i;
                
            }
            matriz[1][1]=-1;
            matriz[3][1]=-1;
            matriz[2][1] = -500;
            matriz[3][0] = -500;
            for (int j = 0; j < quantidade_de_colunas; j++) {
                
                
                System.out.print(matriz[i][j] + " ");
            } 
            
            System.out.println(); // Nova linha para a próxima linha da matriz
        }

        for (int quantidade_a_ser_somado_na_coluna = 1;quantidade_a_ser_somado_na_coluna<=quantidade_de_linhas;quantidade_a_ser_somado_na_coluna++){

        
        //loop que dita quantos valores da linha subsequentes serão somados
        for(int quantidade_a_ser_somado_na_linha=1;quantidade_a_ser_somado_na_linha<=quantidade_de_colunas; quantidade_a_ser_somado_na_linha++)
        {
            //int indice_maximo_alcancado_na_coluna = quantidade_de_colunas - quantidade_a_ser_somado_na_linha;
            
            //loop que percorre a linha
            for(int indice_linha = 0; indice_linha<=quantidade_de_linhas-quantidade_a_ser_somado_na_coluna;indice_linha++)
            {
                //lopp que percorre a coluna
                for(int indice_coluna = 0; indice_coluna<=quantidade_de_colunas-quantidade_a_ser_somado_na_linha;indice_coluna++)
                {
                    int soma = 0;
                    for (int k = 0; k < quantidade_a_ser_somado_na_linha;k++) {
                        for (int i = 0 ; i < quantidade_a_ser_somado_na_coluna;i++){
                        soma += matriz[i+indice_linha][k+indice_coluna];

                        }
                    }
                    if (soma > maior_valor_da_sumatriz) {
                        maior_valor_da_sumatriz = soma;
                    }

                }
                
            }
        }
        }
        System.out.println("Valor maior:");
        System.out.println(maior_valor_da_sumatriz);
    }
}