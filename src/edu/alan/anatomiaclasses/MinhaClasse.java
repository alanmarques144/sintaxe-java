package edu.alan.anatomiaclasses;

public class MinhaClasse {
    public static void main(String [] args){

        String primeiroNome = "alan";
        String segundoNome = "bezerra";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "resultado é " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
