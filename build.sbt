import AssemblyKeys._


name := "bittydb-repl"

version := "0.1"

scalaVersion := "2.11.6"

scalacOptions ++= Seq( "-deprecation", "-feature", "-language:postfixOps", "-language:implicitConversions", "-language:existentials" )

incOptions := incOptions.value.withNameHashing( true )

organization := "ca.hyperreal"

//resolvers += Resolver.sonatypeRepo( "snapshots" )

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Hyperreal Repository" at "https://dl.bintray.com/edadma/maven"

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "2.2.1" % "test",
	"org.scalacheck" %% "scalacheck" % "1.11.5" % "test"
	)

libraryDependencies += "ca.hyperreal" %% "bittydb" % "0.1"

libraryDependencies += "ca.hyperreal" %% "funl" % "0.18"

mainClass in (Compile, run) := Some( "ca.hyperreal." + "bittydbrepl" + ".Main" )

assemblySettings

mainClass in assembly := Some( "ca.hyperreal." + "bittydbrepl" + ".Main" )

jarName in assembly := name.value + "-" + version.value + ".jar"

seq(bintraySettings:_*)

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))

homepage := Some(url("https://github.com/edadma/bittydb-repl"))

pomExtra := (
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
  </developers>)
