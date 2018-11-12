name := "elog"

version := "1.0.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(guice)

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.9"

