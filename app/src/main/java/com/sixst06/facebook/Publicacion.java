package com.sixst06.facebook;

public class Publicacion {
    private String imgPerfil;
    private String Titulo;
    private String Hora;
    private String Comentario;
    private String imgFoto;
    private String btnMeGusta;
    private String btnComentar;
    private String btnCompartir;

    public Publicacion() {
    }

    public Publicacion(String imgPerfil, String titulo, String hora, String comentario, String imgFoto, String btnMeGusta, String btnComentar, String btnCompartir) {
        this.imgPerfil = imgPerfil;
        Titulo = titulo;
        Hora = hora;
        Comentario = comentario;
        this.imgFoto = imgFoto;
        this.btnMeGusta = btnMeGusta;
        this.btnComentar = btnComentar;
        this.btnCompartir = btnCompartir;
    }

    public String getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(String imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    public String getImgFoto() {
        return imgFoto;
    }

    public void setImgFoto(String imgFoto) {
        this.imgFoto = imgFoto;
    }

    public String getBtnMeGusta() {
        return btnMeGusta;
    }

    public void setBtnMeGusta(String btnMeGusta) {
        this.btnMeGusta = btnMeGusta;
    }

    public String getBtnComentar() {
        return btnComentar;
    }

    public void setBtnComentar(String btnComentar) {
        this.btnComentar = btnComentar;
    }

    public String getBtnCompartir() {
        return btnCompartir;
    }

    public void setBtnCompartir(String btnCompartir) {
        this.btnCompartir = btnCompartir;
    }
}
