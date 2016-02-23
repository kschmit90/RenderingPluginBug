package renderingpluginbug

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class AuthorController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        redirect action:"list", method:"GET"
    }

    def list() {
        render 'WeOw'
    }
}
