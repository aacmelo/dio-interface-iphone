package edu.andremelo.com.classes;
public interface NavegadorInternet {
    public default void exibirPagina(){
        System.out.println("Exibindo a Pagina!");
    }
    public default void adicionarNovaAba(){
        System.out.println("Adicionando nova Aba!");
    }
    public default void atualizarPagina(){
        System.out.println("Atualizando a Pagina!");
    }
}
