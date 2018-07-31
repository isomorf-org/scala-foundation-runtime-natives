package org.isomorf.foundation.runtime.natives.list

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeImplementation

object List {

  @RuntimeImplementation
  object Cons {

    @inline
    final def apply[A](head: A, tail: natives.list.List[A]): natives.list.List[A] = {
      head :: tail
    }

    @inline
    final def unapply[A](list: natives.list.List[A]): scala.Option[(A, natives.list.List[A])] = {
      list match {
        case x :: xs => Option(x -> xs)
        case _       => None
      }
    }
  }

  @RuntimeImplementation
  object Nil {

    @inline
    final def apply[A](): natives.list.List[A] = {
      scala.Nil
    }

    @inline
    final def unapply[A](list: natives.list.List[A]): scala.Boolean = {
      list.isEmpty
    }
  }
}
