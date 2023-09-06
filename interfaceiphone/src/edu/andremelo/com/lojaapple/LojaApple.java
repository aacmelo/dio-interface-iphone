package edu.andremelo.com.lojaapple;

import edu.andremelo.com.aparelhotelefonico.AparelhoTelefonico;
import edu.andremelo.com.aparelhotelefonico.CelularAntigo;
import edu.andremelo.com.navegadorinternet.NavegadorInternet;
import edu.andremelo.com.navegadorinternet.Safari;
import edu.andremelo.com.novoiphone.NovoIphone;
import edu.andremelo.com.reprodutormusical.Ipod;
import edu.andremelo.com.reprodutormusical.ReprodutorMusical;
public class LojaApple {
    public static void main(String[] args) {

        ReprodutorMusical ipod = new Ipod();
        System.out.print("\n");
        System.out.println("=================Ipod==================");
        System.out.print("\n");
        ipod.selecionarMusica();
        ipod.tocarMusica();
        ipod.pausarMusica();
        System.out.print("\n");

        NavegadorInternet safari = new Safari();
        System.out.print("\n");
        System.out.println("===============Navegador Safari=========");
        System.out.print("\n");
        safari.exibirPagina();
        safari.adicionarNovaAba();
        safari.atualizarPagina();
        System.out.print("\n");

        AparelhoTelefonico telefone = new CelularAntigo();
        System.out.print("\n");
        System.out.println("===============Celular Antigo============");
        System.out.print("\n");
        telefone.ligarTelefone();
        telefone.atenderTelefone();
        telefone.iniciarCorreioVoz();

        NovoIphone iphone = new NovoIphone();

        System.out.print("\n");
        System.out.println("===============Novo Iphone============");
        System.out.print("\n");
        ((ReprodutorMusical) iphone).tocarMusica();
        ((NavegadorInternet) iphone).exibirPagina();
        ((AparelhoTelefonico) iphone).atenderTelefone();
    }
}
