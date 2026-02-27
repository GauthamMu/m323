error id: 6092E81F5CDEADA72C3434B6C0C5BBC7
file://<WORKSPACE>/app.scala
### java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12

occurred in the presentation compiler.



action parameters:
uri: file://<WORKSPACE>/app.scala
text:
```scala
var Grid ``

```


presentation compiler configuration:
Scala version: 3.8.1-bin-nonbootstrapped
Classpath:
<WORKSPACE>/.scala-build/m323_d5c0a6989e/classes/main [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.8.1/scala3-library_3-3.8.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/3.8.1/scala-library-3.8.1.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/com/sourcegraph/semanticdb-javac/0.10.0/semanticdb-javac-0.10.0.jar [exists ], <WORKSPACE>/.scala-build/m323_d5c0a6989e/classes/main/META-INF/best-effort [missing ]
Options:
-Xsemanticdb -sourceroot <WORKSPACE> -Ywith-best-effort-tasty




#### Error stacktrace:

```
dotty.tools.pc.utils.InteractiveEnrichments$.adjust(InteractiveEnrichments.scala:141)
	dotty.tools.pc.PcSemanticTokensProvider$Collector$.collect(PcSemanticTokensProvider.scala:77)
	dotty.tools.pc.PcSemanticTokensProvider$Collector$.collect(PcSemanticTokensProvider.scala:64)
	dotty.tools.pc.PcCollector.dotty$tools$pc$PcCollector$$_$collect$1(PcCollector.scala:111)
	dotty.tools.pc.PcCollector.collectNamesWithParent$1(PcCollector.scala:151)
	dotty.tools.pc.PcCollector.$anonfun$11(PcCollector.scala:280)
	dotty.tools.pc.PcCollector$WithParentTraverser.traverse(PcCollector.scala:291)
	dotty.tools.pc.PcCollector$WithParentTraverser.traverse$$anonfun$1(PcCollector.scala:293)
	scala.collection.LinearSeqOps.foldLeft(LinearSeq.scala:186)
	scala.collection.LinearSeqOps.foldLeft$(LinearSeq.scala:38)
	scala.collection.immutable.List.foldLeft(List.scala:83)
	dotty.tools.pc.PcCollector$WithParentTraverser.traverse(PcCollector.scala:293)
	dotty.tools.pc.PcCollector$WithParentTraverser.traverse$$anonfun$1(PcCollector.scala:293)
	scala.collection.LinearSeqOps.foldLeft(LinearSeq.scala:186)
	scala.collection.LinearSeqOps.foldLeft$(LinearSeq.scala:38)
	scala.collection.immutable.List.foldLeft(List.scala:83)
	dotty.tools.pc.PcCollector$WithParentTraverser.traverse(PcCollector.scala:293)
	dotty.tools.pc.PcCollector$WithParentTraverser.traverse$$anonfun$1(PcCollector.scala:293)
	scala.collection.LinearSeqOps.foldLeft(LinearSeq.scala:186)
	scala.collection.LinearSeqOps.foldLeft$(LinearSeq.scala:38)
	scala.collection.immutable.List.foldLeft(List.scala:83)
	dotty.tools.pc.PcCollector$WithParentTraverser.traverse(PcCollector.scala:293)
	dotty.tools.pc.PcCollector$WithParentTraverser.traverse$$anonfun$1(PcCollector.scala:293)
	scala.collection.LinearSeqOps.foldLeft(LinearSeq.scala:186)
	scala.collection.LinearSeqOps.foldLeft$(LinearSeq.scala:38)
	scala.collection.immutable.List.foldLeft(List.scala:83)
	dotty.tools.pc.PcCollector$WithParentTraverser.traverse(PcCollector.scala:293)
	dotty.tools.pc.PcCollector$DeepFolderWithParent.apply(PcCollector.scala:299)
	dotty.tools.pc.PcCollector.traverseSought(PcCollector.scala:281)
	dotty.tools.pc.PcCollector.traverseSought$(PcCollector.scala:32)
	dotty.tools.pc.SimpleCollector.traverseSought(PcCollector.scala:354)
	dotty.tools.pc.PcCollector.resultAllOccurences(PcCollector.scala:44)
	dotty.tools.pc.PcCollector.resultAllOccurences$(PcCollector.scala:32)
	dotty.tools.pc.SimpleCollector.resultAllOccurences(PcCollector.scala:354)
	dotty.tools.pc.SimpleCollector.result(PcCollector.scala:359)
	dotty.tools.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:88)
	dotty.tools.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:158)
	scala.meta.internal.pc.CompilerAccess.withSharedCompiler(CompilerAccess.scala:149)
	scala.meta.internal.pc.CompilerAccess.$anonfun$1(CompilerAccess.scala:93)
	scala.meta.internal.pc.CompilerAccess.onCompilerJobQueue$$anonfun$1(CompilerAccess.scala:210)
	scala.meta.internal.pc.CompilerJobQueue$Job.run(CompilerJobQueue.scala:153)
	java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	java.base/java.lang.Thread.run(Thread.java:1583)
```
#### Short summary: 

java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12