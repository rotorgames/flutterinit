package com.rg.flutterinit

import io.flutter.embedding.engine.plugins.FlutterPlugin

/** FlutterinitPlugin */
class FlutterinitPlugin: FlutterPlugin {
  override fun onAttachedToEngine(binding: FlutterPlugin.FlutterPluginBinding) {
    if(binding.applicationContext is FlutterInitRegister)
    {
      var register = binding.applicationContext as FlutterInitRegister

      register.setup(FlutterInitBinding(binding))
    }
  }

  override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) {
    // Ignored
  }
}
