package fhj.swengb.lectures.l03

import java.net.URL
import java.util.ResourceBundle
import javafx.application.Application
import javafx.fxml.{FXMLLoader, Initializable}
import javafx.scene.{Parent, Scene}
import javafx.stage.Stage

import scala.util.control.NonFatal

/**
  * A simple hello world example application
  * for JavaFX.
  */
object JavaFxCalculator {
  def main(args: Array[String]) {
    Application.launch(classOf[JavaFxCalculator], args: _*)
  }
}

class JavaFxCalculator extends javafx.application.Application {

  val Fxml = "/fhj/swengb/lectures/l03/Calculator.fxml"
  val Css = "fhj/swengb/lectures/l03/buttonstyles.css"

  val loader = new FXMLLoader(getClass.getResource(Fxml))

  override def start(stage: Stage): Unit =
    try {
      stage.setTitle("Calculator")
      loader.load[Parent]() // side effect
      val scene = new Scene(loader.getRoot[Parent])
      stage.setScene(scene)
      stage.getScene.getStylesheets.add(Css)
      stage.show()
    } catch {
      case NonFatal(e) => e.printStackTrace()
    }

}


class CalculatorController extends Initializable {

  override def initialize(location: URL, resources: ResourceBundle): Unit = {

  }

  def clear(): Unit = {
    println("cleared")
  }

  def plusminus(): Unit = {
    println("+/-")
  }

  def percent(): Unit = {
    println("%")
  }

  def divide(): Unit = {
    println("/")
  }

  def seven(): Unit = {
    println("7")
  }

  def eight(): Unit = {
    println("8")
  }

  def nine(): Unit = {
    println("9")
  }

  def multiply(): Unit = {
    println("x")
  }

  def four(): Unit = {
    println("4")
  }

  def five(): Unit = {
    println("5")
  }

  def six(): Unit = {
    println("6")
  }

  def minus(): Unit = {
    println("-")
  }

  def one(): Unit = {
    println("1")
  }

  def two(): Unit = {
    println("2")
  }

  def three(): Unit = {
    println("3")
  }

  def plus(): Unit = {
    println("+")
  }

  def zero(): Unit = {
    println("0")
  }

  def comma(): Unit = {
    println(".")
  }

  def equals(): Unit = {
    println("=")
  }

}