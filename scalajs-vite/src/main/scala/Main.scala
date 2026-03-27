package app

import org.scalajs.dom
import org.scalajs.dom.document
import org.scalajs.dom.html

@main def Main(): Unit =
  var count = 0

  val heading = document.createElement("h1")
  heading.textContent = "Hello from Scala.js! 🎉"

  val counter = document.createElement("p")
  counter.textContent = s"Count: $count"

  val button = document.createElement("button")
  button.textContent = "Click me"
  button.addEventListener(
    "click",
    _ =>
      count += 1
      counter.textContent = s"Count: $count"
  )

  val app = document.getElementById("app")
  app.appendChild(heading)
  app.appendChild(counter)
  app.appendChild(button)

  val table = document.createElement("table")

  for (w <- 0 to 39) {
    val tableRow = document.createElement("tr")
    for (x <- 0 to 39) {
      val tableData = document.createElement("td")
      val checkbox = document.createElement("input").asInstanceOf[html.Input]
      checkbox.`type` = "checkbox"
      checkbox.style = "margin: 0; display: block;";
      tableData.appendChild(checkbox)
      tableRow.appendChild(tableData)
    }
    table.appendChild(tableRow)
  }

  val app2 = document.getElementById("app2")
  app2.appendChild(table)
