package org.isomorf.foundation.runtime.natives.boolean

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeImplementation

object Boolean {

  @RuntimeImplementation
  object True {
    @inline
    final def apply(): natives.boolean.Boolean = {
      true
    }

    @inline
    final def unapply(b: natives.boolean.Boolean): scala.Boolean = {
      b == true
    }
  }

  @RuntimeImplementation
  object False {
    @inline
    final def apply(): natives.boolean.Boolean = {
      false
    }
    @inline
    final def unapply(b: natives.boolean.Boolean): scala.Boolean = {
      b == false
    }
  }
}
