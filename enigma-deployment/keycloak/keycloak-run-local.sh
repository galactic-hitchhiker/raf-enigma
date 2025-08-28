#!/usr/bin/env bash

docker run -p 12080:8080 -p 12443:8443 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin -e KEYCLOAK_IMPORT=/enigma-realm.json enigma/keycloak:10.0.0