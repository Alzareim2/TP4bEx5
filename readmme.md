# Exercice ADN

Exercice 5 du TP4b, nous explorons les chaînes de caractères représentant des séquences d'ADN. Chaque séquence est composée des bases 'A', 'C', 'G', et 'T'. 

## Fonction `estADN(String s)`

### Description
Cette fonction détermine si une chaîne de caractères est une séquence ADN valide.

### Implémentation
Nous utilisons la méthode [`matches`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#matches(java.lang.String)) de la classe `String` pour vérifier si la chaîne `s` correspond au motif `[ACGT]+`. Ce motif signifie que la chaîne peut contenir un ou plusieurs des caractères 'A', 'C', 'G', ou 'T'.

### Exemple
Pour la chaîne `"TTGAC"`, la fonction renvoie `true` car elle ne contient que des bases valides.

## Fonction `masseMolaire(String s)`

### Description
Cette fonction calcule la masse molaire totale d'une séquence ADN.

### Implémentation
Nous utilisons la méthode [`chars`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#chars()) pour obtenir un flux des caractères de la chaîne `s`. Ensuite, avec la méthode [`map`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function)), nous convertissons chaque base à sa masse molaire respective. La somme totale est calculée avec la méthode [`sum`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/IntStream.html#sum()).

### Exemple
Pour la chaîne `"AGATC"`, la fonction renvoie `658`, car la masse molaire totale est (135 + 151 + 135 + 126 + 111) g/mol.

## Fonction `brinComp(String s)`

### Description
Cette fonction détermine le brin complémentaire d'une séquence d'ADN.

### Implémentation
Encore une fois, nous utilisons la méthode `chars` pour obtenir un flux des caractères. Chaque base est remplacée par sa base complémentaire à l'aide de la méthode [`mapToObj`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/IntStream.html#mapToObj(java.util.function.IntFunction)). Les résultats sont assemblés dans un `StringBuilder` et convertis en chaîne avec `toString`.

### Exemple
Pour la chaîne `"AAGT"`, la fonction renvoie `"TTCA"` car 'A' est complémentaire de 'T' et 'G' est complémentaire de 'C'.

---

N'hésitez pas à consulter la documentation Java officielle pour plus de détails