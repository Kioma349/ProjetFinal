L'annotation @Override est utilisée pour indiquer que la méthode qui suit écrase (override) une méthode de la classe parente.
Dans ce cas, nous écrasons la méthode toString() de la classe Object. 


La différence principale entre un tableau et une ArrayList est que les tableaux ont une taille fixe, 
tandis que les ArrayList sont redimensionnables. 

En ajoutant la méthode equals(Orange o) à la classe Orange, on a

Exo2a.java devrait produire le résultat suivant :

false
false
true
false
true
true

Exo2b.java devrait produire le résultat suivant :

0
1
-1
true

Pour utiliser l'annotation @Override pour vérifier, 
nous devons modifier la signature de la méthode equals() 
pour accepter un objet de type Object au lieu d'un objet de type Orange.