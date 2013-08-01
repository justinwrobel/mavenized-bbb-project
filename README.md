# Mavenized-bbb-project

This is an example mavenized blackboard project that uses B2DeployTask to deploy to a blackboard instance.

Deploying is as easy as `mvn install antrun:run`

Compare one maven command with vanilla eclipse development:
 1. Export Project to war
 2. Navigate to blackboard
 3. Login
 4. Navigate to System Admin >  Building Blocks > Installed Tools > Upload Building Blocks
 5. Click Browse and then find the war file
 6. Click Submit

Finally, make depolyment even easier by Integrating maven with eclipse:
 1. Right click on the Project in the Project Explorer 
 2. Click `Run as` > `Maven Build	ALT+SHIFT+X, m`
 3. Type `install antrun:run` in the Goals field
 4. Click Run.

Then a simple `ALT+R, T, 1` will run the last maven invocation which makes reploys even easier!

NOTE: deploying using justplainwiley's b2deploy-task is dependent on (bb-starting-block-123.war)[https://behind.blackboard.com/s/developer/dlc/download.aspx?d=1335]

 


