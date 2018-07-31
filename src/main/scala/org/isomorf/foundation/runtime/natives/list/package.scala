package org.isomorf.foundation.runtime.natives

package object list {
  @RuntimeImplementation
  type List[A] = scala.List[A]
}
