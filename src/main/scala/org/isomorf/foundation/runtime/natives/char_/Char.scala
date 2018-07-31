package org.isomorf.foundation.runtime.natives.char

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.ConstantRepresentable
import org.isomorf.foundation.runtime.natives.ConstantValue

object Char extends ConstantRepresentable[natives.char.Char] {

  @inline
  final def apply(value: ConstantValue): natives.char.Char = {
    value.toCharArray().head
  }

  @inline
  final def unapply(b: natives.char.Char): Option[ConstantValue] = {
    Option(b.toString)
  }

}

// why did I do this before??
/*
private def constantChar(value: String): Option[String] = {
    val result = value.toList match {
      case '\\' :: x :: _ => Some(s""" /* C1 */ '\\\\${x}' """)
      case '\\' :: Nil    => Some(s""" /* C2 */ '\\\\' """)
      case '\t' :: Nil    => Some(s""" /* C2 */ '\\t' """)
      case '\n' :: Nil    => Some(s""" /* C2 */ '\\n' """)
      case '\f' :: Nil    => Some(s""" /* C2 */ '\\f' """)
      case '\r' :: Nil    => Some(s""" /* C2 */ '\\r' """)
      case x :: _         => Some(s""" /* C3 */ '${x}' """)
      case _              => None
    }
    result
  }
*/
