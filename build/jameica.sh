#!/bin/sh

# Linux Start-Script fuer regulaeren Standalone-Betrieb.
# Jameica wird hierbei mit GUI gestartet.

cd `dirname $0`

java -Xmx128m -Djava.library.path=lib/swt/linux -jar jameica-linux.jar $@
