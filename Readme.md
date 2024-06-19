=============== Phani Soft Tech ================

Project Name: Student Portal
Web application which connected with mysql...

Steps for project clone :

1. In File Manager, Create a folder named Git_Project_Workspace then open this folder and create two more folders named Student_Portal_Workspace and Student_Portal_Local_Storage.

2. Now open eclipse, browse url location to Student_Portal_Workspace.
   (or)
   If you already in eclipse then click file then select switch workspace then click others then browse url location to Student_Portal_Workspace.

3. After opening eclipse, click on the file then select import then extend git folder then select projects from git then click next then select clone URI then click next then in the location section paste this URI "https://github.com/phanisofttech/student-portal.git" in the URI text box and in the authentication section give your github username and password then click next.

4. Next it shows master branch then click next, then browse into Student_Portal_Local_Storage folder then click next then its clones and shows working tree then click next then click finish.

5. Now student_portal project will imported successfully. 

6. In servers tab, if no servers are available then click the below link to create a new server. After clicking the link extend apache folder and select the tomcat v10.1 server then click next then browse into tomcat installation directory(until you see the bin folder or root directory) then click next then finish. Now tomcat server added successfully in the servers tab.

7. In the project explorer, right click on the student_portal project then select properties(at last) then click on project facets(at left side) in that select the check boxes named as Dynamic Web Module, Java and JavaScript then at right side click runtimes in that select the check box named apache tomcat v10.1 then click on apply and close.

8. (At down) Open terminal (At right side) click on computer icon in that choose terminal as local terminal then click ok. Now maximize the terminal, then to connect into mysql use this command 'mysql -uroot -p' then cick enter then enter your mysql password. Now, check the existing databases by using the command 'show databases;' .
Now, you will see the all databases in your mysql, if the database named 'student_portal' exists then use the command to drop this database, use the command 'drop database student_portal;'. then use the command 'exit;'. It will display bye.

9. In the terminal, use the command mysql -u root -p student_portal < "url"
In the place of url do the following steps to get the url
* In eclipse, expand student_portal project in that extend db folder in that you will find student_portal.sql file then right click on it, then select properties in that you see the location. Copy the url which is in the location text box, then click on cancel. Now go to present working terminal then paste that copied url in the place of url in the above command. Then click enter, now enter your mysql password then click enter. Now connect into mysql (refer 8th point if you forgot the commands) then check the existing databases. If you will find the student_portal database then student_portal database will be successfully imported into your mysql.

10. Now open eclipse, then extend student_portal project. Then extend src folder then extend main then extend webapp in that extend resources folder in that open db_credentials.properties file in that replace the database_password as your mysql password. Save it. Then right click on the db_credentials.properties file then select properties in that copy the url which is in the location text box, then click cancel. Then open util package which is located at Java Resources in that open the DatabaseConnection.java file. In this file at 37th line replace the url which is copied before. save it. (To save all files use the short key named ctrl+shift+s)

11. Then right click on the student_portal project. Then click run as and click Run On Server then select tomcat v10.1 server at local host then click on next then click on finish. Then the student_portal project is opened in the chrome. To login enter the username as raju and password as Raju@123. Then it will enters into the next web page.

Finally, student_portal project cloned successfully.
