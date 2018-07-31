package org.isomorf.foundation.runtime

package object natives {
  type ConstantValue = String
}

package natives {
  trait ConstantRepresentable[A] {
    def apply(value: ConstantValue): A
    def unapply(a: A): Option[ConstantValue]
  }
}