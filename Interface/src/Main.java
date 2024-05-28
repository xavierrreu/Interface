
import br.univille.log.Level;
import br.univille.log.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        LoggerFactory.onConsole().log(Level.DEBUG, "Mensagem de DEBUG!");
        LoggerFactory.onConsole().log(Level.WARNING, "Mensagem de WARNING!");
        LoggerFactory.onConsole().log(Level.ERROR, "Mensagem de ERROR!");

        LoggerFactory.onFile().log(Level.DEBUG, "Mensagem de DEBUG!");
        LoggerFactory.onFile().log(Level.WARNING, "Mensagem de WARNING!");
        LoggerFactory.onFile().log(Level.ERROR, "Mensagem de ERROR!");
    }
}
