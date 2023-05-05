1. Le Cloud est comme un grand ordinateur sur Internet où tu peux stocker des choses et utiliser des programmes à distance, sans avoir besoin de les installer sur ton propre ordinateur.

2.  Les avantages de l'utilisation du Cloud sont nombreux tels que :
    -On peut accéder depuis n'importe quel appareil connecté à Internet, cela peut nous permettre de travailler plus facilement et de manière plus flexible.
    - Il est  moins coûteux pour les entreprises d'utiliser des services Cloud plutôt que d'acheter et de gérer leurs propres serveurs.

3. Le Network Address Translation (NAT) est une technique qui permet à plusieurs ordinateurs sur un réseau privé d'utiliser une seule adresse IP publique pour accéder à Internet.

4. Il y a trois types de NAT :

-    Le NAT statique :  signifie que chaque ordinateur privé est toujours associé à la même adresse IP publique. ( schéma disponible : Exemple NAT STATIQUE avec exemple )
-   Le NAT dynamique:  les adresses IP privées sont mappées au pool d'adresses IP publiques. ( schéma disponible  : exemple NAT DYNAMIQUE avec exemple )
-   Le NAT de surcharge ou PAT :  permet à plusieurs ordinateurs d'utiliser la même adresse IP publique en utilisant des ports différents. ( schéma disponible : Exemple NAT par PAT avec exemple   )

5. Amazon Web Services (AWS) est une plateforme de services Cloud proposée par Amazon afin d'enrichir l'environnement cloud  d'une entreprise . ( Calcul , base de donnée, stockage )

Exemples de service cloud :

-Amazon S3 : un service de stockage de données  .
-Amazon EC2: service de calcul en nuage pour exécuter et faire évoluer des applications .
- Amazon RDS:  service de base de données relationnelle.
-  Amazon DynamoDB : un service de base de données NoSQL géré.
- Amazon Athena : service d'analyse qui transforme nos données brutes en information exploitable


6. Lorsque Duncan demande à accéder à la série Rabbit Hole sur Paramount+ avec NAT par mécanisme PAT :

Explication : ( schéma disponible : Exemple NAT par PAT avec exemple   )
Duncan possède une adresse ip privée qui est : 192.168.1.2 ,   le trafic passe par le routeur NAT de sa maison.

Le routeur NAT convertit l'adresse IP privée de l'appareil de Duncan en une adresse IP publique en associant un numéro de port et ce dernier sera utilisé pour identifier l'appareil grâce a une table de  traduction :
192.168.1.2 -> 61.61.61.61:1110

Le serveur web recevra la requête par Duncan avec une adresse ip publique qui est de 61.61.61.61 et retourne une réponse au routeur et ensuite grâce a la table de traduction utilisé par le NAT (PAT) , la boxe pourra identifier a quelle machine appartient cette réponse ( paquet ip)