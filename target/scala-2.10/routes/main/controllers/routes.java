
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/chris/src/play/VocabularyTeacher/conf/routes
// @DATE:Thu Jun 28 05:40:24 EDT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseImport Import = new controllers.ReverseImport(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseQuiz Quiz = new controllers.ReverseQuiz(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseImport Import = new controllers.javascript.ReverseImport(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseQuiz Quiz = new controllers.javascript.ReverseQuiz(RoutesPrefix.byNamePrefix());
  }

}
