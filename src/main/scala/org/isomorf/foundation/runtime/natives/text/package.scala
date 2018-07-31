package org.isomorf.foundation.runtime.natives

package object text {
  @CompileTimeTypeAlias
  type String = list.List[char.Char]
}
