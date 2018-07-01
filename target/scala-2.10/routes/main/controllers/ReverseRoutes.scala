
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/chris/src/play/VocabularyTeacher/conf/routes
// @DATE:Thu Jun 28 05:40:24 EDT 2018

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.binders.PathBinders._
import _root_.binders.QueryStringBinders._

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseImport(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def importWord(sourceLang:play.api.i18n.Lang, word:String, targetLang:play.api.i18n.Lang, translation:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "import/word/" + implicitly[PathBindable[play.api.i18n.Lang]].unbind("sourceLang", sourceLang) + "/" + implicitly[PathBindable[String]].unbind("word", dynamicString(word)) + "/" + implicitly[PathBindable[play.api.i18n.Lang]].unbind("targetLang", targetLang) + "/" + implicitly[PathBindable[String]].unbind("translation", dynamicString(translation)))
    }
  
  }

  // @LINE:3
  class ReverseQuiz(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def quiz(sourceLang:play.api.i18n.Lang, targetLang:play.api.i18n.Lang): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "quiz/" + implicitly[PathBindable[play.api.i18n.Lang]].unbind("sourceLang", sourceLang) + queryString(List(Some(implicitly[QueryStringBindable[play.api.i18n.Lang]].unbind("targetLang", targetLang)))))
    }
  
    // @LINE:7
    def quizEndpoint(sourceLang:play.api.i18n.Lang, targetLang:play.api.i18n.Lang): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "quiz/interactive/" + implicitly[PathBindable[play.api.i18n.Lang]].unbind("sourceLang", sourceLang) + "/" + implicitly[PathBindable[play.api.i18n.Lang]].unbind("targetLang", targetLang))
    }
  
    // @LINE:5
    def check(sourceLang:play.api.i18n.Lang, word:String, targetLang:play.api.i18n.Lang, translation:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "quiz/" + implicitly[PathBindable[play.api.i18n.Lang]].unbind("sourceLang", sourceLang) + "/check/" + implicitly[PathBindable[String]].unbind("word", dynamicString(word)) + queryString(List(Some(implicitly[QueryStringBindable[play.api.i18n.Lang]].unbind("targetLang", targetLang)), Some(implicitly[QueryStringBindable[String]].unbind("translation", translation)))))
    }
  
  }


}