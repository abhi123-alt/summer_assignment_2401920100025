package live;
import music.Playable;
import music.string.Veena;
import music.wind.Sexophone;
public class Test{
    public static void main(String[] args) {
        Veena veena = new Veena();
        veena.play();

        Sexophone sexophone = new Sexophone();
        sexophone.play();

        Playable p;
        p = veena;
        p.play();
        p = sexophone;
        p.play();
    }
}