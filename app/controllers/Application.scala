package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  def about = Action {
    Ok(views.html.about());
  }

  def requirements = Action {
    Ok(views.html.requirements())
  }

  def types_of_loans = Action {
    Ok(views.html.types_of_loans())
  }

  def contacts = Action {
    Ok(views.html.contacts())
  }
}