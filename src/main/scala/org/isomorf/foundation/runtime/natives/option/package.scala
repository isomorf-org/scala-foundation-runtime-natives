package org.isomorf.foundation.runtime.natives

package object option {
  @RuntimeImplementation
  type Option[A] = scala.Option[A]
}
