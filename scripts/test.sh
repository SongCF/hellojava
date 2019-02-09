#!/usr/bin/env bash


BASEPATH=`dirname $0`/..

if [[ "$1" == "package" ]] ;then
    mvn package
fi
java -jar ${BASEPATH}/target/main-1.0-SNAPSHOT.jar