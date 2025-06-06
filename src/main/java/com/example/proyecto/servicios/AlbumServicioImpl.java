package com.example.proyecto.servicios;

import com.example.proyecto.entidades.Album;
import com.example.proyecto.repositorios.AlbumRepositorio;
import com.example.proyecto.servicios.Interfaces.AlbumServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlbumServicioImpl implements AlbumServicio {
    @Autowired
    private AlbumRepositorio albumRepositorio;

    @Override
    public Optional<Album> buscarPorId(Long id) {
        return albumRepositorio.findById(id);
    }

    @Override
    public Iterable<Album> listar() {
        return albumRepositorio.findAll();
    }

    @Override
    public Album crear(Album album) {
        return albumRepositorio.save(album);
    }

    @Override
    public Album actualizar(Long id, Album album) {
        Optional<Album> albumActual = albumRepositorio.findById(id);
        if (albumActual.isPresent()) {
            Album albu = albumActual.get();
            albu.setTitulo(album.getTitulo());
            albu.setArtista(album.getArtista());
            albu.setGenero(album.getGenero());
            albu.setAnioLanzamiento(album.getAnioLanzamiento());
            albu.setNumeroCanciones(album.getNumeroCanciones());
            albu.setDuracionTotalMin(album.getDuracionTotalMin());
            albu.setPortada(album.getPortada());

            return albumRepositorio.save(albu);
        } else {
            return null;
        }
    }


    @Override
    public Album eliminar(Long id) {
        Optional<Album> tecladoActual = albumRepositorio.findById(id);
        if (tecladoActual.isPresent()) {
            albumRepositorio.deleteById(id);
            return tecladoActual.get();
        }else {
            return null;
        }
    }
}