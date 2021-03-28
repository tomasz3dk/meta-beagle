FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://uEnv.txt;subdir=git/"

do_install_append() {
    install -d ${D}/boot
    install -Dm 0644 ${S}/uEnv.txt ${D}/boot/uEnv.txt
}
do_deploy_append() {
	install -Dm 0644 ${S}/uEnv.txt ${DEPLOYDIR}/uEnv.txt
}