public class BalancoTrimestral{
    public static void main (String args[]){
        byte idade=36;
        int gastosJaneiro=15000;
        int gastosFevereiro=22000;
        int gastosMarco=17888;
        int gastosTrimestral=gastosJaneiro+gastosFevereiro+gastosMarco;
        int gastoMensal=gastosTrimestral/3;      
        //Exibe utilizando classes a cima.
        System.out.println("O gasto trimestral foi de: "+gastosTrimestral);
        System.out.println("O gasto mensal foi de: "+gastoMensal);
           
            }
}