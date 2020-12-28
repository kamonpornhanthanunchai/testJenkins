# fnol-it
Automation testing repository for fnol-fe

# Execution
Execute by runner file or maven command "mvn clean verify -Dcucumber.options="--tags @tagname"" 

# Parallel Execution
Config profile in pom file and execute by maven command "mvn clean verify -Dserenity.batch.count=1 -Dserenity.batch.number=1 -P profilename" 

