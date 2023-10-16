public class adn {

    // Vérifier si la chaîne est un ADN valide
    public static boolean estADN(String s) {
        return s.matches("[ACGT]+");
    }

    // Calculer la masse molaire
    public static int masseMolaire(String s) {
        return s.chars().map(c -> c == 'A' ? 135 : c == 'T' ? 126 : c == 'G' ? 151 : c == 'C' ? 111 : 0).sum();
    }

    // Obtenir le brin complémentaire
    public static String brinComp(String s) {
        return s.chars().mapToObj(c -> c == 'A' ? "T" : c == 'T' ? "A" : c == 'G' ? "C" : "G").collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
    }

    // Vérifier si une séquence est une sous-séquence d'une autre
    public static boolean sous_sequence(String s1, String s2) {
        return s2.contains(s1);
    }

    public static void main(String[] args) {
        System.out.println(estADN("TTGAC")); // true
        System.out.println(estADN("GCAATAG")); // true
        System.out.println(estADN("AMOG")); // false
        System.out.println(estADN("CaTg")); // false

        System.out.println(masseMolaire("AGATC")); // 658

        System.out.println(brinComp("A")); // T
        System.out.println(brinComp("AAGT")); // TTCA

        System.out.println(sous_sequence("ATC", "GGTATCG")); // true
        System.out.println(sous_sequence("GC", "AAT")); // false
    }
}
