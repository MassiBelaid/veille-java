package interfaceFonctionnelle;


@FunctionalInterface
public interface EtudiantInterfaceFonctionelle {

    //Interface avec une seule methode abstraite

    void donnerNom();

    default void methodAvecImplDefaut () {
        System.out.println("Methode avec comportement par defaut");
    }
}
