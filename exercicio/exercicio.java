import javax.swing.JOptionPane;

public class exercicio {
    public static void main(String[] args) {
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro:"));
        if (num%2==0) {
            JOptionPane.showMessageDialog(null, "O numero: " + num + " é par.");
        }
    }
}