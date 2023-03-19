import javax.swing.JOptionPane;

    public class Raiz {

    private int a;
    private int b;
    private int c;

    public Raiz(){}

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double calculaDelta(){
        return ((b*b) - 4*a*c);
    }

    public double calculaX1(){
       return (-(-b) + calculaDelta()) / (2 * a);
    }

    public double calculaX2(){
        return (-(-b) - calculaDelta()) / (2 * a);
    }
    
    public void solicitaDados(){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));
    }

    public String toString() {
        String texto = "\nDados Bhaskara";
        texto += "\nEquação: "+"\nEquação: \n" + a + "x² - " + b + "x + " + c + 
        "\nRaízes: \nX1: " + calculaX1() + "\nX2: " + calculaX2();
        return texto;
    }

    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Equação: \n" + this.a + "x² - " + this.b + "x + " + this.c + 
        "\nRaízes: \nX1: " + calculaX1() + "\nX2: " + calculaX2());
    }
}