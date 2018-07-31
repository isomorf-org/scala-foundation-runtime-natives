package org.isomorf.foundation.runtime.natives.integer

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.ConstantRepresentable
import org.isomorf.foundation.runtime.natives.ConstantValue

object Integer extends ConstantRepresentable[natives.integer.Integer] {

  @inline
  final def apply(value: ConstantValue): natives.integer.Integer = {
    scala.math.BigInt(value)
  }

  @inline
  final def unapply(i: natives.integer.Integer): Option[ConstantValue] = {
    Option(i.toString)
  }

  @inline
  final def apply(i: natives.integer.fixed.signed32.Integer32): natives.integer.Integer = {
    scala.math.BigInt(i)
  }
}
