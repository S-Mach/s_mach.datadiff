package s_mach.datadiff

import scala.reflect.macros.blackbox

package object impl {
  def mkDataDiffImpl[A:c.WeakTypeTag,P:c.WeakTypeTag](
    c: blackbox.Context
  ) : c.Expr[DataDiff[A,P]] = {
    import c.universe._
    val builder = DataDiffMacroBuilder(c)
    // TODO: why is this cast necessary?
    builder.build[A,P]().asInstanceOf[c.Expr[DataDiff[A,P]]]
  }
}
