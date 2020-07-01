name := "spark-three-examples"

version := "0.1"

scalaVersion := "2.12.4"

val sparkVersion = "3.0.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "mysql" % "mysql-connector-java" % "5.1.6"
)

resolvers += Resolver.bintrayIvyRepo("com.eed3si9n", "sbt-plugins")

