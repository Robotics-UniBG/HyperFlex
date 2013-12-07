all: installed


UNPACK_CMD  	= tar zxf
SOURCE_DIR 	= build/eclipse

SYSNAME = $(shell uname)
ARCHITECTURE = $(shell uname -m)

ifeq ($(SYSNAME),Linux)
	# Linux 
	ifeq ($(ARCHITECTURE),x86_64)
		#64 bit version
		TARBALL		= build/eclipse-modeling-kepler-SR1-linux-gtk-x86_64.tar.gz
		TARBALL_URL 	= http://mirror.switch.ch/eclipse/technology/epp/downloads/release/kepler/SR1/eclipse-modeling-kepler-SR1-linux-gtk-x86_64.tar.gz
		MD5SUM_FILE 	= eclipse-modeling-kepler-SR1-linux-gtk-x86_64.tar.gz.md5
	else
		#32 bit version
		TARBALL		= build/eclipse-modeling-kepler-SR1-linux-gtk.tar.gz
		TARBALL_URL 	= http://mirror.switch.ch/eclipse/technology/epp/downloads/release/kepler/SR1/eclipse-modeling-kepler-SR1-linux-gtk.tar.gz
		MD5SUM_FILE 	= eclipse-modeling-kepler-SR1-linux-gtk.tar.gz.md5
	endif
else ifeq ($(SYSNAME),Darwin)
	# Mac Os X 
	ifeq ($(ARCHITECTURE),x86_64)
		#64 bit version
		TARBALL		= build/eclipse-modeling-kepler-SR1-macosx-cocoa-x86_64.tar.gz
		TARBALL_URL 	= http://mirror.switch.ch/eclipse/technology/epp/downloads/release/kepler/SR1/eclipse-modeling-kepler-SR1-macosx-cocoa-x86_64.tar.gz
		MD5SUM_FILE 	= eclipse-modeling-kepler-SR1-macosx-cocoa-x86_64.tar.gz.md5
	else
		#32 bit version
		TARBALL		= build/eclipse-modeling-kepler-SR1-macosx-cocoa.tar.gz
		TARBALL_URL 	= http://mirror.switch.ch/eclipse/technology/epp/downloads/release/kepler/SR1/eclipse-modeling-kepler-SR1-macosx-cocoa.tar.gz
		MD5SUM_FILE 	= eclipse-modeling-kepler-SR1-macosx-cocoa.tar.gz.md5
	endif
endif

url 	= http://bride.cybernotic.org/eclipse_plugins_0.2.yaml
outputfile  	= eclipse_plugins.yaml


include ./download_unpack_build.mk

installed: $(SOURCE_DIR)/unpacked
	if test -d eclipse; then echo "Updating eclipse installation" && ./installer.py eclipse_plugins.yaml; else echo "Installing from scratch" && mv build/eclipse eclipse && ./installer.py eclipse_plugins.yaml; fi

update:
	./installer.py -u eclipse_plugins.yaml

clean:
	rm -rf $(SOURCE_DIR) $(TARBALL) build
