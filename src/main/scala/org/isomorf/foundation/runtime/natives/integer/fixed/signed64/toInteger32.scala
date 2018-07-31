package org.isomorf.foundation.runtime.natives.integer.fixed.signed64

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object toInteger32 {

  @inline
  final def apply(i: natives.integer.fixed.signed64.Integer64): natives.integer.fixed.signed32.Integer32 = {
    i.toInt
  }

}
