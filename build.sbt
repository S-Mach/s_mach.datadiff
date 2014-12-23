scalaVersion := "2.11.1"

organization := "net.s_mach"

name := "datadiff"

version := "0.1-SNAPSHOT"

scalacOptions ++= Seq("-feature","-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "com.googlecode.java-diff-utils" % "diffutils" % "1.3.0",
  "org.scalatest" % "scalatest_2.11" % "2.2.0" % "test",
  "net.s_mach" %% "codetools" % "0.1-SNAPSHOT"
)
