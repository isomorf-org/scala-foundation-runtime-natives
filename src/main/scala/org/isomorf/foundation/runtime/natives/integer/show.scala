package org.isomorf.foundation.runtime.natives.integer

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object show {

  @inline
  final def apply(n: natives.integer.Integer): natives.text.String = {
    n.toString.toList
  }

}
