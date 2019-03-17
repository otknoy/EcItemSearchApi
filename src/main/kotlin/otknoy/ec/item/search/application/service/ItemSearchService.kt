package otknoy.ec.item.search.application.service

import org.springframework.stereotype.Service
import otknoy.ec.item.search.domain.model.Item
import otknoy.ec.item.search.domain.model.Query
import otknoy.ec.item.search.domain.model.SearchResult

@Service
class ItemSearchService {

    fun searchItemsByQuery(query: Query): SearchResult {
        return SearchResult(
                1,
                1,
                1,
                listOf(
                        Item(
                                "test-item",
                                1000,
                                listOf("foo", "bar")
                        )
                )
        )
    }
}