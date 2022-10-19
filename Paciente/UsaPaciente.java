import javax.swing.JOptionPane;

public class UsaPaciente {
    public static void main(String[] args) {
        Paciente p1, p2;

        p1 = new Paciente();
        p1.cadastraDados();
        p1.calculaIdade(2022);
        p1.imprimeDados();
        JOptionPane.showMessageDialog(null, "Sua idade é: " + p1.calculaIdade(2022));

        p2 = new Paciente("Carlos");
        p2.cadastraDados();
        p2.imprimeDados();
        p2.calculaIdade(2022);
        JOptionPane.showMessageDialog(null, "Sua idade é: " + p2.calculaIdade(2022));

    }
       
}
