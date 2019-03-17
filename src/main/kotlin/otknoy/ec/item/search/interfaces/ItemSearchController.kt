package otknoy.ec.item.search.interfaces

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class ItemSearchController {

    @GetMapping(path=["/search"])
    fun search(query: String): List<String> {
        return Collections.emptyList()
    }
}