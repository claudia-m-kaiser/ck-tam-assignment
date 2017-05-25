
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

     object payment_Scope1 {
import com.google.gson.Gson

class payment extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(clientToken:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*4.2*/scripts/*4.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""

    """),format.raw/*6.5*/("""<script src="https://js.braintreegateway.com/web/3.15.0/js/client.min.js"></script>
    <script src="https://js.braintreegateway.com/web/3.15.0/js/paypal-checkout.min.js"></script>
    <script src="https://www.paypalobjects.com/api/checkout.js" data-version-4></script>
    <script>
      $( document ).ready(function() """),format.raw/*10.38*/("""{"""),format.raw/*10.39*/("""
          """),format.raw/*11.11*/("""window.clientToken = """"),_display_(/*11.34*/clientToken),format.raw/*11.45*/("""";
      """),format.raw/*12.7*/("""}"""),format.raw/*12.8*/(""");

    </script>

""")))};
Seq[Any](format.raw/*3.22*/("""
"""),format.raw/*16.2*/("""

"""),_display_(/*18.2*/main("Payment",scripts)/*18.25*/ {_display_(Seq[Any](format.raw/*18.27*/("""
    """),format.raw/*19.5*/("""<div class="col-md-6 text-left">
        <div href="#address-form" id="address-form" class="row">
            <div class="col-md-12 text-left">
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
    <div class="col-md-6 text-left">
        <div class="row hidden" id="transactionResult">
            <div class="alert" id="payment-alert" role="alert"></div>
            <pre id="json"></pre>
        </div>
    </div>

""")))}),format.raw/*77.2*/("""
"""))
      }
    }
  }

  def render(clientToken:String): play.twirl.api.HtmlFormat.Appendable = apply(clientToken)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (clientToken) => apply(clientToken)

  def ref: this.type = this

}


}
}

/**/
object payment extends payment_Scope0.payment_Scope1.payment
              /*
                  -- GENERATED --
                  DATE: Thu May 25 23:22:21 AEST 2017
                  SOURCE: /Users/clkaiser/IdeaProjects/ck-tam-assignment/app/views/payment.scala.html
                  HASH: 2839b6013779c3fad2add996880989a80e73e0c6
                  MATRIX: 807->31|905->53|919->60|999->64|1031->70|1379->390|1408->391|1447->402|1497->425|1529->436|1565->445|1593->446|1652->51|1680->466|1709->469|1741->492|1781->494|1813->499|4749->3405
                  LINES: 30->3|34->4|34->4|36->4|38->6|42->10|42->10|43->11|43->11|43->11|44->12|44->12|49->3|50->16|52->18|52->18|52->18|53->19|111->77
                  -- GENERATED --
              */
          