package org.isomorf.foundation.runtime.natives.natural

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeImplementation

@RuntimeImplementation
object equal {

  @inline
  final def apply(x: natives.natural.Natural, y: natives.natural.Natural): natives.boolean.Boolean = {
    x == y
  }

}
