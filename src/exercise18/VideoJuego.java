package exercise18;

//Los métodos que se implementara serán:
//        Métodos get de todos los atributos, excepto de entregado.
//        Métodos set de todos los atributos, excepto de entregado.
//        Sobrescribe los métodos toString.


public class VideoJuego implements Entregable {
    private String titulo = "";
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero = "";
    private String compania = "";

    public VideoJuego() {
    }

    public VideoJuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public VideoJuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }


    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }


    @Override
    public boolean compareTo(Object a) {
        VideoJuego v = (VideoJuego) a;
        return this.horasEstimadas > v.horasEstimadas;
    }

}
