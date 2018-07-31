package org.isomorf.foundation.runtime.natives.natural

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object subtract {

  @inline
  final def apply(x: natives.natural.Natural, y: natives.natural.Natural): natives.natural.Natural = {
    x - y
  }

}
