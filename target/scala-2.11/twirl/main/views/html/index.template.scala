
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
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
      <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <title>PayPal Express Checkout</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.55*/routes/*13.61*/.Assets.versioned("images/favicon.png")),format.raw/*13.100*/("""">
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
        <div href="#address-form" id="address-form" class="row">
          <div class="col-md-8 text-left">
            <h4>Please enter your shipping details</h4>
            <form class="form-horizontal">
              <div class="form-group">
                <label for="name" class="col-sm-2 control-label">Full name</label>
                <div class="col-sm-6">
                  <input type="text" class="form-control" id="name" value="Jane Doe">
                </div>
              </div>
              <div class="form-group">
                <label for="streetAddress" class="col-sm-2 control-label">Street address</label>
                <div class="col-sm-6">
                  <input type="text" class="form-control" id="streetAddress" value="1 York Street">
                </div>
              </div>
              <div class="form-group">
                <label for="suburb" class="col-sm-2 control-label">Suburb</label>
                <div class="col-sm-6">
                  <input type="text" class="form-control" id="suburb" value="Sydney">
                </div>
              </div>
              <div class="form-group">
                <label for="postcode" class="col-sm-2 control-label">Postcode</label>
                <div class="col-sm-6">
                  <input type="text" class="form-control" id="postcode" value="2011">
                </div>
              </div>
              <div class="form-group">
                <label for="state" class="col-sm-2 control-label">State</label>
                <div class="col-sm-6">
                  <input type="text" class="form-control" id="state" value="NSW">
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                  <button id="continue-to-payment" class="btn btn-default">Continue to payment</button>
                </div>
              </div>
            </form>
            <hr>
            <div class="row hidden" href="#payment" id="payment">
              <div class="col-md-8 text-left">
                <h4>Please click the PayPal button to complete your payment</h4>
                <div class="col-sm-offset-2 col-sm-6" id="paypal-button"> </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <script type="text/javascript" src=""""),_display_(/*94.42*/routes/*94.48*/.HomeController.javascriptRoutes),format.raw/*94.80*/(""""></script>
    <script src=""""),_display_(/*95.19*/routes/*95.25*/.Assets.versioned("javascripts/main.js")),format.raw/*95.65*/("""" type="text/javascript"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script src="https://js.braintreegateway.com/web/3.15.0/js/client.min.js"></script>
    <script src="https://js.braintreegateway.com/web/3.15.0/js/paypal-checkout.min.js"></script>
    <script src="https://www.paypalobjects.com/api/checkout.js" data-version-4></script>

    <script>
      $( document ).ready(function() """),format.raw/*102.38*/("""{"""),format.raw/*102.39*/("""
          """),format.raw/*103.11*/("""$("#continue-to-payment").click(function()"""),format.raw/*103.53*/("""{"""),format.raw/*103.54*/("""
                """),format.raw/*104.17*/("""event.preventDefault();
                if(!addressFormIsValid())"""),format.raw/*105.42*/("""{"""),format.raw/*105.43*/("""
                  """),format.raw/*106.19*/("""alert("Please fill in your address details");
                """),format.raw/*107.17*/("""}"""),format.raw/*107.18*/("""else"""),format.raw/*107.22*/("""{"""),format.raw/*107.23*/("""
                  """),format.raw/*108.19*/("""loadPayPalButton(""""),_display_(/*108.38*/clientToken),format.raw/*108.49*/("""");
                  $("#payment").removeClass('hidden');
                  document.location.href="#payment";
                """),format.raw/*111.17*/("""}"""),format.raw/*111.18*/("""

          """),format.raw/*113.11*/("""}"""),format.raw/*113.12*/(""");
      """),format.raw/*114.7*/("""}"""),format.raw/*114.8*/(""");
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
                  DATE: Wed May 24 22:56:36 AEST 2017
                  SOURCE: /Users/clkaiser/IdeaProjects/ck-tam-assignment/app/views/index.scala.html
                  HASH: 351eb52c4caa549691f04502e18e683e537ecf3c
                  MATRIX: 745->1|860->21|887->22|1403->511|1418->517|1480->558|1564->615|1579->621|1640->660|5390->4383|5405->4389|5458->4421|5515->4451|5530->4457|5591->4497|6184->5061|6214->5062|6254->5073|6325->5115|6355->5116|6401->5133|6495->5198|6525->5199|6573->5218|6664->5280|6694->5281|6727->5285|6757->5286|6805->5305|6852->5324|6885->5335|7042->5463|7072->5464|7113->5476|7143->5477|7180->5486|7209->5487
                  LINES: 27->1|32->1|33->2|43->12|43->12|43->12|44->13|44->13|44->13|125->94|125->94|125->94|126->95|126->95|126->95|133->102|133->102|134->103|134->103|134->103|135->104|136->105|136->105|137->106|138->107|138->107|138->107|138->107|139->108|139->108|139->108|142->111|142->111|144->113|144->113|145->114|145->114
                  -- GENERATED --
              */
          