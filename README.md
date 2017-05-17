BittyDB REPL
============

Do a `git clone`, run `sbt` and type `run` at prompt to start REPL...

	Welcome to the BittyDB shell

	> db.test.insert( {a: 1, b: "asdf"}, {a: 2, b: "zxcv"} )

	> db.test.find( {} )
	res2 = [{"a": 1, "b": "asdf", "_id": 88e099af-ed65-48db-bf8c-ec1b2b836da3}, {"a": 2, "b": "zxcv", "_id": 9d64d664-1f99-4a70-afdd-ac59f1d29a9f}]

	> db.test.find( {a: {$lt: 2}} )
	res3 = [{"a": 1, "b": "asdf", "_id": 88e099af-ed65-48db-bf8c-ec1b2b836da3}]
