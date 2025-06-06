package com.example.proyecto.controladores;

import com.example.proyecto.entidades.Album;
import com.example.proyecto.servicios.Interfaces.AlbumServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/albums")
public class AlbumRestController {
    @Autowired
    private AlbumServicio albumServicio;

    @GetMapping("/")
    public ResponseEntity<Iterable<Album>> getAlbum(){
        //return albumServicio.listar();
        return new ResponseEntity<>(albumServicio.listar(), HttpStatus.OK);
    }

    @GetMapping("/{clave}")
    public ResponseEntity<Album> getAlbumPorClave(@PathVariable Long clave){
        //return albumServicio.buscarPorId(clave).orElse(null);
        //return new ResponseEntity<>(albumServicio.
        //buscarPorId(clave).orElse(null), HttpStatus. OK);

        Optional<Album> tmp = albumServicio.buscarPorId(clave);
        if (tmp.isPresent()){
            return new ResponseEntity<>(tmp.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Album>
    createAlbum(@RequestBody Album album) {
        return new
                ResponseEntity<>(albumServicio.crear(album), HttpStatus.CREATED);
    }

    @PostMapping("/{id}")
    public ResponseEntity<String> noExiste(){
        return new ResponseEntity<>("End Point no soportado", HttpStatus.NOT_FOUND);
    }

    @PatchMapping("/{clave}")
    public ResponseEntity<Album>
    actualizaParcial(@PathVariable Long clave, @RequestBody Album album){
        Album tmp = albumServicio.buscarPorId(clave).orElse(null);
        if (tmp != null){
            if(album.getTitulo() != null) tmp.setTitulo(album.getTitulo());
            if(album.getArtista() != null) tmp.setArtista(album.getArtista());
            if(album.getGenero() != null) tmp.setGenero(album.getGenero());
            if(album.getAnioLanzamiento() != null) tmp.setAnioLanzamiento(album.getAnioLanzamiento());
            if(album.getNumeroCanciones() != null) tmp.setNumeroCanciones(album.getNumeroCanciones());
            if(album.getDuracionTotalMin() != null) tmp.setDuracionTotalMin(album.getDuracionTotalMin());
            if(album.getPortada() != null) tmp.setPortada(album.getPortada());
            return new ResponseEntity<>(albumServicio.actualizar(clave, tmp), HttpStatus.OK);
            //if else
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{clave}")
    public ResponseEntity<Album> editar(@PathVariable Long clave,
                                        @RequestBody Album album) {

        Optional<Album> tmp = albumServicio.buscarPorId(clave);

        if (tmp.isPresent()) {
            Album actualizado = albumServicio.actualizar(clave, album);
            return new ResponseEntity<>(actualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{clave}")
    public ResponseEntity<Album> eliminar(@PathVariable Long clave) {
        Album tmp =albumServicio.eliminar(clave);
        if (tmp != null){
            return new ResponseEntity<>(tmp, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
