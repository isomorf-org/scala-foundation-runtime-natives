package org.isomorf.foundation.runtime.natives.integer

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object multiply {

  @inline
  final def apply(x: natives.integer.Integer, y: natives.integer.Integer): natives.integer.Integer = {
    x * y
  }

}
