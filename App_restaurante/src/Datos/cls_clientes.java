package Datos;

public class cls_clientes {

    private String idStr;
    private String nombreStr;
    private String contactoStr;
    private String correoStr;
    private int estadoInt; // 0: inactivo - 1: Activo

    public cls_clientes(String id, String nom, String conta, String correo) {
        this.idStr = id;
        this.nombreStr = nom;
        this.contactoStr = conta;
        this.correoStr = correo;
        this.estadoInt = 0;
    }
    
    public int getEstado(){return this.estadoInt;}
    public void setEstado(int e){this.estadoInt = e;}

    public String getIdStr() {
        return idStr;
    }

    public String getNombreStr() {
        return nombreStr;
    }  

    public String getCorreoStr() {
        return correoStr;
    }

    public String getContactoStr() {
        return contactoStr;
    }
    
}

