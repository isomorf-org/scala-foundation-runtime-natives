package org.isomorf.foundation.runtime.natives.char

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object lowerCase {

  import scala.{ Char => _ }

  @inline
  final def apply(c: natives.char.Char): natives.char.Char = {
    c.toLower
  }
}
