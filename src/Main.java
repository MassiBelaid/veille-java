import interfaceFonctionnelle.EtudiantAvecNomIntFonc;
import interfaceFonctionnelle.EtudiantInterfaceFonctionelle;
import lambda.Lambda;

public class Main {

    public static void main(String[] args){
        new Lambda().exempleWithThread();

        EtudiantInterfaceFonctionelle etudiant = () -> {
            System.out.println("je suis un étudiant");
        };

        etudiant.donnerNom();

        EtudiantAvecNomIntFonc etudiantNom = (nom) -> {
            System.out.println("Etudiant avec nom " + nom);
        };
        etudiantNom.donnerNom("Massi");
    }
}
