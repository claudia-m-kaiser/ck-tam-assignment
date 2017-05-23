name := """ck-tam-assignment"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.11"

libraryDependencies += filters
libraryDependencies ++= Seq(
  "com.braintreepayments.gateway" % "braintree-java" % "2.65.0"
)

resolvers ++= Seq(
  "webjars"    at "http://webjars.github.com/m2"
)

libraryDependencies ++= Seq(
  "org.webjars"               %% "webjars-play"       % "2.5.0",
  "org.webjars"               % "bootstrap"           % "4.0.0-alpha.6-1" exclude("org.webjars", "jquery"),
  "org.webjars"               % "jquery"              % "3.2.0"
)