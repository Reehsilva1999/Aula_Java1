import javax.swing.JOptionPane;

public class maior {
    public static void main(String args[ ]) {
        int idade;
        idade = Integer.parseInt(
            JOptionPane.showInputDialog("Digite sua idade"));

        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Maior de idade");
        }
        else {
            JOptionPane.showMessageDialog(null, "Menor de idade");
        }
    }
}