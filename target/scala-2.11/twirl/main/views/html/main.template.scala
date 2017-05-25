
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
  def apply/*1.2*/(title: String)(scripts: Html)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.47*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
      <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <title>PayPal Express Checkout</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*13.50*/routes/*13.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*14.55*/routes/*14.61*/.Assets.versioned("images/favicon.png")),format.raw/*14.100*/("""">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  </head>
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
          <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
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

  def render(title:String,scripts:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(scripts)(content)

  def f:((String) => (Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (scripts) => (content) => apply(title)(scripts)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu May 25 09:55:20 AEST 2017
                  SOURCE: /Users/clkaiser/IdeaProjects/ck-tam-assignment/app/views/main.scala.html
                  HASH: 36483984cb84c2d2686364be8bc44a72a79a8805
                  MATRIX: 753->1|893->46|921->48|1437->537|1452->543|1514->584|1598->641|1613->647|1674->686|3055->2040|3083->2047|3117->2054|3204->2114|3219->2120|3272->2152|3329->2182|3344->2188|3405->2228|3676->2473|3704->2480|3735->2484
                  LINES: 27->1|32->1|34->3|44->13|44->13|44->13|45->14|45->14|45->14|74->43|74->43|75->44|78->47|78->47|78->47|79->48|79->48|79->48|82->51|82->51|84->53
                  -- GENERATED --
              */
          