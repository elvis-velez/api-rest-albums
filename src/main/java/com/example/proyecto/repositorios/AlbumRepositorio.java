package com.example.proyecto.repositorios;

import com.example.proyecto.entidades.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepositorio extends CrudRepository<Album, Long> {
    public Album findAlbumByClave(Long clave);
    public Album deleteByClave(Long clave);

}