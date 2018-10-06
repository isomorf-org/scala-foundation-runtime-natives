package org.isomorf.foundation.runtime.natives.dom

import org.isomorf.foundation.runtime.natives

sealed trait Node
object Node {
  case class Text(text: natives.text.String) extends Node
  case class Comment(text: natives.text.String) extends Node
  case class CDATA(text: natives.text.String) extends Node
  case class Anchor(`class`: natives.list.List[natives.text.String], href: natives.text.String, click: natives.dom.Event => natives.effect.Effect[natives.unit.Unit]) extends Node
  case class Div(`class`: natives.list.List[natives.text.String], click: natives.dom.Event => natives.effect.Effect[natives.unit.Unit]) extends Node
  case class Paragraph(`class`: natives.list.List[natives.text.String], click: natives.dom.Event => natives.effect.Effect[natives.unit.Unit]) extends Node
}
