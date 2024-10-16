# SpringKafkaMockData

## Description

Ce projet est une application Spring Boot qui utilise Kafka pour générer et envoyer des données de capteurs simulées. Les messages sont des objets `SensorData` sérialisés en JSON avant d'être envoyés à Kafka.

## Technologies Utilisées

- Java 17
- Spring Boot
- Apache Kafka
- Maven
- Docker
- Kubernetes
- Helm

## Image Docker
L'image Docker de ce projet est disponible sur Docker Hub :
   ```bash
  doomthedocker/springkafkamockdata
   ```

## Pour récupérer l'image :
   ```bash
  docker pull doomthedocker/springkafkamockdata:latest
   ```
docker pull doomthedocker/springkafkamockdata:latest
## Configuration

L'application utilise des profils Spring pour gérer différents environnements :

- `local` : pour le développement local
- `kubernetes` : pour le déploiement dans un cluster Kubernetes

### Configuration Locale

Assurez-vous d'avoir Kafka en cours d'exécution sur votre machine. Les paramètres de connexion par défaut sont configurés dans `application-local.yml`.

### Configuration Kubernetes

Les paramètres pour l'environnement Kubernetes sont configurés dans `application-kubernetes.yml`.

## Comment Exécuter le Projet

### Localement

1. Clonez le dépôt : `git clone https://github.com/dominicpotvin/springkafkamockdata.git`
2. Naviguez vers le répertoire du projet : `cd springkafkamockdata`
3. Exécutez le projet avec Maven : `mvn spring-boot:run -Dspring-boot.run.profiles=local`

### Dans Docker

1. Construisez l'image Docker : `docker build -t springkafkamockdata:latest .`
2. Exécutez le conteneur : `docker run -p 8087:8087 -e SPRING_PROFILES_ACTIVE=local springkafkamockdata:latest`

### Dans Kubernetes avec Helm

1. Assurez-vous que le namespace "develop" existe :
   ```
   kubectl create namespace develop
   ```

2. Naviguez vers le répertoire du chart Helm : `cd helm-chart`

3. Installez le chart :
   ```
   helm install springkafkamockdata ./springkafkamockdata -n develop
   ```

4. Pour mettre à jour le chart :
   ```
   helm upgrade springkafkamockdata ./springkafkamockdata -n develop
   ```

## Vérification du Déploiement

Pour vérifier que l'application est correctement déployée dans le namespace "develop" :

```bash
kubectl get pods -n develop
kubectl get services -n develop
```

## Accès à l'Application

L'application expose un endpoint pour la génération et l'envoi de données de capteurs simulées. Dans un environnement de production, ce processus serait généralement automatisé ou déclenché par un événement spécifique.

## Surveillance et Logs

Pour surveiller les logs de l'application dans Kubernetes :

```bash
kubectl logs -f <nom-du-pod> -n develop
```

## Contribution

Les contributions sont les bienvenues. Veuillez ouvrir une issue ou une pull request pour toute contribution.

## Licence

Ce projet est sous licence MIT. Voir le fichier `LICENSE` pour plus de détails.