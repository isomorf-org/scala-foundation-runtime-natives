package org.isomorf.foundation.runtime.natives.natural

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.ConstantRepresentable
import org.isomorf.foundation.runtime.natives.ConstantValue
import org.isomorf.foundation.runtime.natives.RuntimeImplementation

object Natural extends ConstantRepresentable[natives.natural.Natural] {

  @inline
  final def apply(value: ConstantValue): natives.natural.Natural = {
    scala.BigInt(value)
  }

  @inline
  final def unapply(n: natives.natural.Natural): Option[ConstantValue] = {
    Option(n.toString)
  }

  @inline
  final def apply(i: natives.integer.fixed.signed32.Integer32): natives.natural.Natural = {
    scala.BigInt(i).abs
  }

  @inline
  final def apply(n: natives.number.Number): natives.option.Option[natives.natural.Natural] = {
    n.toBigIntExact()
  }

  private lazy val _0 = scala.BigInt(0)
  private lazy val _1 = scala.BigInt(1)

  @RuntimeImplementation
  object Zero {

    @inline
    final def apply(): natives.natural.Natural = {
      _0
    }

    @inline
    final def unapply(n: natives.natural.Natural): scala.Boolean = {
      n == _0
    }
  }

  @RuntimeImplementation
  object Successor {

    @inline
    final def apply(n: natives.natural.Natural): natives.natural.Natural = {
      n + _1
    }

    @inline
    final def unapply(n: natives.natural.Natural): scala.Option[natives.natural.Natural] = {
      if (n > _0) {
        Some(n - _1)
      } else {
        None
      }
    }
  }
}
