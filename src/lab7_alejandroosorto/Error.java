package lab7_alejandroosorto;

/**
 *
 * @author Alejandro
 */
public class Error
{
    private String codigoError;
    private String descripcion;

    public Error(String codigoError, String descripcion)
    {
        this.codigoError = codigoError;
        this.descripcion = descripcion;
    }

    public String getCodigoError()
    {
        return codigoError;
    }

    public void setCodigoError(String codigoError)
    {
        this.codigoError = codigoError;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString()
    {
        return codigoError + " " + descripcion;
    }
}
