ThisBuild / scalaVersion := "3.4.2"

enablePlugins(ScalaJSPlugin)

name := "scalajs-vite"

// Emit ES modules for Vite compatibility
scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) }

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "2.8.0"
)
