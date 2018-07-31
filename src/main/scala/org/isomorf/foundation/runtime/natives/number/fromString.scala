package org.isomorf.foundation.runtime.natives.number

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object fromString {
  @inline
  final def apply(s: natives.text.String): natives.option.Option[natives.number.Number] = {
    natives.number.Number(s)
  }
}
