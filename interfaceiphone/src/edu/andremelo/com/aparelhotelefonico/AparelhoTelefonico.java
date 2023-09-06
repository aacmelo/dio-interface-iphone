package edu.andremelo.com.classes;
public interface AparelhoTelefonico {
    public default void ligarTelefone(){
        System.out.println("Ligando o Telefone!");
    }
    public default void atenderTelefone(){
        System.out.println("Atendendo o Telefone!");
    }
    public default void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz");
    }
}
