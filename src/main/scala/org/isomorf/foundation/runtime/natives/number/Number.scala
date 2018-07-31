package org.isomorf.foundation.runtime.natives.number

import scala.util.Try

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.ConstantRepresentable
import org.isomorf.foundation.runtime.natives.ConstantValue

object Number extends ConstantRepresentable[natives.number.Number] {

  @inline
  final def apply(value: ConstantValue): natives.number.Number = {
    scala.math.BigDecimal(value)
  }

  @inline
  final def unapply(i: natives.number.Number): Option[ConstantValue] = {
    Option(i.toString)
  }

  @inline
  final def apply(s: natives.text.String): natives.option.Option[natives.number.Number] = {
    Try(scala.math.BigDecimal.exact(s.toArray)).toOption
  }
}
