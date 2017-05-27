
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/clkaiser/IdeaProjects/ck-tam-assignment/conf/routes
// @DATE:Sat May 27 21:09:25 AEST 2017


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
