name := "cucumber_scala_example"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq("io.cucumber" %% "cucumber-scala" % "4.7.1" % Test,
  "io.cucumber" % "cucumber-junit" % "4.7.1" % Test,
  "junit" % "junit" % "4.12" % Test,
  // to run the junit TestRunner from sbt
  "com.novocode" % "junit-interface" % "0.11" % Test)