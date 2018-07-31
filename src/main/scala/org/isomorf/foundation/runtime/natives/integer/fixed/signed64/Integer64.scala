package org.isomorf.foundation.runtime.natives.integer.fixed.signed64

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.ConstantRepresentable
import org.isomorf.foundation.runtime.natives.ConstantValue

object Integer64 extends ConstantRepresentable[natives.integer.fixed.signed64.Integer64] {

  @inline
  final def apply(value: ConstantValue): natives.integer.fixed.signed64.Integer64 = {
    value.toLong
  }

  @inline
  final def unapply(i: natives.integer.fixed.signed64.Integer64): Option[ConstantValue] = {
    Option(i.toString)
  }

}
