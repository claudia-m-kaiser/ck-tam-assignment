name := "ck-tam-assignment"

organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.11"

libraryDependencies += filters
libraryDependencies ++= Seq(
  "com.braintreepayments.gateway" % "braintree-java" % "2.65.0"
)
