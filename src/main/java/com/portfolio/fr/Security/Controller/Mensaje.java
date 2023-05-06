
package com.portfolio.fr.Security.Controller;


public class Mensaje {
    private String mensaje;
    
    //Constructor
    
    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    //GET AND SET

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
