package org.isomorf.foundation.runtime.natives

package object tuple {
  @RuntimeImplementation
  type Tuple2[A, B] = scala.Tuple2[A, B]
}