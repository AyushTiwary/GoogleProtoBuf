name := "GoogleProtobufPOC"

version := "0.1"

scalaVersion := "2.12.1"

PB.targets in Compile := Seq(
    scalapb.gen() -> (sourceManaged in Compile).value
)
