# magicdraw-maven
Magicdraw maven multimodule example

The following example provides a template for magicdraw plugin development using maven.

# Configuration

## Configurate Magicdraw path

To setup the Magicdraw/Cameo modeler folder, set magicdraw.home property in pom.xml

`<magicdraw.home>E:/Programs/Cameo</magicdraw.home>`

## Add a new plugin

To add a new plugin 
  - create a new maven module
  - re-use the pom.xml from folder plugin1
  - extend the list of modules in the parent pom  

# Building

 - Install maven
 - Execute `mvn package`

## Known limitations

The build must be tailored to local install. It might happen, that the jar file's name is different because
of the different versions used in the various no magic products.
