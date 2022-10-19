import javax.swing.JOptionPane;

public class UsaCurso {
    public static void main(String[] args) {
        
        Curso c1,c2;

        
         c1 = new Curso();
        
         c1.cadastraCurso();
         c1.imprimeDados();

         JOptionPane.showMessageDialog(null, "O total da mensalidade e: " + c1.calculaTotalMensalidade());

         c2 = new Curso("ADS", 50, "4k", 400.5f);
         
         c2.imprimeDados();
         c2.calculaTotalMensalidade();
         JOptionPane.showMessageDialog(null, "O total da mensalidade e: " + c2.calculaTotalMensalidade());


        }
    }

         

