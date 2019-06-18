package com.example.examfinal;

import java.io.Serializable;

public class Usuario  implements Serializable {

    private String nombreUsu;
    private String edadUsu;
    private String correoUsu;
    private int foto;


    public Usuario(String nombreUsu, String edadUsu, String correoUsu) {
        this.nombreUsu = nombreUsu;
        this.edadUsu = edadUsu;
        this.correoUsu = correoUsu;
    }

    public Usuario() {
    }

    public String getNombreUsu() {
        return nombreUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public String getEdadUsu() {
        return edadUsu;
    }

    public void setEdadUsu(String edadUsu) {
        this.edadUsu = edadUsu;
    }

    public String getCorreoUsu() {
        return correoUsu;
    }

    public void setCorreoUsu(String correoUsu) {
        this.correoUsu = correoUsu;
    }
}
