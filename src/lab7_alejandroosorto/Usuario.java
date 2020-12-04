package lab7_alejandroosorto;

/**
 *
 * @author Alejandro
 */
public class Usuario
{
    private String nombre;
    private String apellido;
    private String usuario;
    private String contraseña;
    private int notaFinal;

    public Usuario(String nombre, String apellido, String usuario, String contraseña, int notaFinal)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.notaFinal = notaFinal;
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
    
    
    
}
