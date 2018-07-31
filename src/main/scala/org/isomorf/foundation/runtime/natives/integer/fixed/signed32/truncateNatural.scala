package org.isomorf.foundation.runtime.natives.integer.fixed.signed32

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object truncateNatural {
  @inline
  final def apply(n: natives.natural.Natural): natives.integer.fixed.signed32.Integer32 = {
    natives.integer.fixed.signed32.Integer32(n)
  }
}
