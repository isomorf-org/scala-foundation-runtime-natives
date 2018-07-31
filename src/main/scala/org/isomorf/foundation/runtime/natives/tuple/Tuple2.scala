package org.isomorf.foundation.runtime.natives.tuple

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeImplementation

object Tuple2 {
  @RuntimeImplementation
  object Tuple2 {

    @inline
    final def apply[A, B](_1: A, _2: B): natives.tuple.Tuple2[A, B] = {
      scala.Tuple2(_1, _2)
    }

    @inline
    final def unapply[A, B](tuple: natives.tuple.Tuple2[A, B]): scala.Option[(A, B)] = {
      Option(tuple)
    }
  }
}
