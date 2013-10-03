# Autostart Developer VM

    cd /etc/init.d
    wget https://raw.github.com/justinwrobel/mavenized-bbb-project/master/docs/blackboard -O /etc/init.d/blackboard
    chmod +x /etc/init.d/blackboard
    chkconfig \--add blackboard
finally, either restart or type `service blackboard start` and blackboard should start up.

##Sources & Inspiration
 * http://www.edugarage.com/display/BBDN/Installing+Oracle+and+Blackboard+on+Centos
 * https://help.blackboard.com/en-us/Learn/9.1_SP_12_and_SP_13/Administrator/230_Developer_Resources/Developer_Virtual_Machine
