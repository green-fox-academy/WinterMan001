package fák;

import org.w3c.dom.ls.LSOutput;

public class fák {
    public static void main(String[] Args) {

        milyenFák malusAngustifolia = new milyenFák();
        malusAngustifolia.age = 2;
        malusAngustifolia.leafColor = "Zöld";
        malusAngustifolia.sex = "egylaki";
        malusAngustifolia.törzs = "Magnoliophyta";


        milyenFák pinusSylvestris = new milyenFák();
        pinusSylvestris.age = 3;
        pinusSylvestris.leafColor = "Ezüst zöld";
        pinusSylvestris.sex = "egylaki";
        pinusSylvestris.törzs = "Toboztermők";


        milyenFák tomfa = new milyenFák();
        tomfa.age = 34;
        tomfa.sex = "kétlaki";
        tomfa.törzs = "lol";
        tomfa.leafColor = "Barna";


        milyenFák gingkoBiloba = new milyenFák();
        gingkoBiloba.leafColor = "kék";
        gingkoBiloba.törzs = "azthiszem";
        gingkoBiloba.sex = "Kétlaki";
        gingkoBiloba.age = 32;

        milyenFák randomFa = new milyenFák();
        randomFa.age = 23;
        randomFa.törzs = "Aristolochiales";
        randomFa.leafColor = "Nincs levele..";
        randomFa.sex = "++.";


        System.out.println(randomFa.sex);
    }


}
