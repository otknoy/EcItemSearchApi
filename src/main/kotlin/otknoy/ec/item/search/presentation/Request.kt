package otknoy.ec.item.search.presentation

import otknoy.ec.item.search.domain.model.Keyword
import otknoy.ec.item.search.domain.model.Query

class Request(var keyword : String) {
    fun toQuery(): Query {
        return Query(
                Keyword(keyword)
        )
    }
}