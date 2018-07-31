package org.isomorf.foundation.runtime.natives.integer.fixed.signed32

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object coerceNatural {
  @inline
  final def apply(i: natives.integer.fixed.signed32.Integer32): natives.natural.Natural = {
    natives.natural.Natural(i)
  }
}
