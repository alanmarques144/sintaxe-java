package edu.alan.tiposevariaveis;

public class TiposVariaveis {

    public static void main(String[] args) {

        String nome = "DONALD MCDONALD";
        double valor = 3123.14;
        byte idade = 22;
        short ano = 2021;
        long cpf = 98765432109L;
        float pi = 3.14F;
        int numero = 5;
        final double VALOR_CONSTANTE = 144; // NÃO É POSSIVEL MODIFICAR O VALOR DA VARIAVÉL

        //observando o fato do java ser fortemente tipado
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

    }
    
}