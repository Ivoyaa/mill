import mill.Agg
import mill.scalalib._

trait JUnitTests extends TestModule.Junit4 {

  /**
   * Overriden ivyDeps Docs!!!
   */
  def ivyDeps = Agg(ivy"com.novocode:junit-interface:0.11")
  def task = T {
    "???"
  }
}

/**
 * The Core Module Docz!
 */
object core extends JavaModule {
  object test extends Tests with JUnitTests

  /**
   * Core Target Docz!
   */
  def target = T {
    import collection.JavaConverters._
    println(this.getClass.getClassLoader.getResources("scalac-plugin.xml").asScala.toList)
    "Hello!"
  }
}
