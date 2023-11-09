data class Video(
    val id: Int = 1,
    val ownerId: Int = 1,
    val title: String = "title",
    val description: String = "description",
    val duration: String = "long",
    val photo130: String = "130",
    val photo320: String = "320",
    val photo640: String = "640",
    val photo800: String = "800",
    val photo1280: String = "1280",
    val firstFrame130: String = "f130",
    val firstFrame320: String = "f320",
    val firstFrame640: String = "f640",
    val firstFrame800: String = "f800",
    val firstFrame1280: String = "f1280",
    val date: Int = 1,
    val addingDate: Int = 1,
    val views: Int = 1,
    val comments: Int = 1,
    val player: String = "player",
    val platform: String = "platform",
    val canEdit: Boolean = true,
    val canAdd: Boolean = true,
    val isPrivate: Boolean = true,
    val accessKey: String = "key",
    val processing: Boolean = true,
    val live: Boolean = true,
    val upcoming: Boolean = true,
    val isFavorite: Boolean = true
)
