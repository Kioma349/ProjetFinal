Exercice 2 - Question 2 :
La classe anonyme utilisée par printFiles peut être stockée dans un champ si elle est déclarée final. 
L'avantage de faire cela est d'éviter de créer une nouvelle instance 
de la classe anonyme à chaque appel de la méthode printFiles, 
ce qui peut améliorer les performances.

Exercice 2 - Question 3 :
On ne peut pas utiliser une classe anonyme pour réécrire totalSizeOfFiles, 
car une classe anonyme ne peut pas avoir de champ pour stock


Partie 3 :
1) Pour déterminer le nombre maximiun de voiture européennes avec la plaque d'immtriculation sous ce format : "AA 111 AA " , nous devons effectuer ce calcul:
- Les deux premieres lettres : 26 x 26
-  Les Trois chiffres : 10 x 10 x10
- Les deux derniéres lettres : 26 x 26

Totel : 26 x 26 x 10 x 10 x10 x 26 x26 = 456 976 000

2) public class EuropeanNumberPlate extends NumberPlate {
   // Prend en entrée une chaine de caractére
   public EuropeanNumberPlate(String plateNumber) {
   super(plateNumber);
   }

   @Override
   public boolean isValid() {
   // Vérifie que la plaque d'immatriculation est au format AA 111 AA
   return plateNumber.matches("^[A-Z]{2}\s\d{3}\s[A-Z]{2}$");
   }
   }


3)
- Dans la classe NumberPlate:  nous pouvons ajouter une méthode statique createNumberPlate qui prend en entrée une chaîne de caractères.
  -Dans la classe EuropeanNumberPlate, nous pouvons modifier la méthode isValid pour qu'elle accepte également le format de plaque d'immatriculation à l'ancienne norme (AA-111-AA)