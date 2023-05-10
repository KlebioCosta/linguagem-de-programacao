package propriedades;

import java.awt.*;

public class Apartamentos{
    private int andares;
    private Image foto;

    public Apartamentos(int andares, Image foto) {
        this.andares = andares;
        this.foto = foto;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }
}
