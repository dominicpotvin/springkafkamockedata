# Nom du Projet

## Description

Ce projet est une application Spring Boot qui utilise Kafka pour envoyer et recevoir des messages. Les messages sont des objets `SensorData` qui sont sérialisés en JSON avant d'être envoyés à Kafka.

## Technologies Utilisées

- Java
- Spring Boot
- Apache Kafka
- Maven

## Configuration

Assurez-vous d'avoir Kafka en cours d'exécution sur votre machine. Vous pouvez modifier les paramètres de Kafka dans le fichier `application.yml`.

## Comment Exécuter le Projet

1. Clonez le dépôt : `git clone https://github.com/dominicpotvin/nom_du_projet.git`
2. Naviguez vers le répertoire du projet : `cd nom_du_projet`
3. Exécutez le projet avec Maven : `mvn spring-boot:run`

# l installation a partir du depo dockerhub
- helm-chart
- helm install springkafkamockdata ./springkafkamockdata -n default
- si mettre a jour le chart 
- helm upgrade springkafkamockdata ./springkafkamockdata -n default


## Comment Utiliser l'Application

L'application expose un endpoint POST à `/api/sensor/publish` qui accepte un objet `SensorData` en JSON. Lorsqu'une requête est envoyée à cet endpoint, l'objet `SensorData` est envoyé à un sujet Kafka.

## Contribution

Les contributions sont les bienvenues. Veuillez ouvrir une issue ou une pull request pour toute contribution.

## Licence

Ce projet est sous licence MIT. Voir le fichier `LICENSE` pour plus de détails.