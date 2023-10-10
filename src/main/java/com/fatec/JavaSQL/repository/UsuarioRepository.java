package com.fatec.JavaSQL.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fatec.JavaSQL.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}