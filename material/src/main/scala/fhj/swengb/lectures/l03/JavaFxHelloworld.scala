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
object JavaFxHelloworld {
  def main(args: Array[String]) {
    Application.launch(classOf[JavaFxHelloworld], args: _*)
  }
}

class JavaFxHelloworld extends javafx.application.Application {

  val Fxml = "/fhj/swengb/lectures/l03/Helloworld.fxml"
  val Css = "fhj/swengb/lectures/l03/buttonstyles.css"

  val loader = new FXMLLoader(getClass.getResource(Fxml))

  override def start(stage: Stage): Unit =
    try {
      stage.setTitle("Helloworld")
      loader.load[Parent]() // side effect
      val scene = new Scene(loader.getRoot[Parent])
      stage.setScene(scene)
      stage.getScene.getStylesheets.add(Css)
      stage.show()
    } catch {
      case NonFatal(e) => e.printStackTrace()
    }

}


class HelloworldController extends Initializable {

  override def initialize(location: URL, resources: ResourceBundle): Unit = {

  }

  def clicked(): Unit = {
    println("clicked")
  }

  def one(): Unit = print("1")
  def two(): Unit = print("2")
  def three(): Unit = print("3")
  def four(): Unit = print("4")
  def five(): Unit = print("5")
  def six(): Unit = print("6")
  def seven(): Unit = print("7")
  def eight(): Unit = print("8")
  def nine(): Unit = print("9")
  def zero(): Unit = print("0")
  def plus(): Unit = print("+")
  def minus(): Unit = print("-")
  def divide(): Unit = print("/")
  def multiply(): Unit = print("*")
  def percent(): Unit = print("/%")
  def equals(): Unit = print("=")
  def dot(): Unit = print(".")
  def clear(): Unit = print("C")
  def plusminus(): Unit = print("+/-")
}