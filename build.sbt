name := "amazon-fine-foods"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.0.1" % "provided",
  "org.apache.spark" %% "spark-sql" % "2.0.1" % "provided",
  "net.sf.opencsv" % "opencsv" % "2.0",
  "com.rabbitmq" % "amqp-client" % "3.6.5"
)