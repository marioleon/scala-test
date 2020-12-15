package org.example

import scala.util.{Failure, Success, Try}

object TestApplication {
  def main(args: Array[String]): Unit = {
    var optionalArg: Option[String] = None
    val outcome = Try(optionalArg = Option(args(0)))
    outcome match{
      case Success(_) => println(s"Hello ${optionalArg.get}")
      case Failure(e) => println(s"Ha, it didn't work, complained saying: '${e.getMessage}'")
    }
  }
}
