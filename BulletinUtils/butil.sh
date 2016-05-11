#!/bin/bash
JDK_HOME="/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home"
JAVA_BIN="$JDK_HOME/bin/java"
WORK_DIR=`pwd`
JAR_FILE="$WORK_DIR/target/BulletinUtils-1.0-SNAPSHOT.jar"
COMMAND_LINE="-h"
#echo $COMMAND_LINE
$JAVA_BIN -jar ${JAR_FILE} ${COMMAND_LINE}
