
import 'dart:async';

import 'package:flutter/services.dart';

class Flutterinit {
  static const MethodChannel _channel =
      const MethodChannel('flutterinit');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
