package otknoy.ec.item.search.application.repository

import otknoy.ec.item.search.domain.model.Keyword
import otknoy.ec.item.search.domain.model.SearchResult

interface ItemRepository {
    fun searchItemsByKeyword(keyword: Keyword): SearchResult
}