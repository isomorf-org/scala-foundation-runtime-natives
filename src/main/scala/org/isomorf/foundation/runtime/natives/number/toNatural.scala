package org.isomorf.foundation.runtime.natives.number

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object toNatural {
  @inline
  final def apply(n: natives.number.Number): natives.option.Option[natives.natural.Natural] = {
    natives.natural.Natural(n)
  }
}
