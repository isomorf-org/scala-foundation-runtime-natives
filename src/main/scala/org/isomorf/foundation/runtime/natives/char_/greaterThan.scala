package org.isomorf.foundation.runtime.natives.char

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction

@RuntimeNativeFunction
object greaterThan {

  import scala.{ Boolean => _ }
  import scala.{ Char => _ }

  @inline
  final def apply(x: natives.char.Char, y: natives.char.Char): natives.boolean.Boolean = {
    x > y
  }
}
