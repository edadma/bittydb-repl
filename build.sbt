name := "bittydb-repl"

version := "0.3"

scalaVersion := "2.12.2"

crossScalaVersions := Seq( "2.11.11" )

scalacOptions ++= Seq( "-deprecation", "-feature", "-language:postfixOps", "-language:implicitConversions", "-language:existentials" )

incOptions := incOptions.value.withNameHashing( true )

organization := "xyz.hyperreal"

//resolvers += Resolver.sonatypeRepo( "snapshots" )

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Hyperreal Repository" at "https://dl.bintray.com/edadma/maven"

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "3.0.0" % "test",
	"org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
)

libraryDependencies ++= Seq(
  "xyz.hyperreal" %% "bittydb" % "0.7",
  "xyz.hyperreal" %% "funl" % "0.20"
)

mainClass in (Compile, run) := Some( "xyz.hyperreal." + "bittydbrepl" + ".Main" )

mainClass in assembly := Some( "xyz.hyperreal." + "bittydbrepl" + ".Main" )

assemblyJarName in assembly := name.value + "-" + version.value + ".jar"

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))

homepage := Some(url("https://github.com/edadma/bittydb-repl"))

pomExtra :=
  <scm>
    <url>git@github.com:edadma/bittydb-repl.git</url>
    <connection>scm:git:git@github.com:edadma/bittydb-repl.git</connection>
  </scm>
  <developers>
    <developer>
      <id>edadma</id>
      <name>Edward A. Maxedon, Sr.</name>
      <url>http://hyperreal.ca</url>
    </developer>
  </developers>
