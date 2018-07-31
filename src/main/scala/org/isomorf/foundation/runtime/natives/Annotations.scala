package org.isomorf.foundation.runtime.natives

import scala.annotation.StaticAnnotation

// this indicates something where the alias exists just to remove tedium in writing code,
// but that does not exist at runtime (like String -> List[Char])
class CompileTimeTypeAlias extends StaticAnnotation

class RuntimeTypeAlias extends StaticAnnotation

class RuntimeImplementation extends StaticAnnotation

class RuntimeNativeFunction extends StaticAnnotation
