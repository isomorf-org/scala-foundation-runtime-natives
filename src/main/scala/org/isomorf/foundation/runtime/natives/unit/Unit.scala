package org.isomorf.foundation.runtime.natives.unit

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeImplementation

object Unit {

  @RuntimeImplementation
  object Unit {
    @inline
    final def apply(): natives.unit.Unit = {
      scala.Unit
    }

    @inline
    final def unapply(b: natives.unit.Unit): scala.Boolean = {
      true
    }
  }
}
