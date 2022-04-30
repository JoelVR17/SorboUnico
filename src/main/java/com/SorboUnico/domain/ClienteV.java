/*By:JoelVR*/
package com.SorboUnico.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="cliente")
public class ClienteV implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cliente")
    private Long idCliente;
    
    //SE ESTABLECEN LOS ATRIBUTOS
    private String nombre;
    private String apellido;
    private double comprado;
    private int cedula;
    
    //SE ESTABLECEN LOS CONTRUCTORES
    public ClienteV() {
        
    }

    public ClienteV(String nombre, String apellido, double comprado, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.comprado = comprado;
        this.cedula = cedula;
    }
    
}
