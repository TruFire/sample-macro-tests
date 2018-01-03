name := "sample-macro-tests"

version := "0.1"

scalaVersion := "2.11.11"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
scalacOptions += "-language:experimental.macros"
libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value % Provided,
  "com.chuusai" %% "shapeless" % "2.3.1" % Test,
  "org.specs2" %% "specs2-core" % "3.6.4" % Test,
  "org.scalatest" %% "scalatest" % "3.0.4" % Test
)

        