/*By:Joel,Ale*/
package com.SorboUnico.domain;

/*SE IMPORTAN LAS LIBRERIAS*/
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")

public class Usuario implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    /*MySQL*/
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    //SE ESTABLECEN LOS ATRIBUTOS
    private long id_usuario;
    private String correo;
    private String contrasenna;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    
    //SE ESTABLECEN LOS CONSTRUCTORES
    public Usuario() {
        
    }
    
    public Usuario(long id_usuario, String correo, String contrasenna, String nombre, String primer_apellido, String segundo_apellido) {
        this.id_usuario = id_usuario;
        this.correo = correo;
        this.contrasenna = contrasenna;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
    }
}