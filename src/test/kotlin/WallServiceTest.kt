import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {

        val data = WallService().add(Post()).id
        assertNotEquals(0, data)
    }
    @Test
    fun updateTrue() {

        val service = WallService()
        service.add(Post(1,1,1,1,1,"text",1,1,true,Post.Comments()))
        service.add(Post(2, 3, 4, 5, 1,"test2",1,1,true, Post.Comments()))
        service.add(Post(3, 3, 4, 5, 1,"test2",1,1,true, Post.Comments()))
        val update = Post(3, 3, 4, 5, 1,"test2",1,1,true, Post.Comments())
        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun updateFalse() {

        val service = WallService()
        service.add(Post(1,1,1,1,1,"text",1,1,true,Post.Comments()))
        service.add(Post(2, 3, 4, 5, 1,"test2",1,1,true, Post.Comments()))
        service.add(Post(3, 3, 4, 5, 1,"test2",1,1,true, Post.Comments()))
        val update = Post(5,1,1,1,1,"text",1,1,true,Post.Comments())
        val result = service.update(update)
        assertFalse(result)

    }
}