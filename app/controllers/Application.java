package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

public class Application extends Controller {

    public static void index() {
		String ip = request.remoteAddress;
    	renderText(ip);
    }
    
    public static void callback(String callback) {
    	String ip = request.remoteAddress;
    	String res = callback + "(" + ip + ");";
    	renderText(res);
    }

}
