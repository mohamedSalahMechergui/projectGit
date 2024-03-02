public class Skander {

    // Méthode pour calculer la somme d'un tableau d'entiers
    public static int calculerSomme(int[] tableau) {
        int somme = 0;
        for (int nombre : tableau) {
            somme += nombre;
        }
        return somme;
    }

    // Méthode pour calculer la moyenne d'un tableau d'entiers
    public static double calculerMoyenne(int[] tableau) {
        int somme = calculerSomme(tableau);
        return (double) somme / tableau.length;
    }

    public static double calculerMoyennes(int[] tableau) {
        int somme = calculerSomme(tableau);
        return (double) somme / tableau.length;
    }
}
