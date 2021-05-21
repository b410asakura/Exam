
import static java.lang.Math.pow;



public class Main {
    public static void main(String[] args) {
        Bible   bib = new Bible();
        Hudojestvenniy hud= new Hudojestvenniy();
        Yuridicheskiy yur = new Yuridicheskiy();
        Tehnicheskiy teh = new Tehnicheskiy();
        hud.dobavleniyeKnig();
        yur.dobavleniyeKnig();
        teh.dobavleniyeKnig();

        hud.vivodKnig();
        yur.vivodKnig();
        teh.vivodKnig();

        hud.vivodInfo();
        yur.vivodInfo();
        teh.vivodInfo();

        yur.poisk();

        yur.kolichestvoKnig();
        yur.vivodNameIKol();
    }
}
