import java.security.MessageDigest;

import javax.swing.JOptionPane;

public class Curso {
String nome;
int qtdeAlunos;
String turma;
float mensalidade;


public Curso(){

}

public Curso(String n, int q, String t, float m){

        this.nome = n;
        this.qtdeAlunos = q;
        this.turma = t;
        this.mensalidade = m;
      
}

public void cadastraCurso(){
    nome = JOptionPane.showInputDialog("Digite o nome do seu Curso: ");
    qtdeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Alunos: "));
    turma = JOptionPane.showInputDialog("Digite a turma do Aluno: ");
    mensalidade = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da mensalidade: "));

}


public void imprimeDados(){

    JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nQuantidade de Alunos: " + qtdeAlunos + "\nTurma: " + turma);
    
}

public float calculaTotalMensalidade (){
    if (this.qtdeAlunos > 0){
    
    return (this.mensalidade * this.qtdeAlunos) ;

    }   
    
    else{

    return  0;

}

}
}


