package com.rg.flutterinit

import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.platform.PlatformViewRegistry
import io.flutter.view.TextureRegistry

public interface FlutterInitRegister {
    fun setup(binding: FlutterInitBinding)
}