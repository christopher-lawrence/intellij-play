
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/chris/src/play/VocabularyTeacher/conf/routes
// @DATE:Thu Jun 28 05:40:24 EDT 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.binders.PathBinders._
import _root_.binders.QueryStringBinders._

// @LINE:1
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:1
  class ReverseImport(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def importWord: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Import.importWord",
      """
        function(sourceLang,word,targetLang,translation) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "import/word/" + (""" + implicitly[PathBindable[play.api.i18n.Lang]].javascriptUnbind + """)("sourceLang", sourceLang) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("word", encodeURIComponent(word)) + "/" + (""" + implicitly[PathBindable[play.api.i18n.Lang]].javascriptUnbind + """)("targetLang", targetLang) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("translation", encodeURIComponent(translation))})
        }
      """
    )
  
  }

  // @LINE:3
  class ReverseQuiz(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def quiz: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Quiz.quiz",
      """
        function(sourceLang,targetLang) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "quiz/" + (""" + implicitly[PathBindable[play.api.i18n.Lang]].javascriptUnbind + """)("sourceLang", sourceLang) + _qS([(""" + implicitly[QueryStringBindable[play.api.i18n.Lang]].javascriptUnbind + """)("targetLang", targetLang)])})
        }
      """
    )
  
    // @LINE:7
    def quizEndpoint: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Quiz.quizEndpoint",
      """
        function(sourceLang,targetLang) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "quiz/interactive/" + (""" + implicitly[PathBindable[play.api.i18n.Lang]].javascriptUnbind + """)("sourceLang", sourceLang) + "/" + (""" + implicitly[PathBindable[play.api.i18n.Lang]].javascriptUnbind + """)("targetLang", targetLang)})
        }
      """
    )
  
    // @LINE:5
    def check: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Quiz.check",
      """
        function(sourceLang,word,targetLang,translation) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "quiz/" + (""" + implicitly[PathBindable[play.api.i18n.Lang]].javascriptUnbind + """)("sourceLang", sourceLang) + "/check/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("word", encodeURIComponent(word)) + _qS([(""" + implicitly[QueryStringBindable[play.api.i18n.Lang]].javascriptUnbind + """)("targetLang", targetLang), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("translation", translation)])})
        }
      """
    )
  
  }


}