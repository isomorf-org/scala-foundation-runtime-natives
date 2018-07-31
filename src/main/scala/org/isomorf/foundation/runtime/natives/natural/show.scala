package org.isomorf.foundation.runtime.natives.natural

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object show {

  @inline
  final def apply(n: natives.natural.Natural): natives.text.String = {
    n.toString.toList
  }

}
