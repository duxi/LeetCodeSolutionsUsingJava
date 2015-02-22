package com.easy.problems;
import java.util.Stack;


public class ValidParentheses{
	
	  public boolean isValid(String s) {
	  	Stack st = new Stack();
	  	for(int i=0;i<s.length();i++){
	  		if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
	  			st.push(s.charAt(i));
	  		}else{
	  			if(st.isEmpty())return false;
	  			if(!isValidMatch(st.pop().toString().charAt(0),s.charAt(i))){
	  				return false;
	  			}
	  		}	
	  	}
	  	if(!st.isEmpty())return false;
	  	return true;
        
    }
	  //Judge if two chars are valid
	  public boolean isValidMatch(char a, char b){
		  //TODO:write a custom stack
		  if( a=='('&&b==')'){
			  return true;
		  }
		  
		  if( a=='['&&b==']'){
			  return true;
		  }
		  
		  if( a=='{'&&b=='}'){
			  return true;
		  }
		  return false;
		  
	  }
	
	
	
	
	
	}