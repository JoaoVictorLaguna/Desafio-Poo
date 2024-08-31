public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        // Reprodutor Musical
        meuIphone.selecionarMusica("Lugar ao sol - Charlie Brown Jr");
        meuIphone.tocar();
        meuIphone.pausar();
        
        // Aparelho Telefônico
        meuIphone.ligar("55 31 9 9999 0000");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        // Navegador na Internet
        meuIphone.exibirPagina("https://www.google.com.br");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
