package org.isomorf.foundation.runtime.natives.byte

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.ConstantRepresentable
import org.isomorf.foundation.runtime.natives.ConstantValue

object Byte extends ConstantRepresentable[natives.byte.Byte] {

  @inline
  final def apply(value: ConstantValue): natives.byte.Byte = {
    value.toByte
  }

  @inline
  final def unapply(b: natives.byte.Byte): Option[ConstantValue] = {
    Option(b.toString)
  }

}
