package knoldus.sample

import knoldus.models.{ASD, Company, Person}

object ProtoDemo extends App
{
    val company = Company("Knoldus", Some("Carbyne"))
    val person = Person("AyushTiwari", 23, company)
    ASD("")

    println(s"Person : $person")
}
