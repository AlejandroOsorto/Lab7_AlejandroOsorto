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

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombreCreador()
    {
        return nombreCreador;
    }

    public void setNombreCreador(String nombreCreador)
    {
        this.nombreCreador = nombreCreador;
    }

    public int getNumLineas()
    {
        return numLineas;
    }

    public void setNumLineas(int numLineas)
    {
        this.numLineas = numLineas;
    }

    public int getLineasAL()
    {
        return lineasAL;
    }

    public void setLineasAL(int lineasAL)
    {
        this.lineasAL = lineasAL;
    }

    public int getLineasAS()
    {
        return lineasAS;
    }

    public void setLineasAS(int lineasAS)
    {
        this.lineasAS = lineasAS;
    }

    public int getLineasASe()
    {
        return lineasASe;
    }

    public void setLineasASe(int lineasASe)
    {
        this.lineasASe = lineasASe;
    }

    public int getLineasGCI()
    {
        return lineasGCI;
    }

    public void setLineasGCI(int lineasGCI)
    {
        this.lineasGCI = lineasGCI;
    }

    public int getLineasOC()
    {
        return lineasOC;
    }

    public void setLineasOC(int lineasOC)
    {
        this.lineasOC = lineasOC;
    }

    public int getLineasGC()
    {
        return lineasGC;
    }

    public void setLineasGC(int lineasGC)
    {
        this.lineasGC = lineasGC;
    }
    
    
}
