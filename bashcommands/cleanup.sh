#!/bin/bash

# Garder les X dernières versions
KEEP_LAST=3

# Nom de l'image
IMAGE_NAME="doomthedocker/springkafkamockdata"

# Lister toutes les images triées par date de création
images=$(docker images $IMAGE_NAME --format "{{.ID}} {{.Tag}}" | sort -k2 -r)

# Compter le nombre d'images
count=$(echo "$images" | wc -l)

# Supprimer les images anciennes
if [ $count -gt $KEEP_LAST ]; then
  echo "$images" | tail -n +$((KEEP_LAST + 1)) | while read id tag; do
    echo "Suppression de $IMAGE_NAME:$tag"
    docker rmi $id
  done
fi