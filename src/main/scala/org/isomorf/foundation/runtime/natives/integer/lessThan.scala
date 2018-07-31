package org.isomorf.foundation.runtime.natives.integer

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object lessThan {

  @inline
  final def apply(x: natives.integer.Integer, y: natives.integer.Integer): natives.boolean.Boolean = {
    x < y
  }

}
