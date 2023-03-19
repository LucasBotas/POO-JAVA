import javax.swing.JOptionPane;

public class Paralelepipedo extends Ponto{

    private double comprimento;

    public Paralelepipedo(){}

     public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double calculaArea(){
        return 2 * (getX() * comprimento + getX() * getY() + comprimento * getY());
    }

    public double calculaVolume(){
        return (comprimento * getX() * getY());
    }
    
    @Override
    public void solicitaDados(){
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do paralelepipedo"));
        setY(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do paralelepipedo")));
        setX(Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do paralelepipedo")));
    }

    @Override
    public String toString() {
        String texto = super.toString();
        texto += "\nDados do Paralelpípedo: " + "\nComprimento: " + this.comprimento + "\nAltura: " + getY() + "\nLargura: "+ getX() + 
        "\nÁrea: " + calculaArea() + "\nVolume: " + calculaVolume();
        return texto;
    }

    @Override
    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Área do paralelepípedo: " + calculaArea() + 
        "\nVolume do paralelepípedo: " + calculaVolume());
    }
}
