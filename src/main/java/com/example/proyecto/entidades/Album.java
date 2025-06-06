package com.example.proyecto.entidades;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "albumes")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clave;


    @Column(name = "titulo_album", nullable = false, length = 100)
    private String titulo;

    @Column(name = "nombre_artista", nullable = false, length = 100)
    private String artista;

    @Column(name = "genero_musical", nullable = false, length = 50)
    private String genero;

    @Column(name = "anio_lanzamiento", nullable = false)
    private Integer anioLanzamiento;

    @Column(name = "num_canciones", nullable = false)
    private Integer numeroCanciones;

    @Column(name = "duracion_total_min", nullable = false)
    private Integer duracionTotalMin;

    @Column(name = "url_portada", nullable = true,
            insertable = false,
            columnDefinition = "VARCHAR(250) DEFAULT 'https://placehold.co/300x200.png'")
    private String portada;

    @Override
    public String toString() {
        return "Album{" +
                "clave=" + clave +
                ", titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", genero='" + genero + '\'' +
                ", anioLanzamiento=" + anioLanzamiento +
                ", numeroCanciones=" + numeroCanciones +
                ", duracionTotalMin=" + duracionTotalMin +
                ", portada='" + portada + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return clave == album.clave && Objects.equals(titulo, album.titulo) && Objects.equals(artista, album.artista) && Objects.equals(genero, album.genero) && Objects.equals(anioLanzamiento, album.anioLanzamiento) && Objects.equals(numeroCanciones, album.numeroCanciones) && Objects.equals(duracionTotalMin, album.duracionTotalMin) && Objects.equals(portada, album.portada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clave, titulo, artista, genero, anioLanzamiento, numeroCanciones, duracionTotalMin, portada);
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(Integer anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public Integer getNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(Integer numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }

    public Integer getDuracionTotalMin() {
        return duracionTotalMin;
    }

    public void setDuracionTotalMin(Integer duracionTotalMin) {
        this.duracionTotalMin = duracionTotalMin;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public Album() {
    }

    public Album(int clave, String titulo, String artista, String genero, Integer anioLanzamiento, Integer numeroCanciones, Integer duracionTotalMin, String portada) {
        this.clave = clave;
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.anioLanzamiento = anioLanzamiento;
        this.numeroCanciones = numeroCanciones;
        this.duracionTotalMin = duracionTotalMin;
        this.portada = portada;
    }

}
