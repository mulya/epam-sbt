import Dependencies._

scalaVersion := "2.12.4"

lazy val util = (project in file("util")).
  settings(
    name := "Util"
  )

lazy val root = (project in file(".")).
  disablePlugins(plugins.Giter8TemplatePlugin).
  dependsOn(util).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Hello",
    libraryDependencies += scalaTest
  )

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  Resolver.mavenLocal
)