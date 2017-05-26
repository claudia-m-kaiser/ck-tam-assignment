
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object payment_Scope0 {
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

class payment extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(clientToken:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.2*/scripts/*2.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.13*/("""

    """),format.raw/*4.5*/("""<script src="https://js.braintreegateway.com/web/3.15.0/js/client.min.js"></script>
    <script src="https://js.braintreegateway.com/web/3.15.0/js/paypal-checkout.min.js"></script>
    <script src="https://www.paypalobjects.com/api/checkout.js" data-version-4></script>
    <script>
      $( document ).ready(function() """),format.raw/*8.38*/("""{"""),format.raw/*8.39*/("""
          """),format.raw/*9.11*/("""window.clientToken = """"),_display_(/*9.34*/clientToken),format.raw/*9.45*/("""";
      """),format.raw/*10.7*/("""}"""),format.raw/*10.8*/(""");

    </script>

""")))};
Seq[Any](format.raw/*1.22*/("""
"""),format.raw/*14.2*/("""

"""),_display_(/*16.2*/main("Payment",scripts)/*16.25*/ {_display_(Seq[Any](format.raw/*16.27*/("""
    """),format.raw/*17.5*/("""<div class="row">
        <div class="col-md-6 text-left">
            <div href="#address-form" id="address-form" class="row">
                <div class="col-md-12 text-left">
                    <h5>Please enter your shipping details</h5>
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
                                <button type="button" id="form-button" class="btn btn-success" data-button-action="payment">Continue to payment</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-md-6 text-left">
            <div class="row hidden" id="transactionResult">
                <div class="col-md-12">
                    <div class="alert" id="payment-alert" role="alert"></div>
                    <pre id="json"></pre>
                </div>
            </div>
        </div>
    </div>
    <hr>
    <div class="row hidden" href="#payment" id="payment">
        <div class="col-md-4 text-left">
            <h5>Please click the PayPal button to complete your payment</h5>
            <i class="fa fa-spinner fa-spin fa-3x fa-fw" id="loading-paypal-spinner"></i>
            <div id="paypal-button"> </div>
        </div>
        <div class="col-md-8 text-left">
            <div class="panel panel-success">
                <div class="panel-heading">
                    <h3 class="panel-title">Simulate a successful transaction on Sandbox</h3>
                </div>
                <div class="panel-body">
                    <strong>Email: </strong>jane.doe@email.xyz<br>
                    <strong>Password: </strong>qwer1234
                </div>
            </div>
            <div class="panel panel-danger">
                <div class="panel-heading">
                    <h3 class="panel-title">Simulate an instrument decline on Sandbox</h3>
                </div>
                <div class="panel-body">
                        <strong>Email: </strong>CCREJECT-REFUSED_AU@paypal.com<br>
                        <strong>Password: </strong>qwer1234</p>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*99.2*/("""
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
object payment extends payment_Scope0.payment
              /*
                  -- GENERATED --
                  DATE: Fri May 26 23:33:19 AEST 2017
                  SOURCE: /Users/clkaiser/IdeaProjects/ck-tam-assignment/app/views/payment.scala.html
                  HASH: bd151d986cab1fdc96c23f0f57873835a49651a4
                  MATRIX: 749->1|847->23|861->30|941->34|973->40|1320->360|1348->361|1386->372|1435->395|1466->406|1502->415|1530->416|1589->21|1617->436|1646->439|1678->462|1718->464|1750->469|5899->4590
                  LINES: 27->1|31->2|31->2|33->2|35->4|39->8|39->8|40->9|40->9|40->9|41->10|41->10|46->1|47->14|49->16|49->16|49->16|50->17|132->99
                  -- GENERATED --
              */
          