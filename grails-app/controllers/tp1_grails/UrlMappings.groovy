package tp1_grails

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        //"/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

        "/"(controller: "main")
        "/gestion"(controller: "gestion")


    }
}
