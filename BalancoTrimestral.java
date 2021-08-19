//Crie uma classe chamada BalancoTrimestral com um bloco main, como nos exemplos anteriores; 
public class BalancoTrimestral{
    public static void main (String args[]){
        //Dentro do main (o miolo do programa), declare uma variável inteira chamada gastosJaneiro e inicialize-a com 15000;
        byte idade=36;       
        int gastosJaneiro=15000;
        /*Crie também as variáveis gastosFevereiro e gastosMarco , 
        inicializando-as com 23000 e 17000, respectivamente,
        utilize uma linha para cada declaração;*/
        int gastosFevereiro=22000;
        int gastosMarco=17888;
        /*Crie uma variável chamada gastosTrimestre e inicialize-a 
        com a soma das outras 3 variáveis: 
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;*/
        int gastosTrimestral=gastosJaneiro+gastosFevereiro+gastosMarco;
        int gastoMensal=gastosTrimestral/3;      
        //Exibe utilizando classes a cima.Imprima a variável gastosTrimestre .
        System.out.println("O gasto trimestral foi de: "+gastosTrimestral);
        /* Adicione código (sem alterar as linhas que já existem) na classe
         anterior para imprimir a média mensal de gasto, criando uma variável
          mediaMensal junto com uma mensagem. Para isso, concatene a String com o valor,
         usando "Valor da média mensal = " + mediaMensal .*/
        System.out.println("O gasto mensal foi de: "+gastoMensal);
           
            }
}