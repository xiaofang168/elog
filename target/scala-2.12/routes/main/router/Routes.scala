// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/fangjie/scala_workspaces/elog/conf/routes
// @DATE:Mon Nov 12 19:36:08 CST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  SearchController_0: controllers.SearchController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    SearchController_0: controllers.SearchController
  ) = this(errorHandler, SearchController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, SearchController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search/qps/""" + "$" + """module<[^/]+>""", """controllers.SearchController.qps(module:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_SearchController_qps0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/qps/"), DynamicPart("module", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SearchController_qps0_invoker = createInvoker(
    SearchController_0.qps(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "qps",
      Seq(classOf[String]),
      "GET",
      this.prefix + """search/qps/""" + "$" + """module<[^/]+>""",
      """# Hello Play JSON Controller""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_SearchController_qps0_route(params@_) =>
      call(params.fromPath[String]("module", None)) { (module) =>
        controllers_SearchController_qps0_invoker.call(SearchController_0.qps(module))
      }
  }
}
