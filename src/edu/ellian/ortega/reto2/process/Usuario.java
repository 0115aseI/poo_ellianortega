package edu.ellian.ortega.reto2.process;

public class Usuario {

    private String usuario = "jose";
    private String contraseña = "1234";

    public Usuario() {

    }

    public String Saludo() {
        return "Hola " + getUsuario();
    }

    public boolean autenticar(String usuario, String contraseña) {
        return this.usuario.equals(usuario) && this.contraseña.equals(contraseña);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}