// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/fangjie/scala_workspaces/elog/conf/routes
// @DATE:Mon Nov 12 19:36:08 CST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers {

  // @LINE:2
  class ReverseSearchController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def qps(module:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search/qps/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("module", module)))
    }
  
  }


}
