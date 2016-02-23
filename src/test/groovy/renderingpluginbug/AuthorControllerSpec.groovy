package renderingpluginbug

import grails.test.mixin.*

@TestFor(AuthorController)
@Mock(Author)
class AuthorControllerSpec {
    void testIndex() {
        controller.index()

        assert "/author/list" == response.redirectedUrl
    }
}
