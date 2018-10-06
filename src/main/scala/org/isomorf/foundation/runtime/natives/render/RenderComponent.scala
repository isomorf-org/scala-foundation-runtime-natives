package org.isomorf.foundation.runtime.natives.render

import org.isomorf.foundation.runtime.natives

case class RenderComponent[P, C, S](
  render: (P, S, (S => S) => natives.effect.Effect[natives.unit.Unit]) => natives.render.RenderElement[P, C, S],
  init:   P => S)
