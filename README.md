gwen-web
========

Introduction
------------
Gwen web is an engine which allows teams to automate web browsers using 
language instead of code.  It aims to bring an interactive capability to
automation testing by providing users with an ability to verify commands 
and debug tests before committing them to an automation cycle.  
 
Once the tests have been confirmed, gwen web is able to run the tests 
sequentially or in parallel.  gwen web can be used to target different types
of browsers including Firefox, Chrome, IE and Safari.

Finally gwen web will create a summary report detailing the status of each 
test (passed and failed), the time taken to execute each step, screenshots 
on failures, current environment variables and meta information.

Gwen web is the first of many engines that has been powered by the 
[gwen](https://github.com/gwen-interpreter/gwen) interpreter


Key Features
------------
- Tests are written in plain English
- Tests can be run in batch mode or interactively
- Tests can be run sequentially or in parallel
- Interactive console allows verifying before running
- Cross Browser Support
- No coding
 
Sample Introductory Video
-------------------------
Here is a video that shows an example of gwen web automating over the [flood.io scripting challenge] (https://challengers.flood.io/start)
The video first shows batch mode (-b option) where it runs a command, parsing in a report 
location, and a directory (containing both a feature file and meta file).  Once triggered, 
the tests are executed in sequential order on a local chrome browser with a html report generated
at the end.  

Next the video shows gwen running in an interactive mode, enabling users to test locators 
by highlighting the elements in the browser as they type.

[![gwen web interactive demo](http://img.youtube.com/vi/ILgFtp4OrUI/0.jpg)](https://www.youtube.com/watch?v=ILgFtp4OrUI)


Cheat Sheet
----------------
Please see our [cheat sheet](doc/CHEATSHEET.md) for a list of commands and sample dsl statements




Core Requirements
-----------------

- Java 1.6 or later

Building and Installing from Source
-----------------------------------

Perform the following to build and install gwen-web: 

1. Download and install [Java SDK 1.6 or later](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 
   - Note Java 8 is not recommended at this time of writing
2. Download and install the latest [sbt](http://www.scala-sbt.org/) version
3. Either:
   - Download a [Git client](http://git-scm.com/downloads) and clone this 
     repository using one of the following (SSH or HTTPS) URLs: 
     - `git@github.com:gwen-interpreter/gwen-web.git`
     - `https://github.com/gwen-interpreter/gwen-web.git`
   - Or click the Download ZIP link on this GitHub project page to download 
     the source archive and extract it to a local folder  
4. Change to the directory where you cloned/downloaded the source and run 
   `sbt universal:package-bin` to build the distributable ZIP
   - This will create a _gwen-web-[version].zip_ file in the 
     _target/universal_ folder relative to your current directory
5. Extract the generated ZIP to a desired location on your local drive
   - This will create a project folder named _gwen-web-[version]_ in that 
     location
6. You are now ready to start using gwen-web!

Getting Started
---------------

See our [getting started](doc/START.md) user guide for a quick introduction 
and tutorial.

***

Mail Group
----------

All announcements and discussions are posted and broadcast to all members of 
the following mail group. You are welcome to visit and subscribe to receive 
notifications or get involved.

- [gwen-interpreter](https://groups.google.com/d/forum/gwen-interpreter) 

Contributions
-------------

New capabilities, improvements, and fixes are all valid candidates for 
contribution. Submissions can be made using pull requests. Each submission 
is reviewed and verified by the project's committer's before being integrated 
and released to the community. We ask that all code submissions include unit 
tests or sample test features providing relevant coverage.

By sending a pull request, we assume that you agree to release your work under 
the license that covers this software.

License
-------

Copyright 2014 Brady Wood, Branko Juric

This software is open sourced under the 
[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt).

See also: [LICENSE](LICENSE)

This project has dependencies on other open source projects, all of which are 
listed in the [NOTICE](NOTICE) file.
