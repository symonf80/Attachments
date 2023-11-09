class WallService {
    private var postId: Int = 1;
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post.copy(id = postId)
        postId++
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, item) in posts.withIndex()) {
            if (item.id == post.id) {
                posts[index] = post.copy(ownerId = item.ownerId, date = item.date)
                return true
            }
        }
        return false
    }
}