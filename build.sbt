val shared = Seq(
    name := "scala3-example-project",
    description := "Example sbt project that compiles using Scala 3",
    version := "0.1.0",
    scalaVersion := "3.1.1",
      libraryDependencies ++= Seq(
        "ch.qos.logback" % "logback-classic" % "1.1.7"
      )
)
lazy val root = project
  .in(file("."))
  .settings(shared)
