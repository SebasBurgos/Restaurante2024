
package Negocio;

import javax.swing.JOptionPane;

public class cls_validar_cliente {
    private boolean val =  false;
    private String msn;
    public void validarDatosEntradas(String id, String nom, String conta, String correo){
    if(id.equals("")|| nom.equals("")|| conta.equals("")|| correo.equals("")){
       this.msn = "Debes ingresar todos los datos";
        }else{
            this.val = true;
            this.msn = "El cliente\n" + nom + "\nHa sido registrado con exito";
    }
  }
   public String getMsn(){return this.msn;}
   public boolean getVal(){return this.val;}
    
}
