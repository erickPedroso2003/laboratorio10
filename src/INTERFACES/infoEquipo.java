package INTERFACES;

import java.util.List;
import java.util.ArrayList;

public class infoEquipo {
    
    List<Camara> camarita=new ArrayList<>();
    List<navegadorDeInternet> internet=new ArrayList<>();
    List<reproductorDeMusica> musica=new ArrayList<>();
    
    public void agregarCamara(Camara cam)
    {
        camarita.add(cam);
    }
    public void agregarCamara(navegadorDeInternet inter)
    {
        internet.add(inter);
    }
    public void agregarCamara(reproductorDeMusica music)
    {
        musica.add(music);
    }
    
}
