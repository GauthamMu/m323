type Grid = Vector[Vector[Boolean]]

def render(grid: Grid): Unit =
  grid.foreach { row =>
    println(row.map(cell => if (cell) "O" else ".").mkString(" "))
  }

def evolve(grid: Grid): Grid =
  var newGrid = Vector.fill(20, 20)(false)
	// A buncha code that applies Conway's Game of Life
	// newGrid // I want to return this

@main def run(): Unit =
  var grid = Vector.fill(20, 20)(false)

  while (true) {
    println("\u001b[H\u001b[2J") // clear screen
    render(grid)
    Thread.sleep(1000) // Pause for a second
    grid = evolve(grid)
  }
