package com.alura.literalura.model;

import jakarta.persistence.*;

@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    private String idioma;
    private Double numeroDeDescargas;

    @ManyToOne
    private Autor autor;

    public Libro() {}

    public Libro(DatosLibro d) {
        this.titulo = d.titulo();
        this.idioma = d.idiomas() != null && !d.idiomas().isEmpty() ? d.idiomas().get(0) : "N/A";
        this.numeroDeDescargas = d.numeroDeDescargas();
    }

    public void setAutor(Autor autor) { this.autor = autor; }

    @Override
    public String toString() {
        String nombreAutor = (autor != null) ? autor.getNombre() : "Desconocido";
        return "---------- LIBRO ----------\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + nombreAutor + "\n" +
                "Idioma: " + idioma + "\n" +
                "Descargas: " + numeroDeDescargas + "\n" +
                "---------------------------";
    }
}