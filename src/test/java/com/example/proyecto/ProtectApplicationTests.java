package com.example.proyecto;

import com.example.proyecto.entidades.Album;
import com.example.proyecto.repositorios.AlbumRepositorio;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

@Disabled
@SpringBootTest
class ProtectApplicationTests {
	@Autowired
	private AlbumRepositorio albumRepositorio;

	@Test
	void contextLoads() {
	}

	@Test
	void insertarAlbum() {
		Album album = new Album(1,"Spiderland", "Slint", "Alternativa", 1991, 7, 55, null);
		albumRepositorio.save(album);
	}


	@Test
	void leerAlbumPorClave(){
		Long claveTmp = 1l;
		Album tmp = albumRepositorio.findAlbumByClave(claveTmp);
		System.out.println(tmp);
	}

	@Test
	public void eliminarAlbum(){
		Long claveTmp=2l;
		albumRepositorio.deleteById(claveTmp);

	}

	@Test
	public void actualizarAlbum(){
		Long claveTmp=4l;
		Album tmp = albumRepositorio.findAlbumByClave(claveTmp);
		tmp.setArtista("BCNR");
		albumRepositorio.save(tmp);
	}

}