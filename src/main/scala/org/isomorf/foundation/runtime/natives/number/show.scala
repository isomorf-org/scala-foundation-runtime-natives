package org.isomorf.foundation.runtime.natives.number

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object show {

  @inline
  final def apply(n: natives.number.Number): natives.text.String = {
    n.toString.toList
  }

}
