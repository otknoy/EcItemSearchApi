package otknoy.ec.item.search.presentation

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Disabled
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import otknoy.ec.item.search.application.service.ItemSearchService

@SpringBootTest
class ItemSearchControllerTest(
        @Autowired var itemSearchController: ItemSearchController,
        @MockBean var itemSearchService: ItemSearchService
) {


    @Test
    @Disabled
    fun search_returns_SearchResult_when_passed_query_created_from_Request() {
    }
}