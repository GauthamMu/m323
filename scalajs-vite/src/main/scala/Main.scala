package app

import org.scalajs.dom
import org.scalajs.dom.document

@main def Main(): Unit =
  var count = 0

  val heading = document.createElement("h1")
  heading.textContent = "Hello from Scala.js! 🎉"

  val counter = document.createElement("p")
  counter.textContent = s"Count: $count"

  val button = document.createElement("button")
  button.textContent = "Click me"
  button.addEventListener("click", _ =>
    count += 1
    counter.textContent = s"Count: $count"
  )

  val app = document.getElementById("app")
  app.appendChild(heading)
  app.appendChild(counter)
  app.appendChild(button)
