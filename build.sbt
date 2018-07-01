name := "VocabularyTeacher"

version := "1.0"

scalaVersion := "2.10.7"

lazy val VocabularyTeacher = (project in file(".")).enablePlugins(PlayScala)

routesGenerator := InjectedRoutesGenerator

com.typesafe.sbt.SbtScalariform.scalariformSettings

routesImport ++= Seq(
  "binders.PathBinders._",
  "binders.QueryStringBinders._"
)

libraryDependencies += filters
