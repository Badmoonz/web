name := "simpleWeb"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.2"

resolvers += "webjars" at "http://webjars.github.com/m2"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "org.webjars" %% "webjars-play" % "2.2.1",
  "org.webjars" % "bootstrap" % "2.3.2",
  "org.webjars" % "angularjs" % "1.2.2",
  "org.webjars" % "angular-ui-bootstrap" % "0.6.0-1"
)

play.Project.playScalaSettings
