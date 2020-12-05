package lab7_alejandroosorto;

import java.io.Serializable;

/**
 *
 * @author Alejandro
 */
public class Compilador implements Serializable
{
    private String nombre;
    private String nombreCreador;
    private int numLineas;
    //Etapa de Analisis
    private int lineasAL;
    private int lineasAS;
    private int lineasASe;
    //Etapa de Sintesis
    private int lineasGCI;
    private int lineasOC;
    private int lineasGC;
    
    private static final long SerialVersionUID = 500L;

    public Compilador(String nombre, String nombreCreador, int numLineas)
    {
        this.nombre = nombre;
        this.nombreCreador = nombreCreador;
        this.numLineas = numLineas;
    }
    
    
}
