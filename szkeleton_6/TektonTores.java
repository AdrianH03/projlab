package szkeleton_6;

import java.util.HashMap;
import java.util.Map;

public class TektonTores{
    Map<String, Runnable> functions = new HashMap<>();
    MultipleChoice mc;

    public TektonTores()
    {
        Runnable sikeresSorsolasA = this::sikeresSorsolasA;
        functions.put("Sikeres sorsolás, 16. kör előtt", sikeresSorsolasA);
        Runnable sikeresSorsolasB = this::sikeresSorsolasB;
        functions.put("Sikeres sorsolás, 16. kör után", sikeresSorsolasB);
        Runnable sikertelenSorsolasA = this::sikertelenSorsolasA;
        functions.put("Sikertelen sorsolás, 16. kör előtt", sikertelenSorsolasA);
        Runnable sikertelenSorsolasB = this::sikertelenSorsolasB;
        functions.put("Sikertelen sorsolás, 16. kör után", sikertelenSorsolasB);
        mc = new MultipleChoice("Forgatókönyv kimenetelei: ", functions);
    }

    public void run()
    {
        mc.run();
    }

    public void sikeresSorsolas()
    {
        System.out.println("Futás:");
        System.out.println("Program -> fung : Fungorium: frissités()");
        System.out.println("fung : Fungorium -> tr1 : Tektonrész: setTektonID(int)");
        for(int i = 2; i <= 4; i++)
        {
            System.out.println("fung : Fungorium -> tr"+i+" : Tektonrész: setTektonID(int)");
        }
        for(int i = 1; i <= 400; i++)
        {
            System.out.println("fung : Fungorium -> tr"+i+" : Tektonrész: entitásokVisszaadása(int)");
            System.out.println("fung : Fungorium <- tr"+i+" : entitások: List<Entitás>");
        }
    }

    public void sikeresSorsolasA()
    {
        sikeresSorsolas();
        System.out.println("Program <- fung : Fungorium: false");
    }

    public void sikeresSorsolasB()
    {
        sikeresSorsolas();
        System.out.println("Program <- fung : Fungorium: false");
    }

    public void sikertelenSorsolas()
    {
        System.out.println("Futás:");
        System.out.println("Program -> fung : Fungorium: frissités()");
    }

    public void sikertelenSorsolasA()
    {
        sikertelenSorsolas();
        System.out.println("Program <- fung : Fungorium: false");
    }

    public void sikertelenSorsolasB()
    {
        sikertelenSorsolas();
        System.out.println("Program <- fung : Fungorium: false");
    }
}
