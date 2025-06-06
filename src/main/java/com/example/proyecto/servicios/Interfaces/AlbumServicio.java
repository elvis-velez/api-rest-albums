package com.example.proyecto.servicios.Interfaces;

import com.example.proyecto.entidades.Album;

import java.util.Optional;

public interface AlbumServicio {
    public abstract Optional<Album> buscarPorId(Long id);
    public abstract Iterable<Album> listar();
    public abstract Album crear (Album album);
    public abstract Album actualizar(Long id, Album album);
    public abstract Album eliminar(Long id);
}
