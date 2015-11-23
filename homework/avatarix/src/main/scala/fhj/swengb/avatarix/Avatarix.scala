package fhj.swengb.avatarix


import javafx.application.Application
import javafx.scene.shape.{CubicCurveTo, MoveTo, Path}
import javafx.stage.Stage

//import scala.concurrent.duration._
import java.awt.Button
import java.beans.EventHandler
import java.net.URL
import java.rmi.activation.ActivationGroup_Stub
import java.util.ResourceBundle
import javafx.animation._
import javafx.application.Application
import javafx.fxml.{FXML, FXMLLoader, Initializable}
import javafx.scene.text
import javafx.scene.control.Label
import javafx.scene.image.{Image, ImageView}
import javafx.scene.layout.{AnchorPane, GridPane, BorderPane}
import javafx.scene.{Parent, Scene}
import javafx.stage.Stage
import javafx.util.Duration







import com.sun.javaws.jnl.JavaFXAppDesc
import fhj.swengb.{Students, Speakers}

//import scala.concurrent.duration.Duration
import scala.util.control.NonFatal

object Avatarix {
  def main(args: Array[String]) {
    Application.launch(classOf[Avatarix], args: _*)
  }
}

class Avatarix extends javafx.application.Application {


  val Fxml = "/fhj/swengb/avatarix/Avatarix.fxml"
  val Css = "fhj/swengb/avatarix/Avatarix.css"

  val loader = new FXMLLoader(getClass.getResource(Fxml))

  override def start(stage: Stage): Unit =
    try {
      stage.setTitle("Avatarix")
      loader.load[Parent]() // side effect
      val scene = new Scene(loader.getRoot[Parent])
      stage.setScene(scene)
      //stage.getScene.getStylesheets.add(Css)
      stage.show()
    } catch {
      case NonFatal(e) => e.printStackTrace()
    }

}












class AvatarixController extends Initializable {
  @FXML var scene1: BorderPane = _
  @FXML var user0f: ImageView = _
  @FXML var slideIn: AnchorPane= _
  @FXML var asterix: AnchorPane=_
  @FXML var button: Button =_
  @FXML var user1f: ImageView = _
  @FXML var user2f: ImageView = _
  @FXML var user3f: ImageView = _
  @FXML var user4f: ImageView = _
  @FXML var user5f: ImageView = _
  @FXML var user6f: ImageView = _
  @FXML var user7f: ImageView = _
  @FXML var user8f: ImageView = _
  @FXML var user9f: ImageView = _
  @FXML var user10f: ImageView = _
  @FXML var user11f: ImageView = _
  @FXML var username0: Label = _

  override def initialize(location: URL, resources: ResourceBundle): Unit = {
    val image0: String = Students.jblazevic.gitHubUser.avatarUrl.toString
    val image1: String = Students.mfuchs.gitHubUser.avatarUrl.toString
    val image2: String = Students.cfuerbahs.gitHubUser.avatarUrl.toString
    val image3: String = Students.fgraf.gitHubUser.avatarUrl.toString
    val image4: String = Students.thasenbichler.gitHubUser.avatarUrl.toString
    val image5: String = Students.cherzog.gitHubUser.avatarUrl.toString
    val image6: String = Students.ekarimova.gitHubUser.avatarUrl.toString
    val image7: String = Students.pkoerner.gitHubUser.avatarUrl.toString
    val image8: String = Students.alichtenegger.gitHubUser.avatarUrl.toString
    val image9: String = Students.pnguyen.gitHubUser.avatarUrl.toString
    val image10: String = Students.aschneider.gitHubUser.avatarUrl.toString
    val image11: String = Speakers.rladstaetter.gitHubUser.avatarUrl.toString

    user0f.setImage(new Image(image0))
    user1f.setImage(new Image(image1))
    user2f.setImage(new Image(image2))
    user3f.setImage(new Image(image3))
    user4f.setImage(new Image(image4))
    user5f.setImage(new Image(image5))
    user6f.setImage(new Image(image6))
    user7f.setImage(new Image(image7))
    user8f.setImage(new Image(image8))
    user9f.setImage(new Image(image9))
    user10f.setImage(new Image(image10))
    user11f.setImage(new Image(image11))

    val firstname0: String = Students.jblazevic.firstName.toString
    val lastname0: String = Students.jblazevic.secondName.toString
    username0.setText(firstname0 + "\n" + lastname0)
  }



  val xDif = 1;



  def animation(obj:AnchorPane):Unit =
  {
    Thread.sleep(30)
    obj.setTranslateX(obj.getTranslateX+xDif);
    if (obj.getTranslateX <=0) {animation(obj)}
    else {print(obj.getTranslateY.toString + obj.getTranslateY.toString)
    }
  }



  def anim(obj:AnchorPane, slideRight:Boolean):Unit = {
    var path: Path = new Path()
    path.getElements.add(new MoveTo(-800, 500))
    if (slideRight) {
      new MoveTo(-800, 500)
      path.getElements().add(new CubicCurveTo(40f, 500, 250f, 500, 300, 500))
    } else {
      new MoveTo(450, 500)
      path.getElements().add(new CubicCurveTo(450, 500, 390f, 500, 40, 500))
    }

      var pathTrans : PathTransition = new PathTransition()
      pathTrans.setDuration(new Duration(1000))
      pathTrans.setNode(obj)
      pathTrans.setPath(path)
      pathTrans.setAutoReverse(false)
      pathTrans.play()
  }


  def user0(): Unit = anim(slideIn,true)

  def user1(): Unit = println("user1")

  def user2(): Unit = println("user2")

  def user3(): Unit = println("user3")

  def user4(): Unit = println("user4")

  def user5(): Unit = println("user5")

  def user6(): Unit = println("user6")

  def user7(): Unit = println("user7")

  def user8(): Unit = println("user8")

  def user9(): Unit = println("user9")

  def user10(): Unit = println("user10")

  def user11(): Unit = println("user11")



}