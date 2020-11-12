package com.rg.flutterinit

import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.platform.PlatformViewRegistry
import io.flutter.view.TextureRegistry

class FlutterInitBinding {
    private val binding: FlutterPlugin.FlutterPluginBinding

    constructor(binding: FlutterPlugin.FlutterPluginBinding){
        this.binding = binding;
    }

    val binaryMessenger: BinaryMessenger
        get() = binding.binaryMessenger

    val textureRegistry: TextureRegistry
        get() = binding.textureRegistry

    val platformViewRegistry: PlatformViewRegistry
        get() = binding.platformViewRegistry

    val flutterAssets: FlutterAssets
        get() = binding.flutterAssets
}