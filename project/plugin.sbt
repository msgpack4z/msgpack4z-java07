addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.2")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.11")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.7")

scalacOptions ++= (
  "-deprecation" ::
  "-unchecked" ::
  "-Xlint:-unused,_" ::
  "-Ywarn-unused:privates,locals,implicits" ::
  "-language:existentials" ::
  "-language:higherKinds" ::
  "-language:implicitConversions" ::
  Nil
)

fullResolvers ~= {_.filterNot(_.name == "jcenter")}
