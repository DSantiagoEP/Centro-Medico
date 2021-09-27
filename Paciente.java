
package informacion_pacientes;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class Paciente extends Informacion_Pacientes{
    
    String lugar_fue_atendido;
    String motivo_consulta;
    String medico_atendio;
    int fecha;
    
    public Paciente(String apell, String nomb, String sex, String resid, int cod,
            String lugAte, String motCon, String medAte, int fec){
        super (apell, nomb, sex, resid, cod);
        
        this.lugar_fue_atendido= lugAte;
        this.motivo_consulta= motCon;
        this.medico_atendio= medAte;
        this.fecha= fec;
       
    }
    @Override
    public void verDatos(){
        JOptionPane.showMessageDialog(null, "Nombre: "+ nombres + "\nApellidos: "+apellidos+ "\nSexo: "+ sexo+
                "\nResidencia: "+residencia+"\nCodigo: "+codigo+"\nLugar en que fue atendido: "+lugar_fue_atendido+
                "\nMotivo de la consulta: "+motivo_consulta+"\nMedico que lo atendio: "+medico_atendio+"\nFecha: "+
                fecha,"Datos del paciente",1);
        
    }
    
}
