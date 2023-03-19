import javax.swing.JOptionPane;

public class Triangulo extends Ponto {
    
    public Triangulo(){   }
    
    public Triangulo(double l, double b) {
        setY(l);
        setX(b);
    }

    public double calculaArea() {
        return (getY() + getY()) / getX();
    }
    
    public double calculaPerimetro() {
        return getY() * 2 + getX();
    }

    @Override
    public void solicitaDados() {
        setX(Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triangulo")));
        setY(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triangulo")));
    }

    @Override
    public String toString() {
        String texto = super.toString();
        texto += "\nDados do Triângulo: " + "\nLado: " + getY() + "\nBase: " + getX() + "\nÁrea: "+calculaArea() + "\nPerímetro: " + calculaPerimetro();
        return texto;
    }

    @Override
    public void imprimeDados() {
        JOptionPane.showMessageDialog(null, "Area do Triangulo: " + calculaArea() + 
        "\nPerimetro do Triangulo: " + calculaPerimetro());  
    }
}
