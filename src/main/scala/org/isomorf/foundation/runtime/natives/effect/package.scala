package org.isomorf.foundation.runtime.natives

package object effect {
  @RuntimeTypeAlias
  type Effect[A] = org.isomorf.foundation.runtime.RTEffect[A]
}
