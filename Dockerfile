# Utilise une image de base Java avec JDK 17
FROM eclipse-temurin:17-jdk-alpine

# Crée un répertoire pour l'application
WORKDIR /app

# Copie le fichier JAR généré dans le conteneur
COPY target/springkafkamockdata-*.jar app.jar

# Expose le port de l'application
EXPOSE 8087

# Commande pour lancer l'application avec profil configurable
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=${SPRING_PROFILES_ACTIVE:kubernetes}"]