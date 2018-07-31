package org.isomorf.foundation.runtime.natives

package object either {
  @RuntimeImplementation
  type Either[L, R] = scala.Either[L, R]
}