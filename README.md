# java-cli-sbt-forked-mongo-templ-generics-JAdventure

## Description
A POC for REST web service using mongodb.
Creates a user with credentials.

So modification were made to the JSON
files so as to make them mongo compliant.
`db/init/*.json`. There is a feature in mongodb
to auto load JSON files, but to create the
entities we elected to use a built-in import
function. As a result of the import option, we
put each entity in its own collection.

The web service is RESTful so we follow the
basic Controller->Service->Repository->Model
pattern. Using generics we can reduce the code
needed by Service and Repository layers.

## Tech stack
- java
- sbt
  - mongo connector
- mongo

## Docker stack
- mongodb:latest
- hseeberger/scala-sbt:11.0.2-oraclelinux7_1.3.5_2.12.10

## To run
`sudo ./install.sh -u`
- Endpoints
  - localhost/weapons/
  - localhost/weapons/name/shiv
  - localhost/armors/
  - localhost/armors/name/wooden%20shield
  - localhost/foods/
  - localhost/foods/name/bread
  - localhost/tools/
  - localhost/tools/name/lock%20and%20pick
  - localhost/postions/
  - localhost/postions/name/milk
  - localhost/locations/
  - localhost/locations/coor/5,2,-1

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [Data from JAdventure text game](https://github.com/Progether/JAdventure.git)
- [Code concept](https://github.com/ragcrix/StudentInformationSystem.git)
