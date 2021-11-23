organization := "kz.mounty"

name := "mounty-domain"

isSnapshot := true

version := "0.1.1" + (if (isSnapshot.value) "-SNAPSHOT" else "")
scalaVersion := "2.12.12"

scalacOptions ++= Seq(
  "-feature", // Emit warning and location for usages of features that should be imported explicitly
  "-unchecked", // Enable additional warnings where generated code depends on assumptions
  "-deprecation", // Emit warning and location for usages of deprecated APIs.
  "-explaintypes", // Explain type errors in more detail
  "-opt:l:inline", // Enable cross-method optimizations: l:method,inline
  "-opt-inline-from:**", // Optimisations
  "-Xlint:missing-interpolator", // A string literal appears to be missing an interpolator id
  "-Ywarn-dead-code", // Warn when dead code is identified
  "-Ywarn-unused:imports,patvars,privates,locals,explicits,implicits" // Warn unused
)

credentials += Credentials("Artifactory Realm", "mounty.jfrog.io", "sansyzbayevdaniyar3@gmail.com", "AKCp8k8iXkJUazq2J2CAa5uT4XvrDwf9Y9uzWsLuGcoq5C1pYix9DaP2CGsAUjgvH4mReFuoJ")

publishTo := {
  if (isSnapshot.value) {
    Some("Artifactory Realm" at "https://mounty.jfrog.io/artifactory/mounty-domain-sbt-release-local;build.timestamp=" + new java.util.Date().getTime)
  } else {
    Some("Artifactory Realm" at "https://mounty.jfrog.io/artifactory/mounty-domain-sbt-release-local")
  }
}


libraryDependencies ++= Seq(
  "joda-time"  % "joda-time"  % "2.10.13"
)
