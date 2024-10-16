#!/bin/bash

# Définir la version
VERSION=$(mvn help:evaluate -Dexpression=project.version -q -DforceStdout)

# Construire le projet
mvn clean package

# Construire l'image Docker
docker build -t doomthedocker/springkafkamockdata:latest .
docker tag doomthedocker/springkafkamockdata:latest doomthedocker/springkafkamockdata:$VERSION

# Pousser les images
docker push doomthedocker/springkafkamockdata:latest
docker push doomthedocker/springkafkamockdata:$VERSION

echo "Image poussée vers Docker Hub : doomthedocker/springkafkamockdata:$VERSION"