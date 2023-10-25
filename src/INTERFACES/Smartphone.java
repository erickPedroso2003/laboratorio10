package INTERFACES;
public class Smartphone implements Camara, navegadorDeInternet, reproductorDeMusica {
    
    private boolean camaraEncendida;
    private int zoom;
    private int hacerZoom;
    private boolean navegadorAbierto;
    private int nuevoVolumen;

    public Smartphone() {
        camaraEncendida = false;
        zoom = 1;

        navegadorAbierto = false;

    }
   
    public boolean isCamaraEncendida() {
        return camaraEncendida;
    }

    public void setCamaraEncendida(boolean camaraEncendida) {
        this.camaraEncendida = camaraEncendida;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public int getHacerZoom() {
        return hacerZoom;
    }

    public void setHacerZoom(int hacerZoom) {
        this.hacerZoom = hacerZoom;
    }

    public boolean isNavegadorAbierto() {
        return navegadorAbierto;
    }

    public void setNavegadorAbierto(boolean navegadorAbierto) {
        this.navegadorAbierto = navegadorAbierto;
    }

    public int getNuevoVolumen() {
        return nuevoVolumen;
    }

    public void setNuevoVolumen(int nuevoVolumen) {
        this.nuevoVolumen = nuevoVolumen;
    }

    // Métodos de la interfaz Camara
    @Override
    public void encenderCamara() {
        camaraEncendida = true;
        System.out.println("Cámara encendida.");
    }

    @Override
    public void apagarCamara() {
        camaraEncendida = false;
        System.out.println("Cámara apagada.");
    }

    @Override
    public void hacerZoom() {
        if (camaraEncendida) {
            zoom += hacerZoom;
            System.out.println("Zoom: " + zoom);
        } else {
            System.out.println("La cámara no está encendida.");
        }
    }

    // Métodos de la interfaz NavegadorDeInternet
    @Override
    public void abrirNavegador() {
        navegadorAbierto = true;
        System.out.println("Navegador web abierto.");
    }

    @Override
    public void cerrarNavegador() {
        navegadorAbierto = false;
        System.out.println("Navegador web cerrado.");
    }

    @Override
    public void activarModoIncognito() {
        if (navegadorAbierto) {
            System.out.println("Modo incógnito activado.");
        } else {
            System.out.println("El navegador no está abierto.");
        }
    }

    // Métodos de la interfaz ReproductorDeMusica
    @Override
    public void reproducirMusica() {
        System.out.println("Reproduciendo música...");
    }

    @Override
    public void detenerReproduccion() {
        System.out.println("Deteniendo la reproducción de música.");
    }

    @Override
        public void ajustarVolumen() {
        
        if (nuevoVolumen >= 0 && nuevoVolumen <= 100) {
            System.out.println("Volumen ajustado a " + nuevoVolumen + "%.");
        } else {
            System.out.println("El volumen debe estar en el rango de 0 a 100.");
        }
    }
    
}
