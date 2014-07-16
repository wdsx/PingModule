import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

import play.api.test._
import play.api.test.Helpers._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
@RunWith(classOf[JUnitRunner])
class PingSpec extends Specification {

  "Application" should {
    "return 200 on ping" in new WithApplication{
      val home = route(FakeRequest(GET, "/ping")).get

      status(home) must equalTo(OK)
    }
  }
}
