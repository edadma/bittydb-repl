package ca.hyperreal.bittydbrepl

import funl.REPL
import ca.hyperreal.bittydb._


object Main extends App {
	REPL.start( Iterator(
		"""Welcome to the BittyDB Shell"""
		) )
}