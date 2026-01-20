#!/usr/bin/env sh

##############################################################################
# Gradle start up script for UNIX
##############################################################################

DIR="$(cd "$(dirname "$0")" && pwd)"

GRADLE_WRAPPER="$DIR/gradle/wrapper/gradle-wrapper.jar"

if [ ! -f "$GRADLE_WRAPPER" ]; then
  echo "ERROR: gradle-wrapper.jar not found"
  exit 1
fi

JAVA_CMD="java"

exec "$JAVA_CMD" -classpath "$GRADLE_WRAPPER" org.gradle.wrapper.GradleWrapperMain "$@"
