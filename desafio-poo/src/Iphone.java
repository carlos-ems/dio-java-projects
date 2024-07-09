import components.reprodutor.ReprodutorMusical;
import components.aparelho.AparelhoTelefonico;
import components.navegador.NavegadorInternet;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Reprodutor musical
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // Aparelho telefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamado");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correiro de voz");
    }

    // Navegador de internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public static void main(String[] args) {
        Iphone myIphone = new Iphone();

        // Teste do reprodutor musical
        myIphone.tocar();
        myIphone.pausar();
        myIphone.selecionarMusica("BELLAKEO - Peso Pluma, Anitta");
        System.out.println("");

        // Teste do aparelho telefonico
        myIphone.ligar("11 98801-2219");
        myIphone.atender();
        myIphone.iniciarCorreioVoz();
        System.out.println("");

        // Teste do navegador de internet
        myIphone.exibirPagina("https://github.com/carlos-ems");
        myIphone.adicionarNovaAba();
        myIphone.atualizarPagina();
    }
}
