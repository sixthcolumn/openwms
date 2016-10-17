# notes about building this project

1. The key is the wsimport command, which exists somewhere under /usr/java...
   It generates java classes by reading the wsdl files from a currently running webserver
   Check the generate-sources section of the pom file for how to gen sources

   You shouldn't need to run generate-sources, as I've saved the java files it creates
   into the git repo. Just fyi
   
