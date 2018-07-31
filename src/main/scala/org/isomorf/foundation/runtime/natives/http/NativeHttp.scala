package org.isomorf.foundation.runtime.natives.http

import org.isomorf.foundation.runtime.natives
import org.isomorf.foundation.runtime.natives.RuntimeTypeAlias

case class Method(value: natives.text.String)

case class StatusCode(code: natives.text.String)

case class ContentType(value: natives.text.String)

case class Uri(
  scheme:    natives.text.String,
  authority: Authority,
  path:      natives.list.List[natives.text.String],
  query:     natives.option.Option[natives.text.String],
  fragment:  natives.option.Option[natives.text.String])

sealed trait Host
object Host {
  case class NamedHost(address: natives.text.String) extends Host
  case class IPv4Host(_1: natives.byte.Byte, _2: natives.byte.Byte, _3: natives.byte.Byte, _4: natives.byte.Byte) extends Host
  // TODO: IPv6 ?
}

case class Authority(host: Host, port: natives.natural.fixed.Natural16)

sealed trait RequestEntity
object RequestEntity {
  case class Strict(contentType: ContentType, data: EntityData) extends RequestEntity
  // TODO: others
}

@RuntimeTypeAlias
trait EntityData

case class ResponseEntity(contentType: ContentType, data: EntityData)

case class Request(
  method:   Method,
  uri:      Uri,
  headers:  natives.list.List[Header],
  entity:   natives.option.Option[RequestEntity],
  protocol: Protocol)

case class Response(
  status:   StatusCode,
  headers:  natives.list.List[Header],
  entity:   natives.option.Option[ResponseEntity],
  protocol: Protocol)

case class Protocol(value: natives.text.String)

case class Header(name: natives.text.String, value: natives.text.String)

sealed trait Error
object Error {
  //    case class UnknownUriSchema() extends Error
}
