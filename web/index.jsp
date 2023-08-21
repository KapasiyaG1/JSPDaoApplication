<!DOCTYPE html>
<%! 
  String user=null,pass=null;
  String msg=" ";
%>
%>
<html lang="en" class="no-js">
<%@page import="dao.EmployeeDAO" %> %>
<%@page session="true"%>
    
    <head>
       
        <title>Login and Registration</title>
        
        
        <link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/animate-custom.css" />
    </head>
    <body>
        <div class="container">
            <div class="codrops-top">
                
                <div class="clr"></div>
            </div><!--/ Codrops top bar -->
            
            <section>				
                <div id="container_demo" >
                   
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form  method="post" action="index.jsp" autocomplete="on"> 
                                <h1>Log in</h1> 
                                <p> 
                                    <label for="username" class="uname" data-icon="u" > Your email or username </label>
                                    <input id="username" name="username" required type="text" placeholder="myusername or mymail@mail.com"/>
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p"> Your password </label>
                                    <input id="password" name="password" required type="password" placeholder="eg. X8df!90EO" /> 
                                </p>
                                <p class="keeplogin"> 
									<input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" /> 
									<label for="loginkeeping">Keep me logged in</label>
                                                                         <% 
             
                                                                            user=request.getParameter("username");
                                                                            pass=request.getParameter("password");
             
                                                                            if(user!=null && pass!=null)
                                                                            {
                                                                                EmployeeDAO ed=new EmployeeDAO();
                                                                            if(ed.checkLogin(user, pass))
                                                                            {   
                                                                                 session.setAttribute("userid",user );
                                                                                 session.setAttribute("password", pass);
                                                                                response.sendRedirect("FrontPage.jsp");
                                                                            }   
                                                                            else
                                                                                msg="Invalid user id or password";
                                                                             }        
        
        %>
                                                                        
                                                                        
                                                                        <% 
                                                                         out.println("<br>");   
                                                                         out.println("<font color=red size=3>"+ msg + "</font>");
                                      
                                                                        %>  
								</p>
                                <p class="login button"> 
                                    <input type="submit" value="Login" /> 
								</p>
                                <p class="change_link">
									Not a member yet ?
									<a href="#toregister" class="to_register">Join us</a>
								</p>
                            </form>
                         
                        </div>

                        <div id="register" class="animate form">
                            <form  action="InsertLoginData" autocomplete="on"> 
                                <h1> Sign up </h1> 
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your username</label>
                                    <input id="usernamesignup" name="usernamesignup" required type="text" placeholder="mysuperusername690" />
                                </p>
                                <p> 
                                    <label for="emailsignup" class="youmail" data-icon="e" > Your email</label>
                                    <input id="emailsignup" name="emailsignup" required type="email" placeholder="mysupermail@mail.com"/> 
                                </p>
                                <p> 
                                    <label for="passwordsignup"  class="youpasswd" data-icon="p">Your password </label>
                                    <input id="passwordsignup" name="passwordsignup" required type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                                <p> 
                                    <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Please confirm your password </label>
                                    <input id="passwordsignup_confirm" name="passwordsignup_confirm" required type="password" placeholder="eg. X8df!90EO"/>
                                      
                                </p>
                                <p class="signin button"> 
									<input type="submit" value="Sign up"/> 
								</p>
                                                                
                                <p class="change_link">  
									Already a member ?
									<a href="#tologin" class="to_register"> Go and log in </a>
								</p>
                            </form>
                        </div>
						
                    </div>
                </div>  
            </section>
        </div>
       <center> 
        <font color="white" size="5"> 
       
       </font> 
       </center> 
    </body>
</html>