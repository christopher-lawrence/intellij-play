// The Typesafe repository
scalaVersion := "2.10.7"
// The Typesafe repository
resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"
resolvers += "Typesafe repository plugin" at "https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"
// Typesafe snapshots
resolvers += "Typesafe Snapshots" at "https://repo.typesafe.com/typesafe/snapshots/"

resolvers += "Test" at "https://proxy-ch.typesafe.com:8082/artifactory/list"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" %% "sbt-plugin" % "2.4.3")

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2")
