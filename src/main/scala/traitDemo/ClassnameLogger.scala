package traitDemo

trait ClassnameLogger extends ConsoleLoggger{
  val classname = "name"

  override def log(log: String): Unit = super.log(f"${getClass} $log")
}
