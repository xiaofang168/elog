// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/fangjie/scala_workspaces/elog/conf/routes
// @DATE:Mon Nov 12 19:36:08 CST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
