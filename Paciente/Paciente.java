import javax.swing.JOptionPane;

public class Paciente{
    String nome;
    String rg;
    int anoNascimento;
    String profissao;
    int ano_atual;

public Paciente(){}

public Paciente(String n){
    this.nome = n;
    
}
public void cadastraDados(){
        if (this.nome == "Carlos"){


        }

        else{
        nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");

        }

        rg = JOptionPane.showInputDialog(null, "Digite seu RG com ponto e traço: ");
        profissao = JOptionPane.showInputDialog(null, "Digite sua profissão: ");
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de nascimento"));

        return ;  }
    


public void imprimeDados(){

    JOptionPane.showMessageDialog(null, "Nome: " + this.nome + "\nRG: " + rg + "\nAno de Nascimento: " + anoNascimento + "\nProfissão: " + profissao);

}


public int calculaIdade(int ano_atual) {

        if(ano_atual >= anoNascimento){
            return (ano_atual - anoNascimento);
        }       
        else{
            return (-1);
        }
    }
}