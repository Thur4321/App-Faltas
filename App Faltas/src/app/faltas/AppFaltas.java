
package app.faltas;

import javax.swing.JOptionPane;

public class AppFaltas {

    public static void main(String[] args) {
        
        String matéria=JOptionPane.showInputDialog(null,"Informe o nome da matéria:","App Falta",3);
        
        int cargaHorária=Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a carga horária:", "App Falta",3));
        
        byte porcentagem=Byte.parseByte(JOptionPane.showInputDialog(null,"Informe o percentual de faltas:", "App Falta",3));
        
        NúmeroFaltas objMatéria = new NúmeroFaltas();
        
        objMatéria.setMatéria(matéria);
        objMatéria.setCargaHorária(cargaHorária);
        objMatéria.setPorcentagemFaltas(porcentagem);
        
        JOptionPane.showMessageDialog(null, "Matéria: "+objMatéria.getMatéria()+"\nFaltas possíveis: "+objMatéria.faltas(),"App Faltas",1);
    }
  
}
