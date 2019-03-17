package otknoy.ec.item.search.domain.model

data class SearchResult(
        val resultCount: Int,
        val totalCount: Int,
        val firstPosition: Int,
        val items: List<Item>
)

data class Item(
        val title: String,
        val price: Int,
        val tags: List<String>
)