package com.example.demo.controllers;

import java.net.URI;
import java.util.List;

import com.example.demo.entities.Usuario;
import com.example.demo.services.UsuariosServiceImpl;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class UsuariosController {
	
	private final UsuariosServiceImpl usuariosService;
	
	public UsuariosController(UsuariosServiceImpl usuariosService) {
		this.usuariosService = usuariosService;
	}
	
	@GET
	@Path("/usuarios")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> listarTodos(){
		return usuariosService.listarUsuarios();
	}
	
	@GET
	@Path("/usuarios/{nombre}")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario listarUno(@PathParam("nombre") String nombre) {
		return usuariosService.obtenerUsuario(nombre);
	}
	
	@POST
	@Path("/usuarios")
	@Produces(MediaType.APPLICATION_JSON)
	public Response crearUsuario(Usuario usuario) {
		usuariosService.crearUsuario(usuario);
		return Response.created(
				URI.create("/usuarios/" + usuario.nombreUsuario)
				).build();
	}
	
	@DELETE
	@Path("/usuarios/{nombre}")
	public Response borrarUsuario(@PathParam("nombre")String nombre) {
		usuariosService.borrarUsuario(nombre);
		return Response.ok().build();
	}
}
