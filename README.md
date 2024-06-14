\---springkafkamockedata-master
    |   .gitignore
    |   HELP.md
    |   mvnw
    |   mvnw.cmd
    |   pom.xml
    |
    +---.idea
    |   |   .gitignore
    |   |   compiler.xml
    |   |   dbnavigator.xml
    |   |   encodings.xml
    |   |   jarRepositories.xml
    |   |   misc.xml
    |   |   uiDesigner.xml
    |   |   vcs.xml
    |   |   workspace.xml
    |   |
    |   \---copilot
    |       \---chatSessions
    |           |   00000000000.xd
    |           |   xd.lck
    |           |
    |           \---blobs
    |                   version
    |
    +---.mvn
    |   \---wrapper
    |           maven-wrapper.jar
    |           maven-wrapper.properties
    |
    +---src
    |   +---main
    |   |   +---java
    |   |   |   \---com
    |   |   |       \---dominic
    |   |   |           \---automation
    |   |   |               \---springkafkamockdata
    |   |   |                   |   SpringkafkamockdataApplication.java
    |   |   |                   |
    |   |   |                   +---config
    |   |   |                   |       JacksonConfig.java
    |   |   |                   |       KafkaProducerConfig.java
    |   |   |                   |       UldCategoryDeserializer.java
    |   |   |                   |
    |   |   |                   +---controller
    |   |   |                   |       BatchDataController.java
    |   |   |                   |
    |   |   |                   +---model
    |   |   |                   |       Activity.java
    |   |   |                   |       ActivityDetails.java
    |   |   |                   |       BatchData.java
    |   |   |                   |       Station.java
    |   |   |                   |       UldCategory.java
    |   |   |                   |
    |   |   |                   +---producer
    |   |   |                   |       BatchDataProducer.java
    |   |   |                   |
    |   |   |                   \---service
    |   |   |                           BatchDataService.java
    |   |   |                           JsonFileReader.java
    |   |   |                           ScheduledTasksBatches.java
    |   |   |
    |   |   \---resources
    |   |       |   application.properties
    |   |       |   application.yml
    |   |       |
    |   |       \---data
    |   |               data1.json
    |   |               data2.json
    |   |               data3.json
    |   |               data4.json
    |   |               data5.json
    |   |               data6.json
    |   |
    |   \---test
    |       \---java
    |           \---com
    |               \---dominic
    |                   \---automation
    |                       \---springkafkamockdata
    |                               SpringkafkamockdataApplicationTests.java
    |
    \---target
        |   springkafkamockdata-0.0.1-SNAPSHOT.jar
        |   springkafkamockdata-0.0.1-SNAPSHOT.jar.original
        |
        +---classes
        |   |   application.properties
        |   |   application.yml
        |   |
        |   +---com
        |   |   \---dominic
        |   |       \---automation
        |   |           \---springkafkamockdata
        |   |               |   SpringkafkamockdataApplication.class
        |   |               |
        |   |               +---config
        |   |               |       JacksonConfig.class
        |   |               |       KafkaProducerConfig.class
        |   |               |       UldCategoryDeserializer.class
        |   |               |
        |   |               +---controller
        |   |               |       BatchDataController.class
        |   |               |
        |   |               +---model
        |   |               |       Activity.class
        |   |               |       ActivityDetails.class
        |   |               |       BatchData.class
        |   |               |       Station.class
        |   |               |       UldCategory.class
        |   |               |
        |   |               +---producer
        |   |               |       BatchDataProducer.class
        |   |               |
        |   |               \---service
        |   |                       BatchDataService.class
        |   |                       JsonFileReader.class
        |   |                       ScheduledTasksBatches.class
        |   |
        |   \---data
        |           data1.json
        |           data2.json
        |           data3.json
        |           data4.json
        |           data5.json
        |           data6.json
        |
        +---generated-sources
        |   \---annotations
        +---generated-test-sources
        |   \---test-annotations
        +---maven-archiver
        |       pom.properties
        |
        +---maven-status
        |   \---maven-compiler-plugin
        |       +---compile
        |       |   \---default-compile
        |       |           createdFiles.lst
        |       |           inputFiles.lst
        |       |
        |       \---testCompile
        |           \---default-testCompile
        |                   createdFiles.lst
        |                   inputFiles.lst
        |
        +---surefire-reports
        |       com.dominic.automation.springkafkamockdata.SpringkafkamockdataApplicationTests.txt
        |       TEST-com.dominic.automation.springkafkamockdata.SpringkafkamockdataApplicationTests.xml
        |
        \---test-classes
            \---com
                \---dominic
                    \---automation
                        \---springkafkamockdata
                                SpringkafkamockdataApplicationTests.class
