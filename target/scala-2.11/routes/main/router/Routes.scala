
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/clkaiser/IdeaProjects/ck-tam-assignment/conf/routes
// @DATE:Tue May 23 20:39:11 AEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:16
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:16
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client-token""", """controllers.HomeController.getClientToken()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sale""", """controllers.HomeController.saleTransaction()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """javascriptRoutes""", """controllers.HomeController.javascriptRoutes"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_getClientToken1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client-token")))
  )
  private[this] lazy val controllers_HomeController_getClientToken1_invoker = createInvoker(
    HomeController_0.getClientToken(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getClientToken",
      Nil,
      "GET",
      """ Client token controller""",
      this.prefix + """client-token"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_saleTransaction2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sale")))
  )
  private[this] lazy val controllers_HomeController_saleTransaction2_invoker = createInvoker(
    HomeController_0.saleTransaction(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "saleTransaction",
      Nil,
      "POST",
      """""",
      this.prefix + """sale"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_javascriptRoutes4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("javascriptRoutes")))
  )
  private[this] lazy val controllers_HomeController_javascriptRoutes4_invoker = createInvoker(
    HomeController_0.javascriptRoutes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "javascriptRoutes",
      Nil,
      "GET",
      """""",
      this.prefix + """javascriptRoutes"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:9
    case controllers_HomeController_getClientToken1_route(params) =>
      call { 
        controllers_HomeController_getClientToken1_invoker.call(HomeController_0.getClientToken())
      }
  
    // @LINE:10
    case controllers_HomeController_saleTransaction2_route(params) =>
      call { 
        controllers_HomeController_saleTransaction2_invoker.call(HomeController_0.saleTransaction())
      }
  
    // @LINE:16
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:18
    case controllers_HomeController_javascriptRoutes4_route(params) =>
      call { 
        controllers_HomeController_javascriptRoutes4_invoker.call(HomeController_0.javascriptRoutes)
      }
  }
}
