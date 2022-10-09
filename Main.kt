fun moveRobot(robot: Robot, toX: Int, toY: Int){
    if (robot.getX() < toX) {
        while(robot.getDirection() != Direction.RIGHT) {
            robot.turnRight()
        }
    }
    else {
        while(robot.getDirection() != Direction.LEFT) {
            robot.turnRight()
        }
    }
    while (robot.getX() != toX) {
        robot.stepForward()
    }
    if (robot.getY() < toY) {
        while(robot.getDirection() != Direction.UP) {
            robot.turnRight()
        }
    }
    else {
        while(robot.getDirection() != Direction.DOWN) {
            robot.turnRight()
        }
    }
    while (robot.getY() != toY) {
        robot.stepForward()
    }
}

enum class Direction {
    UP, DOWN, LEFT, RIGHT
}

fun main() {
    val r1 = Robot(3, 4, Direction.RIGHT)
    val r2 = Robot(0, 0, Direction.DOWN)
//    println("${r1.x}, ${r1.y}, ${r1.direction}")
//    r1.stepForward()
//    println("${r1.x}, ${r1.y}, ${r1.direction}")
//    println()
//    println(r1)
    moveRobot(r1, 5, 10)

}