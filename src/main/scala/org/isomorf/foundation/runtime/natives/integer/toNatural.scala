package org.isomorf.foundation.runtime.natives.integer

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object toNatural {

  @inline
  final def apply(i: natives.integer.Integer): natives.natural.Natural = {
    i
  }

}
