package xyz.hyperreal.bittydbrepl

import funl.REPL


object Main extends App {
	REPL.start(
		"""
			|native xyz.hyperreal.bittydb.Connection
			|
			|$out.println( 'Welcome to the BittyDB shell' )
			|$out.println()
			|
			|db = Connection.mem()
			|
		""".stripMargin, false, false, false, false )
}