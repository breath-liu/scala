package traitDemo

import java.time.LocalDate

trait TimeStampLogger extends ConsoleLoggger{
  val balance = 0

  override def log(log: String): Unit = {
    super.log(f"${LocalDate.now()} ")
  }
}
