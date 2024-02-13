package com.spring.tutoriasEDU.seguridad;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.tutoriasEDU.Usuarios.UsuarioDAO;
import com.spring.tutoriasEDU.Usuarios.Usuarios;

@Service
public class UserDetailsServicesImpl implements UserDetailsService{

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<Usuarios> usuario = usuarioDAO.findById(username);

		if(usuario.isPresent()) {
			return (UserDetails)usuario.get();
		}
		throw new UsernameNotFoundException(username);
	}

}
