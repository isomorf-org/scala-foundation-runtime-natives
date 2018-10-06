package org.isomorf.foundation.runtime.natives.render

import org.isomorf.foundation.runtime.natives

sealed trait RenderChildren[P, C, S]
object RenderChildren {

  case class ChildrenList[P, C, S](
    list: natives.list.List[RenderElement[P, C, S]]) extends RenderChildren[P, C, S]

  case class ChildrenTransform[P, C, S](
    f: P => natives.list.List[RenderElement[C, C, S]]) extends RenderChildren[P, C, S]
}
