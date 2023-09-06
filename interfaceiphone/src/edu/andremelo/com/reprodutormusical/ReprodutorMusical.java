package edu.andremelo.com.classes;
public interface ReprodutorMusical {
    public default void tocarMusica(){
        System.out.println("Tocando a Musica!");
    }
    public default void pausarMusica(){
        System.out.println("Pausando a Musica");
    }
    public default void selecionarMusica(){
        System.out.println("Selecionando a Musica!");
    }
}
