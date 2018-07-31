package org.isomorf.foundation.runtime.natives.either

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeImplementation

object Either {

  @RuntimeImplementation
  object Left {

    @inline
    final def apply[L, R](value: L): natives.either.Either[L, R] = {
      scala.Left(value)
    }

    @inline
    final def unapply[L, R](either: natives.either.Either[L, R]): scala.Option[L] = {
      either.left.toOption
    }
  }

  @RuntimeImplementation
  object Right {

    @inline
    final def apply[L, R](value: R): natives.either.Either[L, R] = {
      scala.Right(value)
    }

    @inline
    final def unapply[L, R](either: natives.either.Either[L, R]): scala.Option[R] = {
      either.right.toOption
    }
  }
}
