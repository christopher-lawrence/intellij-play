
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/chris/src/play/VocabularyTeacher/conf/routes
// @DATE:Thu Jun 28 05:40:24 EDT 2018


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
