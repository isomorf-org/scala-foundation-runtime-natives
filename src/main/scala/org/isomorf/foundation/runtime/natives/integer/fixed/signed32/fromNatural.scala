package org.isomorf.foundation.runtime.natives.integer.fixed.signed32

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object fromNatural {
  @inline
  final def apply(n: natives.natural.Natural): natives.option.Option[natives.integer.fixed.signed32.Integer32] = {
    if (n.isValidInt) {
      Option(n.toInt)
    } else {
      None
    }
  }
}
