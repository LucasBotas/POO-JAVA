import javax.swing.JOptionPane;

public class Cilindro extends Ponto{
        
    public Cilindro(){}
        
    public Cilindro(double al, double r){
        setY(al);
        setX(r);
    }

    public double calculaArea() {
        return (2*3.14*getX())*(getX()*getY());
    }

    public double calculaVolume() {
        return 3.14*(getX()*getX())*getY();
    }
        
    @Override
    public void solicitaDados() {
        setX(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do cilindro")));
        setY(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do cilindro")));
    }

    @Override
    public String toString() {
        String texto = super.toString();
        texto += "\nDados do Cilindro: " + "\nRaio: "+ getX() + "\nAltura: " + getY() + "\nÁrea: " + calculaArea() + "\nVolume: " + calculaVolume();
        return texto;
    }

    @Override
    public void imprimeDados(){
       JOptionPane.showMessageDialog(null, "Área do Cilindro " + calculaArea() + "cm2" + 
        "\nVolume do Cilindro: " + calculaVolume() + "cm3");
    } 
}
