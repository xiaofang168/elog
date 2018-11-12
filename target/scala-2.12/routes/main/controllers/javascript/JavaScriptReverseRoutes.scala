// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/fangjie/scala_workspaces/elog/conf/routes
// @DATE:Mon Nov 12 19:36:08 CST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers.javascript {

  // @LINE:2
  class ReverseSearchController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def qps: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.qps",
      """
        function(module0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/qps/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("module", module0))})
        }
      """
    )
  
  }


}
