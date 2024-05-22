public class Iphone implements aparelhoTelefonico, NavegadorInternet, ReprodutorMusical{


    private int botaoHome, botaoLigarDesligar, conectorIpod;
    private TelaToque telaToque;
    private SensorClaridade sensorClaridade;
    private SensorProximidade sensorProximidade;
    private Acelerometro acelerometro;
    private RanhuraSIM ranhuraSIM;
    private AltoFalante altoFalante;
    private MicroFone microFone;


    @Override
    public void tocar() {

        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {

        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica(String musica) {

        System.out.println("Musica selecionada: " + musica);
    }

    @Override
    public void exibirPagina(String url) {

        System.out.println("Página atual " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {

        System.out.println("Atualizando a página...");
    }

    @Override
    public void ligar(String numero) {

        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioDeVoz() {

        System.out.println("Iniciando correio de voz...");
    }
    
}
