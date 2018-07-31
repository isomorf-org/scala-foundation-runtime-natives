package org.isomorf.foundation.runtime.natives.option

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeImplementation

object Option {
  @RuntimeImplementation
  object Some {

    @inline
    final def apply[A](value: A): natives.option.Option[A] = {
      scala.Option(value)
    }

    @inline
    final def unapply[A](option: natives.option.Option[A]): scala.Option[A] = {
      option
    }
  }

  @RuntimeImplementation
  object None {

    @inline
    final def apply[A](): natives.option.Option[A] = {
      scala.None
    }

    @inline
    final def unapply[A](option: natives.option.Option[A]): scala.Boolean = {
      option.isEmpty
    }
  }
}
