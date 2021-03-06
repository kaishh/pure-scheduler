organization := "com.emarsys"
name := "scheduler"
scalaVersion := "2.12.8"

scalacOptions ++= Seq(
  "-language:higherKinds",
  "-deprecation",
  "-Ypartial-unification",
  "-encoding",
  "UTF-8",
  "-explaintypes",
  "-unchecked",
  "-feature",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-Ywarn-dead-code",
  "-Ywarn-extra-implicit",
  "-Ywarn-inaccessible",
  "-Ywarn-infer-any",
  "-Ywarn-nullary-override",
  "-Ywarn-nullary-unit",
  "-Ywarn-numeric-widen",
  "-Ywarn-unused:implicits",
  "-Ywarn-unused:imports",
  "-Ywarn-unused:locals",
  "-Ywarn-unused:params",
  "-Ywarn-unused:patvars",
  "-Ywarn-unused:privates",
  "-Yno-adapted-args",
  "-Xlint"
)

scalafmtOnCompile := true

libraryDependencies += "org.typelevel"  %% "cats-core"        % "1.5.0"
libraryDependencies += "org.typelevel"  %% "cats-effect"      % "1.1.0"
libraryDependencies += "org.scalacheck" %% "scalacheck"       % "1.14.0" % Test
libraryDependencies += "org.scalatest"  %% "scalatest"        % "3.0.1"  % Test
libraryDependencies += "org.typelevel"  %% "cats-testkit"     % "1.5.0"  % Test
libraryDependencies += "org.typelevel"  %% "cats-effect-laws" % "1.1.0"  % Test

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.7")
addCompilerPlugin("io.tryp"        % "splain"          % "0.3.5" cross CrossVersion.patch)

inThisBuild(
  List(
    licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT")),
    homepage := Some(url("https://github.com/emartech/pure-scheduler")),
    developers := List(
      Developer("doczir", "Robert Doczi", "doczi.r@gmail.com", url("https://github.com/doczir")),
      Developer("miklos-martin", "Miklos Martin", "miklos.martin@gmail.com", url("https://github.com/miklos-martin"))
    )
  )
)
