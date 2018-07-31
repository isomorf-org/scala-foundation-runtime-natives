package org.isomorf.foundation.runtime.natives.number

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object subtract {

  @inline
  final def apply(x: natives.number.Number, y: natives.number.Number): natives.number.Number = {
    x - y
  }

}
