package org.isomorf.foundation.runtime.natives.number

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object lessThan {

  @inline
  final def apply(x: natives.number.Number, y: natives.number.Number): natives.boolean.Boolean = {
    x < y
  }

}
