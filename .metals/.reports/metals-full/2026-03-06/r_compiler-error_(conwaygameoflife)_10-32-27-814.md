error id: 068E4A7881075D5F98A8D5028029126F
file://<WORKSPACE>/conwaygameoflife/src/main/scala/conwaygameoflife/ConwayGameOfLife.scala
### scala.reflect.internal.FatalError: 
  ThisType(method setupCounter) for sym which is not a class
     while compiling: file://<WORKSPACE>/conwaygameoflife/src/main/scala/conwaygameoflife/ConwayGameOfLife.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.12.20
    compiler version: version 2.12.19
  reconstructed args: -classpath <WORKSPACE>/conwaygameoflife/.bloop/conwaygameoflife/bloop-bsp-clients-classes/classes-Metals-hzqNHJU5RbenwTvHAiiVaw==:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/sourcegraph/semanticdb-javac/0.11.2/semanticdb-javac-0.11.2.jar:<HOME>/.sbt/boot/scala-2.12.19/lib/scala-library.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Ident(_CURSOR_element)
       tree position: line 44 of file://<WORKSPACE>/conwaygameoflife/src/main/scala/conwaygameoflife/ConwayGameOfLife.scala
            tree tpe: <error>
              symbol: value <error: <none>>
   symbol definition: val <error: <none>>: <error> (a TermSymbol)
      symbol package: livechart
       symbol owners: value <error: <none>> -> value <local Main> -> object Main
           call site: <none> in <none>

== Source file context for tree position ==

    41 
    42 		def setCounter(count: Int): Unit =
    43 			counter = count
    44 			_CURSOR_element.innerHTML = s"count is $counter"
    45 
    46 		element.addEventListener("click", e => setCounter(counter + 1))
    47 		setCounter(0)

occurred in the presentation compiler.



action parameters:
offset: 1069
uri: file://<WORKSPACE>/conwaygameoflife/src/main/scala/conwaygameoflife/ConwayGameOfLife.scala
text:
```scala
package livechart

import scala.scalajs.js
import scala.scalajs.js.annotation.*

import org.scalajs.dom

object Main {

	// import javascriptLogo from "/javascript.svg"
	@js.native @JSImport("/javascript.svg", JSImport.Default)
	val javascriptLogo: String = js.native

	@main
	def LiveChart(): Unit =
		dom.document.querySelector("#app").innerHTML = s"""
			<div>
				<a href="https://vitejs.dev" target="_blank">
					<img src="/vite.svg" class="logo" alt="Vite logo" />
				</a>
				<a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank">
					<img src="$javascriptLogo" class="logo vanilla" alt="JavaScript logo" />
				</a>
				<h1>Hello Scala.js!</h1>
				<div class="card">
					<button id="counter" type="button"></button>
				</div>
				<p class="read-the-docs">
					Click on the Vite logo to learn more
				</p>
			</div>
		"""

		setupCounter(dom.document.getElementById("counter"))
	end LiveChart

	def setupCounter(element: dom.Element): Unit {
		var counter = 0
	}
		

		def setCounter(count: Int): Unit =
			counter = count
			@@element.innerHTML = s"count is $counter"

		element.addEventListener("click", e => setCounter(counter + 1))
		setCounter(0)
	end setupCounter

}
```


presentation compiler configuration:
Scala version: 2.12.19
Classpath:
<WORKSPACE>/conwaygameoflife/.bloop/conwaygameoflife/bloop-bsp-clients-classes/classes-Metals-hzqNHJU5RbenwTvHAiiVaw== [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/sourcegraph/semanticdb-javac/0.11.2/semanticdb-javac-0.11.2.jar [exists ], <HOME>/.sbt/boot/scala-2.12.19/lib/scala-library.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb




#### Error stacktrace:

```
scala.reflect.internal.Reporting.abort(Reporting.scala:69)
	scala.reflect.internal.Reporting.abort$(Reporting.scala:65)
	scala.reflect.internal.SymbolTable.abort(SymbolTable.scala:28)
	scala.reflect.internal.Types$ThisType.<init>(Types.scala:1193)
	scala.reflect.internal.Types$UniqueThisType.<init>(Types.scala:1213)
	scala.reflect.internal.Types$ThisType$.apply(Types.scala:1217)
	scala.meta.internal.pc.AutoImportsProvider$$anonfun$1.applyOrElse(AutoImportsProvider.scala:108)
	scala.meta.internal.pc.AutoImportsProvider$$anonfun$1.applyOrElse(AutoImportsProvider.scala:90)
	scala.collection.immutable.List.collect(List.scala:315)
	scala.meta.internal.pc.AutoImportsProvider.autoImports(AutoImportsProvider.scala:90)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$autoImports$1(ScalaPresentationCompiler.scala:399)
	scala.meta.internal.pc.CompilerAccess.retryWithCleanCompiler(CompilerAccess.scala:182)
	scala.meta.internal.pc.CompilerAccess.$anonfun$withSharedCompiler$1(CompilerAccess.scala:155)
	scala.Option.map(Option.scala:230)
	scala.meta.internal.pc.CompilerAccess.withSharedCompiler(CompilerAccess.scala:154)
	scala.meta.internal.pc.CompilerAccess.$anonfun$withInterruptableCompiler$1(CompilerAccess.scala:92)
	scala.meta.internal.pc.CompilerAccess.$anonfun$onCompilerJobQueue$1(CompilerAccess.scala:209)
	scala.meta.internal.pc.CompilerJobQueue$Job.run(CompilerJobQueue.scala:152)
	java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	java.base/java.lang.Thread.run(Thread.java:1583)
```
#### Short summary: 

scala.reflect.internal.FatalError: 
  ThisType(method setupCounter) for sym which is not a class
     while compiling: file://<WORKSPACE>/conwaygameoflife/src/main/scala/conwaygameoflife/ConwayGameOfLife.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.12.20
    compiler version: version 2.12.19
  reconstructed args: -classpath <WORKSPACE>/conwaygameoflife/.bloop/conwaygameoflife/bloop-bsp-clients-classes/classes-Metals-hzqNHJU5RbenwTvHAiiVaw==:<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/sourcegraph/semanticdb-javac/0.11.2/semanticdb-javac-0.11.2.jar:<HOME>/.sbt/boot/scala-2.12.19/lib/scala-library.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Ident(_CURSOR_element)
       tree position: line 44 of file://<WORKSPACE>/conwaygameoflife/src/main/scala/conwaygameoflife/ConwayGameOfLife.scala
            tree tpe: <error>
              symbol: value <error: <none>>
   symbol definition: val <error: <none>>: <error> (a TermSymbol)
      symbol package: livechart
       symbol owners: value <error: <none>> -> value <local Main> -> object Main
           call site: <none> in <none>

== Source file context for tree position ==

    41 
    42 		def setCounter(count: Int): Unit =
    43 			counter = count
    44 			_CURSOR_element.innerHTML = s"count is $counter"
    45 
    46 		element.addEventListener("click", e => setCounter(counter + 1))
    47 		setCounter(0)