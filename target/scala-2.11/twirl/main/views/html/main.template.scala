
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, scripts: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">


    <title>PayPal Express Checkout</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.55*/routes/*13.61*/.Assets.versioned("images/favicon.png")),format.raw/*13.100*/("""">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" media="screen" />
  <body>
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">CK TAM Assignment</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
    <div id="overlay">
      <span>We are processing your payment. Please wait...</span>
    </div>
    <div class="container">
      <div class="starter-template">
        <h2>PayPal Express Checkout Flow</h2>
        <hr>
        """),_display_(/*43.10*/content),format.raw/*43.17*/("""
      """),format.raw/*44.7*/("""</div>
    </div>

    <script type="text/javascript" src=""""),_display_(/*47.42*/routes/*47.48*/.HomeController.javascriptRoutes),format.raw/*47.80*/(""""></script>
    <script src=""""),_display_(/*48.19*/routes/*48.25*/.Assets.versioned("javascripts/main.js")),format.raw/*48.65*/("""" type="text/javascript"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    """),_display_(/*51.6*/scripts),format.raw/*51.13*/("""

  """),format.raw/*53.3*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,scripts:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,scripts)(content)

  def f:((String,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,scripts) => (content) => apply(title,scripts)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sat May 27 21:34:50 AEST 2017
                  SOURCE: /Users/clkaiser/IdeaProjects/ck-tam-assignment/app/views/main.scala.html
                  HASH: 63cb66d152ae9accd17e86804f6b63f910768b15
                  MATRIX: 753->1|904->57|932->59|1253->353|1268->359|1330->400|1414->457|1429->463|1490->502|2994->1979|3022->1986|3056->1993|3143->2053|3158->2059|3211->2091|3268->2121|3283->2127|3344->2167|3615->2412|3643->2419|3674->2423
                  LINES: 27->1|32->1|34->3|43->12|43->12|43->12|44->13|44->13|44->13|74->43|74->43|75->44|78->47|78->47|78->47|79->48|79->48|79->48|82->51|82->51|84->53
                  -- GENERATED --
              */
          