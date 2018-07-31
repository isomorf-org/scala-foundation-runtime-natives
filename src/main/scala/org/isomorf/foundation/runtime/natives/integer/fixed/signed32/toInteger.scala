package org.isomorf.foundation.runtime.natives.integer.fixed.signed32

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object toInteger {
  @inline
  final def apply(i: natives.integer.fixed.signed32.Integer32): natives.integer.Integer = {
    natives.integer.Integer(i)
  }
}
