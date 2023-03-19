import javax.swing.JOptionPane;

public class Cone extends Ponto{
    double geratriz;

    public Cone() {}

    public Cone (double r, double a, double g) {
        setX(r);
        setY(a);
        this.geratriz = g;    
    }

    public double calculaArea() {
        return (3.14*getX()*(getX()+geratriz));              
    }

    public double calculaVolume() {     
        double area = calculaArea();
        return (3.14*((getX()*getX())*area))/3;
    }
    
    @Override
    public void solicitaDados() {
        setY(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do cone")));
        setX(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do cone")));
        geratriz = Double.parseDouble(JOptionPane.showInputDialog("Digite a geratriz do cone"));
    }
    
    @Override
    public String toString() {
        String texto = super.toString();
        texto += "\nDados do Cone: " + "\nRaio: "+ getX() + "\nAltura: " + getY() + "\nGeratriz: " + this.geratriz + "\nÁrea: " + calculaArea() + "\nVolume: " + calculaVolume();
        return texto;
    }
    
    @Override
    public void imprimeDados() {
        JOptionPane.showMessageDialog(null,"Area do cone: " + calculaArea() + "\nVolume do cone: " + calculaVolume());
    }
}