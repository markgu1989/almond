package jupyter.scala.config

import jupyter.kernel.config.Module
import jupyter.kernel.{KernelInfo, Kernel}

object ScalaModule extends Module {
  val scalaBinaryVersion = scala.util.Properties.versionNumberString.split('.').take(2).mkString(".")

  val kernelId = s"scala-$scalaBinaryVersion"
  val kernel = ScalaKernel
  val kernelInfo = KernelInfo(s"Scala $scalaBinaryVersion", "scala")

  def kernels: Map[String, (Kernel, KernelInfo)] =
    Map(kernelId -> (kernel, kernelInfo))
}