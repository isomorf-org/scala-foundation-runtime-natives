import sbt._
import Keys._

object Common {

  val organization = "org.isomorf"
	val name = "foundation-runtime-natives"

	object GitHub {
     val project = s"scala-${Common.name}"
     val organization = Common.organization.split("\\.").reverse.mkString("-")
  }

  object Docs {
     val relativeDir = "scaladocs/api/"
     val rootDir = "https://" + Common.GitHub.organization + ".github.io/" + Common.GitHub.project + "/" + Common.Docs.relativeDir
  }

  object Scala {
    val series = "2.12"
    val version = series + ".3"
    val crossVersions = Seq("2.11.11", version)
    val compilerOptions = Seq("-feature", "-unchecked", "-deprecation", "-encoding", "utf8", "-Xlint:_", "-Ywarn-unused-import")
  }

  object Publish {
    val homepage = "https://github.com/" + Common.GitHub.organization + "/" + Common.GitHub.project
    val repo = "git@github.com:" + Common.GitHub.organization + "/" + Common.GitHub.project + ".git"
    val devs = Seq(
      ("bdkent", "Brian Kent", "brian.kent@isomorf.io", "https://github.com/bdkent")
    )
  }

  object License {
    val name = "Apache-2.0"
    val url = "http://www.apache.org/licenses/LICENSE-2.0"
  }

  object OSGi {
    val exportPackage = Seq(
      "org.isomorf.foundation.runtime.natives",
      "org.isomorf.foundation.runtime.natives.boolean",
      "org.isomorf.foundation.runtime.natives.byte",
      "org.isomorf.foundation.runtime.natives.char",
      "org.isomorf.foundation.runtime.natives.dom",
      "org.isomorf.foundation.runtime.natives.effect",
      "org.isomorf.foundation.runtime.natives.either",
      "org.isomorf.foundation.runtime.natives.http",
      "org.isomorf.foundation.runtime.natives.integer",
      "org.isomorf.foundation.runtime.natives.list",
      "org.isomorf.foundation.runtime.natives.natural",
      "org.isomorf.foundation.runtime.natives.number",
      "org.isomorf.foundation.runtime.natives.option",
      "org.isomorf.foundation.runtime.natives.render",
      "org.isomorf.foundation.runtime.natives.text",
      "org.isomorf.foundation.runtime.natives.tuple",
      "org.isomorf.foundation.runtime.natives.unit",
    )
    val importPackage = Seq(
      "scala",
      "scala.annotation",
      "scala.math",
      "org.isomorf.foundation.runtime",
    )
    val additionalHeaders = Map()
  }
}
