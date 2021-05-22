SUMMARY = "Astertom image with qt5 packages"
HOMEPAGE = "http://astertom.pl"
LICENSE = "MIT"

require recipes-core/images/astertom-core-image.bb
inherit populate_sdk_qt5

QT_PKGS = " \
    qtbase \
    qtbase-plugins \
    qttranslations \
    qtdeclarative \
    qtdeclarative-plugins \
    qtdeclarative-qmlplugins \
    qtconnectivity \
    qtimageformats \
    qtmultimedia \
    qtmultimedia-plugins \
    qtscript \
    qtsensors \
    qtsensors-plugins \
    qtsvg \
    qtsvg-plugins \
    qtsystems \
    qtwebsockets \
    qtwebsockets-plugins \
    qtwebsockets-qmlplugins \
    qtwebchannel \
    qtxmlpatterns \
    qtserialbus \
    qtquickcontrols2 \
    qtquickcontrols \
    qtcharts \
    qtdatavis3d \
    qtknx \
    qtmqtt \
    quazip \
    qtserialport \
    qtremoteobjects \
    qtgamepad \
    qtnetworkauth \
    qtopcua \
    qtwebglplugin \
    qtscxml \
"

IMAGE_INSTALL += " \
    ${QT_PKGS} \ 
"