package org.isomorf.foundation.runtime.natives.integer.fixed.signed64

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object and {

  @inline
  final def apply(x: natives.integer.fixed.signed64.Integer64, y: natives.integer.fixed.signed64.Integer64): natives.integer.fixed.signed64.Integer64 = {
    x & y
  }

}
