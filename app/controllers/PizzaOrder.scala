package controllers;
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.data.format.Formats._
import play.Logger;

//case class PizzaOrder(pizzaType: String, size: String, address: String)

object PizzaOrder extends Controller {

  final val pizzaForm = Form(
    tuple(
      "pizzaType" -> nonEmptyText(maxLength = 128),
      "size" -> nonEmptyText(maxLength = 128),
      "address" -> nonEmptyText(maxLength = 128)
    )
  )

  def showOrderForm = Action {
    Ok(views.html.pizza.orderform(pizzaForm))
  }


  def orderPizza = Action { implicit request =>
    pizzaForm.bindFromRequest.fold(
      errors => BadRequest,
      pizzaOrder => {
        Logger.info("Ordering pizza: " + pizzaOrder._1);
        // business order logic
        Redirect(routes.PizzaOrder.pizzaOrdered(pizzaOrder._1))
      }
    )
  }

  def pizzaOrdered(pizzaType: String) = Action {
    Ok(views.html.pizza.ordered(pizzaType))
  }



}