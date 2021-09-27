
package informacion_pacientes;

public class Informacion_Pacientes {
            
    
    int codigo;
    String apellidos, nombres, sexo, residencia;
    
    public Informacion_Pacientes (String apell, String nomb,
            String sex, String resid, int cod){
        
        this.apellidos= apell;
        this.nombres= nomb;
        this.sexo= sex;
        this.residencia= resid;
        this.codigo= cod;       
                       
    }
    
    public void verDatos(){
        
    }
     
}
