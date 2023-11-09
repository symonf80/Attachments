
fun main() {
    val post = Post()
    val wall = WallService()
    wall.add(post)
    println(wall.posts.last())
}


