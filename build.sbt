scalaVersion := "2.12.10"
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.8.1"
wartremoverErrors += wartremover.Wart.PublicInference
scalacOptions += "-Xprint:typer"
