organization := "kz.mounty"

name := "mounty-domain"

isSnapshot := true

version := "0.1.0"

scalaVersion := "2.12.12"

ThisBuild / publishTo := Some("Artifactory Realm" at "https://mounty.jfrog.io/artifactory/mounty-domain-sbt-dev;build.timestamp=" + new java.util.Date().getTime)
credentials += Credentials("Artifactory Realm", "mounty.jfrog.io", "sansyzbayevdaniyar3@gmail.com", "AKCp8k8iXkJUazq2J2CAa5uT4XvrDwf9Y9uzWsLuGcoq5C1pYix9DaP2CGsAUjgvH4mReFuoJ")
publishConfiguration := publishConfiguration.value.withOverwrite(true)
publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true)

libraryDependencies ++= Seq(
  "joda-time"  % "joda-time"  % "2.8.2"
)
