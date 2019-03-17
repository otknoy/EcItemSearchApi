package otknoy.ec.item.search.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import otknoy.ec.item.search.application.service.ItemSearchService
import otknoy.ec.item.search.domain.model.SearchResult

@RestController
class ItemSearchController(val itemSearchService: ItemSearchService) {

    @GetMapping("/search")
    fun search(request: Request): SearchResult {
        val query = request.toQuery()

        return itemSearchService.searchItemsByQuery(query)
    }
}