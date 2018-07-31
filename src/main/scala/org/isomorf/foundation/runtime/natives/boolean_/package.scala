package org.isomorf.foundation.runtime.natives

package object boolean {
  
  import scala.{ Boolean => _ }

  @RuntimeImplementation
  type Boolean = scala.Boolean
}
