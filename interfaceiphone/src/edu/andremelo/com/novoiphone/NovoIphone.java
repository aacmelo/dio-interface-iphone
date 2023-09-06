package edu.andremelo.com.novoiphone;

import edu.andremelo.com.aparelhotelefonico.AparelhoTelefonico;
import edu.andremelo.com.navegadorinternet.NavegadorInternet;
import edu.andremelo.com.reprodutormusical.ReprodutorMusical;
    public class NovoIphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
        @Override
        public void ligarTelefone() {
            System.out.println("Ligando o Iphone!");
        }
        @Override
        public void atenderTelefone() {
            System.out.println("Atendendo Ligação no Iphone!");
        }
        @Override
        public void iniciarCorreioVoz() {
            System.out.println("Iniciando o Correio de Voz no Iphone!");
        }
        @Override
        public void exibirPagina() {
            System.out.println("Exibindo pagina da Internet no Iphone!");
        }
        @Override
        public void adicionarNovaAba() {
            System.out.println("Abrindo nova Aba no Iphone!");
        }
        @Override
        public void atualizarPagina() {
            System.out.println("Atualizando pagina no Iphone!");
        }
        @Override
        public void tocarMusica() {
            System.out.println("Tocando Musica no Iphone!");
        }
        @Override
        public void pausarMusica() {
            System.out.println("Pausando Musica no Iphone!");
        }
        @Override
        public void selecionarMusica() {
            System.out.println("Selecionando Musica no Iphone!");
        }
    }
