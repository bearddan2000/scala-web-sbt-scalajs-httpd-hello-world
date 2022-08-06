enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"

scalaVersion := "2.13.1" // or any other Scala version >= 2.11.12

  // This is an application with a main method
scalaJSUseMainModuleInitializer := true

mainClass := Some("example.Main")
