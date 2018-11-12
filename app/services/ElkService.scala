package services

import javax.inject.{Inject, Singleton}
import play.api.Configuration

/**
  * @author fangjie
  * @date Created in 5:51 PM 2018/11/12.
  */
@Singleton
class ElkService @Inject
(configuration: Configuration) {

  def url(): String = configuration.get[String]("elk.server")

}
