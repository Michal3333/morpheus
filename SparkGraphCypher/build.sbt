name := "SparkGraphCypher"

version := "0.1"

scalaVersion := "2.12.10"


val dependencies = Seq(
    "org.apache.spark" % "spark-core_2.12" % "3.0.0-preview2",
    "org.apache.spark" % "spark-sql_2.12" % "3.0.0-preview2",
    "org.opencypher" % "morpheus-spark-cypher" % "0.4.2"
)

lazy val root = (project in file(".")).
    settings(
        libraryDependencies ++= dependencies
    )
