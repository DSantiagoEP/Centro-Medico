
package informacion_pacientes;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class Aplicacion {
    public static void main(String[] args) {
        String apell, nomb, sex, resid, lugAte, motCon, medAte;
        int cod;
        int fec;
        
        apell= JOptionPane.showInputDialog(null, "Introduce los apellidos del paciente: ","Solicitando datos",2);
        nomb= JOptionPane.showInputDialog(null, "Introduce el nombre del paciente: ","Solicitando datos",2);
        sex= JOptionPane.showInputDialog(null, "Introduce el sexo del paciente: ","Solicitando datos",2);
        resid= JOptionPane.showInputDialog(null, "Introduce la direccion de residencia del paciente: ","Solicitando datos",2);
        lugAte= JOptionPane.showInputDialog(null, "Introduce el lugar donde fue atendido el paciente: ","Solicitando datos",2);
        motCon= JOptionPane.showInputDialog(null, "Introduce el motivo de la consulta del paciente: ","Solicitando datos",2);
        medAte= JOptionPane.showInputDialog(null, "Introduce el nombre del medico que atendio al paciente: ","Solicitando datos",2);
        cod= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el nombre del paciente: ","Solicitando datos",2));
        fec= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el nombre del paciente: ","Solicitando datos",2));
        
        Paciente pac1= new Paciente(apell, nomb, sex, resid, cod, lugAte, motCon, medAte, fec);
        Paciente pac2= new Paciente(apell, nomb, sex, resid, cod, lugAte, motCon, medAte, fec);
        Paciente pac3= new Paciente(apell, nomb, sex, resid, cod, lugAte, motCon, medAte, fec);
        Paciente pac4= new Paciente(apell, nomb, sex, resid, cod, lugAte, motCon, medAte, fec);
        Paciente pac5= new Paciente(apell, nomb, sex, resid, cod, lugAte, motCon, medAte, fec);
        
        pac1.verDatos();
        pac2.verDatos();
        pac3.verDatos();
        pac4.verDatos();
        pac5.verDatos();
        
    }
    
}
