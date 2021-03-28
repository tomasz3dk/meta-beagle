require linux-stable.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

KERNEL_CONFIG_COMMAND = "oe_runmake_call -C ${S} CC="${KERNEL_CC}" O=${B} olddefconfig"

COMPATIBLE_MACHINE = "beagle"

KERNEL_DEVICETREE_append = " \
    am335x-bone.dtb \
    am335x-boneblack.dtb \
    \
    beagle-chipsee.dtb \
"
IMAGE_BOOT_FILES_append = " \
    beagle-chipsee.dtb \
"
LINUX_VERSION = "5.10"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-stable-${LINUX_VERSION}:${THISDIR}/linux-stable-${LINUX_VERSION}/dts:"

S = "${WORKDIR}/git"

PV = "5.10.19"
SRCREV = "7b43ec8a0cc6fefdd63a1443edef0d2693ff99a2"
SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-${LINUX_VERSION}.y \
    file://defconfig \
    file://0002-dts-Remove-bbb-cape-i2c-definitions.patch \
    \
    file://bbb-1wire.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-dcan0.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-dcan1.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-i2c1.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-i2c2.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-spi0-spidev.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-spi1-spidev.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-uart1.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-uart2.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-uart4.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-uart5.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-chipsee-keypad.dtsi;subdir=git/arch/arm/boot/dts \
    \
    file://beagle-chipsee.dts;subdir=git/arch/arm/boot/dts \
"
