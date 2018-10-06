package org.isomorf.foundation.runtime.natives.render

import org.isomorf.foundation.runtime.natives

sealed trait RenderElement[P, C, S]
object RenderElement {

  case class NodeRenderElement[P, C, S](
    node:       natives.dom.Node,
    properties: P,
    children:   RenderChildren[P, C, S]) extends RenderElement[P, C, S]

  case class ComponentRenderElement[P, C, S](
    renderable: RenderComponent[P, C, S],
    properties: P,
    children:   RenderChildren[P, C, S]) extends RenderElement[P, C, S]

  case class PureRenderElement[P, C, S](
    element:    RenderComponent[P, C, natives.unit.Unit],
    properties: P,
    children:   RenderChildren[P, C, S]) extends RenderElement[P, C, S]
}
