lazy val commonSettings = Seq(

  name := "ScalaCourse",

  version := "0.1",

  scalaVersion := "2.13.3",

  libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % Test,
)

lazy val root = project.in(file(".")).aggregate(Lab1,Lab2,Lab3,Lab4).settings(commonSettings)

lazy val Lab1 = project.settings(commonSettings)

lazy val Lab2 = project.settings(commonSettings)

lazy val Lab3 = project.settings(commonSettings)

lazy val Lab4 = project.settings(commonSettings)
