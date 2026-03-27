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

  val tableSize = 60;

  val table = document.createElement("table").asInstanceOf[html.Table]

  for (w <- 0 to (tableSize - 1)) {
    val tableRow = document.createElement("tr")
    for (x <- 0 to (tableSize - 1)) {
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

  // Start newly AI generated code

  button.addEventListener(
    "click",
    _ => {
      // Read current state
      val currentState = Array.ofDim[Boolean](tableSize, tableSize)
      for (r <- 0 until tableSize; c <- 0 until tableSize) {
        val row = table.rows(r).asInstanceOf[html.TableRow]
        val cell = row.cells(c).asInstanceOf[html.TableCell]
        val checkbox = cell.firstChild.asInstanceOf[html.Input]
        currentState(r)(c) = checkbox.checked
      }

      // Compute next state
      val nextState = Array.ofDim[Boolean](tableSize, tableSize)
      for (r <- 0 until tableSize; c <- 0 until tableSize) {
        val liveNeighbors =
          (-1 to 1)
            .flatMap(dr => (-1 to 1).map(dc => (dr, dc)))
            .filterNot { case (dr, dc) => dr == 0 && dc == 0 }
            .count { case (dr, dc) =>
              val nr = r + dr
              val nc = c + dc
              nr >= 0 && nr < tableSize && nc >= 0 && nc < tableSize && currentState(
                nr
              )(nc)
            }

        nextState(r)(c) = currentState(r)(c) match {
          case true  => liveNeighbors == 2 || liveNeighbors == 3
          case false => liveNeighbors == 3
        }
      }

      // Update checkboxes
      for (r <- 0 until tableSize; c <- 0 until tableSize) {
        val checkbox =
          val row = table.rows(r).asInstanceOf[html.TableRow]
          val cell = row.cells(c).asInstanceOf[html.TableCell]
          cell.firstChild.asInstanceOf[html.Input]
        checkbox.checked = nextState(r)(c)
      }
    }
  )

  // End newly AI generated code
