package org.isomorf.foundation.runtime.natives

package object number {
  @RuntimeImplementation
  type Number = scala.math.BigDecimal
}
