package org.isomorf.foundation.runtime.natives.integer.fixed.signed32

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeNativeFunction
import scala.util.Try

@RuntimeNativeFunction
object modulo {
  @inline
  final def apply(dividend: natives.integer.fixed.signed32.Integer32, divisor: natives.integer.fixed.signed32.Integer32): natives.option.Option[natives.integer.fixed.signed32.Integer32] = {
    Try(dividend % divisor).toOption
  }
}
