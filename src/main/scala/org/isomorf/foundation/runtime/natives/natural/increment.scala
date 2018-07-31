package org.isomorf.foundation.runtime.natives.natural

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeImplementation

@RuntimeImplementation
object increment {

  @inline
  final def apply(n: natives.natural.Natural): natives.natural.Natural = {
    natives.natural.Natural.Successor(n)
  }

}
