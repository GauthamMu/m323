// Diese App ist ein Conway's Game of Life simulator. Momentan (27. Feb) macht er einen Glider.

type Grid = Vector[Vector[Boolean]]

def render(grid: Grid): Unit =
  grid.foreach { row =>
    println(row.map(cell => if (cell) "O" else ".").mkString(" "))
  }

def countNeighbors(grid: Grid, x: Int, y: Int): Int = {
  val deltas = Vector(-1, 0, 1)
  deltas.flatMap(dx => deltas.map(dy => (dx, dy))).count { case (dx, dy) =>
    val nx = x + dx
    val ny = y + dy
    (dx != 0 || dy != 0) && nx >= 0 && nx < grid.length && ny >= 0 && ny < grid(
      0
    ).length && grid(nx)(ny)
  }
}

def evolve(grid: Grid): Grid =
  grid.zipWithIndex.map { case (row, x) =>
    row.zipWithIndex.map { case (cell, y) =>
      val neighbors = countNeighbors(grid, x, y)
      if (cell && (neighbors == 2 || neighbors == 3)) true // survives
      else if (!cell && neighbors == 3) true // birth
      else false // dies
    }
  }

@main def run(): Unit =
  var grid = Vector.fill(20, 20)(false)
  // Example: add a glider
  grid = grid.updated(1, grid(1).updated(2, true))
  grid = grid.updated(2, grid(2).updated(3, true))
  grid = grid.updated(3, grid(3).updated(1, true))
  grid = grid.updated(3, grid(3).updated(2, true))
  grid = grid.updated(3, grid(3).updated(3, true))

  while (true) {
    println("\u001b[H\u001b[2J") // clear screen
    render(grid)
    Thread.sleep(500) // Pause for half a second
    grid = evolve(grid)
  }
