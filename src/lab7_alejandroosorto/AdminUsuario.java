package lab7_alejandroosorto;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class AdminUsuario
{
    private ArrayList<Usuario> listaUsuarios = new ArrayList();
    private File archivo = null;
    
    public AdminUsuario(String path) 
    {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListaUsuarios()
    {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios)
    {
        this.listaUsuarios = listaUsuarios;
    }

    public File getArchivo()
    {
        return archivo;
    }

    public void setArchivo(File archivo)
    {
        this.archivo = archivo;
    }
    
    public void setUsuario(Usuario u)
    {
        listaUsuarios.add(u);
    }
    
    public void CargarArchivo()
    {
        try
        {
            listaUsuarios = new ArrayList();
            Usuario temp;
            if (archivo.exists())
            {
                FileInputStream leer = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(leer);
                
                try
                {
                    while ((temp = (Usuario) objeto.readObject()) != null)
                    {
                        listaUsuarios.add(temp);
                    }
                } 
                catch (EOFException e) {}
                
                objeto.close();
                leer.close();
            }
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void ModificarArchivo()
    {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try
        {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuario t : listaUsuarios)
            {
                bw.writeObject(t);
            }
            bw.flush();
        } 
        catch (Exception ex) {} 
        finally
        {
            try
            {
                bw.close();
                fw.close();
            } 
            catch (Exception e) {}
        }
    }
    
}
