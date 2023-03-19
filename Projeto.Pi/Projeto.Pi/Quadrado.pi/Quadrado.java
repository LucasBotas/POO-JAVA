import javax.swing.JOptionPane;

public class Quadrado extends Ponto {

    public Quadrado() {}

    public Quadrado(double l) {
        setX(l);
        setY(getX());
    }

    public double calculaArea() {
        return (getX()*getY());
    }

    public double calculaPerimetro() {
        return (getX()*4);
    }
    
    @Override
    public void solicitaDados() {
        setX(Double.parseDouble(JOptionPane.showInputDialog("Digite o lado do quadrado")));
        setY(getX());
    }

    @Override
    public String toString() {
        String texto = super.toString();
        texto += "\nDados do Quadrado: " + "\nLado: " + getX() + "\nÁrea: " + calculaArea() + "\nPerímetro: " + calculaPerimetro();
        return texto;
    }

    @Override
    public void imprimeDados() {
        JOptionPane.showMessageDialog(null, "Área do quadrado: " + calculaArea() +
        "\nPerimetro do quadrado: " + calculaPerimetro());
    }
}