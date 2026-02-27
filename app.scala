type Grid = Vector[Vector[Boolean]]

def render(grid: Grid): Unit =
  grid.foreach { row =>
    println(row.map(cell => if (cell) "O" else ".").mkString(" "))
  }

def evolve(grid: Grid): Grid = grid

@main def run(): Unit =
  var grid = Vector.fill(5, 5)(false)

  while (true) {
    println("\u001b[H\u001b[2J") // clear screen
    render(grid)
    Thread.sleep(300)
    grid = evolve(grid)
  }
