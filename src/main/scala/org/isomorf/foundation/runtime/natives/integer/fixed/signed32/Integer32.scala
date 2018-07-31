package org.isomorf.foundation.runtime.natives.integer.fixed.signed32

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.ConstantRepresentable
import org.isomorf.foundation.runtime.natives.ConstantValue

object Integer32 extends ConstantRepresentable[natives.integer.fixed.signed32.Integer32] {

  @inline
  override final def apply(value: ConstantValue): natives.integer.fixed.signed32.Integer32 = {
    value.toInt
  }

  @inline
  override final def unapply(i: natives.integer.fixed.signed32.Integer32): Option[ConstantValue] = {
    Option(i.toString)
  }

  @inline
  def apply(n: natives.natural.Natural): natives.integer.fixed.signed32.Integer32 = {
    n.toInt
  }
}
