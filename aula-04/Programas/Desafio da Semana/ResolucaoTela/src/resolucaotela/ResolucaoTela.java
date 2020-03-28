package resolucaotela;
import java.awt.Toolkit;
import java.awt.Dimension;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit kitInformacoes = Toolkit.getDefaultToolkit();
        Dimension resolucaoTela = kitInformacoes.getScreenSize();
        System.out.print("A resolução da sua tela é ");
        System.out.println(resolucaoTela.width + " x " + resolucaoTela.height);
    }
}
