package knoldus.sample

import knoldus.models.{Company, Person}

object ProtoDemo extends App
{
    val company = Company("Knoldus", Some("Carbyne"))
    val person = Person("AyushTiwari", 23, company)

    println(s"Person : $person")
}
