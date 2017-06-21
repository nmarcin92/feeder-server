name := "feeder-server"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.0.8"
libraryDependencies += "org.mindrot" % "jbcrypt" % "0.4"
libraryDependencies += "org.reactivemongo" %% "reactivemongo" % "0.12.3"