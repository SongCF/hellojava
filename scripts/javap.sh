#!/usr/bin/env bash

# javap -c 类名   在编译好的classes目录执行，生成JVM字节码来分析你的代码。

if [[ ! -n "$1" ]] ;then
    echo "ERROR: miss class name!"
    echo "usage: bash javap.sh com.songcf.string.TString"
    exit 1
fi

BASEPATH=`dirname $0`/..

cd ${BASEPATH}/target/classes

javap -c $1

cd - > /dev/null
