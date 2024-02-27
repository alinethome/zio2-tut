ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"

val zioVersion = "2.0.15"

lazy val root = (project in file("."))
  .settings(
    name := "ZioMicroServices"
  )

libraryDependencies ++= Seq(
  "dev.zio"       %% "zio"            % zioVersion,
  "dev.zio"       %% "zio-json"       % "0.6.0",
  "dev.zio"       %% "zio-http"       % "3.0.0-RC2"
)