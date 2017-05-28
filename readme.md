# Claudia Kaiser TAM Assignment

This application is a simple Express Checkout integration.
It includes the following Express Checkout features

a) One-time Payment
For simplicity, I am creating all transactions with a hard coded amount of 1.00 AUD

b) Shipping Address Override 
The page includes an address form. The address details must be entered before proceeding to the payment.
I am doing very basic validation on this form. Fields that have a value of over 2 characters are considered valid.

c) Instrument decline Error Handling 
If there is an instrument decline error, the PayPal payment flow will be restarted. See testing section for Sandbox test account.

This application is running live on Heroku.
[https://ck-tam-assignment.herokuapp.com/](https://ck-tam-assignment.herokuapp.com/)

If you would like to install this application locally, please refer to the instructions in this README.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

You will need to install the following:
* [JDK](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html)
* [SBT](http://www.scala-sbt.org/0.13/docs/Setup.html) 

### Installing

Go to the project folder and run the following command

```
sbt run
```

You will see the following output. The application will run on port 9000 on localhost.
```
--- (Running the application, auto-reloading is enabled) ---

[info] p.c.s.NettyServer - Listening for HTTP on /0:0:0:0:0:0:0:0:9000

(Server started, use Ctrl+D to stop and go back to the console...)
```

## Testing values

To simulate a successful transaction, you can use this Sandbox account.

```
Email: jane.doe@email.xyz
Password: qwer1234
```

To simulate an instrument decline you can use this Sandbox account. It has been set up to trigger an instrument decline.

```
Email: CCREJECT-REFUSED_AU@paypal.com
Password: qwer1234
```

## Built With

* Back-end - Java and [Play Framework](https://www.playframework.com/)
* Front-end - [Bootstrap](http://getbootstrap.com/) and [FontAwesome](http://fontawesome.io/)

## Author

Claudia Kaiser

