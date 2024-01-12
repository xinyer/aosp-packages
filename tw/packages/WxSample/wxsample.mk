BOARD_SEPOLICY_DIRS +=\
	vendor/tw/packages/WxSample/sepolicy

PRODUCT_COPY_FILES += \
	vendor/tw/packages/WxSample/wxsample.rc:${TARGET_COPY_OUT_SYSTEM_EXT}/etc/init/wxsample.rc
