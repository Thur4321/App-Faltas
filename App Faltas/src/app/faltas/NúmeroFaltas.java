
package app.faltas;

public class NúmeroFaltas {
    
    private int cargaHorária;
 
    private byte porcentagemFaltas;
    
    private String matéria;
    
    public byte getPorcentagemFaltas(){
        return porcentagemFaltas;
    }
    
    public void setPorcentagemFaltas(byte porcentagem){
        porcentagemFaltas=porcentagem;
    
     }
    
    public String getMatéria(){
        return matéria;
    }
    
    public void setMatéria(String nomeMatéria){
        matéria=nomeMatéria;
    
     }
    
    public int getCargaHorária(){
        return cargaHorária;
    }
    
     public void setCargaHorária(int quantidade){
        cargaHorária=quantidade;
        
    }
     
    public float faltas(){
        float faltas=cargaHorária * porcentagemFaltas/100;
        return faltas;
     
    }
   
}
    
   

