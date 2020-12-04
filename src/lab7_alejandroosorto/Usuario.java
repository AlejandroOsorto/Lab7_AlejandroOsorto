package lab7_alejandroosorto;

import java.io.Serializable;

/**
 *
 * @author Alejandro
 */
public class Usuario implements Serializable
{
    private String nombre;
    private String apellido;
    private String usuario;
    private String contraseña;
    private int notaFinal;
    

    private static final long SerialVersionUID = 889L;
    
    public Usuario(String nombre, String apellido, String usuario, String contraseña)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getUsuario()
    {
        return usuario;
    }

    public void setUsuario(String usuario)
    {
        this.usuario = usuario;
    }

    public String getContraseña()
    {
        return contraseña;
    }

    public void setContraseña(String contraseña)
    {
        this.contraseña = contraseña;
    }

    public int getNotaFinal()
    {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal)
    {
        this.notaFinal = notaFinal;
    }
    
    
    @Override
    public String toString()
    {
        return nombre + " " + apellido + "; "+ usuario;
    }
}
