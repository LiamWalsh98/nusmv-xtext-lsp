## VSCode Plugin

This is the backend source of the [NuSMV VSCode Extension](https://marketplace.visualstudio.com/items?itemName=LiamWalsh98.vscode-nusmv)

## Nuseen

This plugin makes use of the xtext grammar used [nuseen](http://nuseen.sourceforge.net/), the Eclipse NuSMV model checker. 

## Build from source

To build, run `./gradlew shadowJar`

To run on a localhost jetty server, run `./gradlew jettyRun` and navigate to http://localhost:8080 on a web browser
