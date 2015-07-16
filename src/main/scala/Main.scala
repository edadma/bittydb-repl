package ca.hyperreal.bittydbrepl

import funl.REPL
import ca.hyperreal.bittydb._


object Main extends App {
	REPL.start(
		"""	|native ca.hyperreal.bittydb.Connection
			|
			|$out.println( 'Welcome to the BittyDB Shell' )
			|$out.println()
			|
			|db = Connection.mem()
			|""".stripMargin, false )
}