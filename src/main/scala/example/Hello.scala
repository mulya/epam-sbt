package example

object Hello extends Greeting with App {
  Util.println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
