package org.isomorf.foundation.runtime.natives.integer.fixed.signed32

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object toNatural {
  @inline
  final def apply(i: Integer32): natives.option.Option[natives.natural.Natural] = {
    if (i >= 0) {
      Option(natives.natural.Natural(i))
    } else {
      None
    }
  }
}
