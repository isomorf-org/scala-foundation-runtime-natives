package org.isomorf.foundation.runtime.natives

object NativeString {

  type crutch = List[Char]

  object StringAsMCons {

    def apply(c: Char, s: String): String = c + s

    def unapply(s: String): Option[(Char, String)] = {
      if (s.isEmpty()) {
        None
      } else {
        Some((s.charAt(0), s.substring(1)))
      }
    }
  }

  object StringAsMNil {

    def apply: String = ""

    def unapply(s: String): Option[String] = {
      if (s.isEmpty()) {
        Some("")
      } else {
        None
      }
    }
  }

}
