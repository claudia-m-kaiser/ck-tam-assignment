
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(clientToken:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
  <head>
    <title>PayPal Express Checkout</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*6.50*/routes/*6.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*6.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.55*/routes/*7.61*/.Assets.versioned("images/favicon.png")),format.raw/*7.100*/("""">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  </head>
  <body>
    <div class="container">
      <div href="#payment" id="payment" class="row">
        <div class="col-md-8 text-left">
          <p>Please enter your shipping details</p>
          <form class="form-horizontal">
            <div class="form-group">
              <label for="inputFullName" class="col-sm-2 control-label">Full name</label>
              <div class="col-sm-6">
                <input type="text" class="form-control" id="inputFullName" placeholder="Full name">
              </div>
            </div>
            <div class="form-group">
              <label for="inputStreetAddress" class="col-sm-2 control-label">Street address</label>
              <div class="col-sm-6">
                <input type="text" class="form-control" id="inputStreetAddress" placeholder="Street address">
              </div>
            </div>
            <div class="form-group">
              <label for="inputStreetAddress" class="col-sm-2 control-label">Street address</label>
              <div class="col-sm-6">
                <input type="text" class="form-control" id="inputStreetAddress" placeholder="Street address">
              </div>
            </div>
            <div class="form-group">
              <label for="inputSuburb" class="col-sm-2 control-label">Suburb</label>
              <div class="col-sm-6">
                <input type="text" class="form-control" id="inputSuburb" placeholder="Suburb">
              </div>
            </div>
            <div class="form-group">
              <label for="inputPostcode" class="col-sm-2 control-label">Postcode</label>
              <div class="col-sm-6">
                <input type="text" class="form-control" id="inputPostcode" placeholder="Postcode">
              </div>
            </div>
            <div class="form-group">
              <label for="inputState" class="col-sm-2 control-label">State</label>
              <div class="col-sm-6">
                <input type="text" class="form-control" id="inputState" placeholder="State">
              </div>
            </div>
            <div class="form-group">
              <div class="col-sm-offset-2 col-sm-6" id="paypal-button">
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>

    <script type="text/javascript" src=""""),_display_(/*62.42*/routes/*62.48*/.HomeController.javascriptRoutes),format.raw/*62.80*/(""""></script>
    <script src=""""),_display_(/*63.19*/routes/*63.25*/.Assets.versioned("javascripts/main.js")),format.raw/*63.65*/("""" type="text/javascript"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script src="https://js.braintreegateway.com/web/3.15.0/js/client.min.js"></script>
    <script src="https://js.braintreegateway.com/web/3.15.0/js/paypal-checkout.min.js"></script>
    <script src="https://www.paypalobjects.com/api/checkout.js" data-version-4></script>

    <script>
      $( document ).ready(function() """),format.raw/*70.38*/("""{"""),format.raw/*70.39*/("""
          """),format.raw/*71.11*/("""loadPayPalButton(""""),_display_(/*71.30*/clientToken),format.raw/*71.41*/("""");
      """),format.raw/*72.7*/("""}"""),format.raw/*72.8*/(""");
    </script>
  </body>
</html>
"""))
      }
    }
  }

  def render(clientToken:String): play.twirl.api.HtmlFormat.Appendable = apply(clientToken)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (clientToken) => apply(clientToken)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue May 23 20:13:32 AEST 2017
                  SOURCE: /Users/clkaiser/IdeaProjects/ck-tam-assignment/app/views/index.scala.html
                  HASH: 7f77334e193c2ba153cfa4bd6e1f837111ad63bf
                  MATRIX: 745->1|860->21|887->22|1047->156|1061->162|1122->203|1205->260|1219->266|1279->305|3936->2935|3951->2941|4004->2973|4061->3003|4076->3009|4137->3049|4729->3613|4758->3614|4797->3625|4843->3644|4875->3655|4912->3665|4940->3666
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|38->7|38->7|38->7|93->62|93->62|93->62|94->63|94->63|94->63|101->70|101->70|102->71|102->71|102->71|103->72|103->72
                  -- GENERATED --
              */
          