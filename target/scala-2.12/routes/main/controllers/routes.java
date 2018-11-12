// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/fangjie/scala_workspaces/elog/conf/routes
// @DATE:Mon Nov 12 19:36:08 CST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseSearchController SearchController = new controllers.ReverseSearchController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseSearchController SearchController = new controllers.javascript.ReverseSearchController(RoutesPrefix.byNamePrefix());
  }

}
