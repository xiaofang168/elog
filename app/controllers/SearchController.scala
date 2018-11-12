package controllers

import javax.inject._
import models.HelloWorld
import play.api.libs.json.Json._
import play.api.mvc.InjectedController
import services.ElkService

@Singleton
class SearchController @Inject
(elkService: ElkService) extends InjectedController {

  def qps(module: String) = Action {

    Ok(toJson(HelloWorld(elkService.url())))

  }

}

