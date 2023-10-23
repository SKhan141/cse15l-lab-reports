import java.io.IOException;
import java.net.URI;


class Handler implements URLHandler {
    // The one bit of state on the server: a string that will be manipulated by
    // various requests.
    //int num = 0;
    String string = ""; //No Current strings
    int num = 0;

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("%s", string);
        }
        //   else if (url.getPath().equals("/increment")) {
        //     num += 1;
        //     return String.format("Number incremented!");
        // } 
        else if (url.getPath().equals("/clear")){
            num = 0;
            return string = "";
        }
        else {
            if (url.getPath().contains("/add-message")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    num++;
                    return string += String.format("%d. %s\n", num, parameters[1]);//num += Integer.parseInt(parameters[1]);
                    //return "String added!";
                    //return String.format("increased by %s! It's now %d", parameters[1], num);
                }
            }
            return "404 Not Found!";
        }
    }
}



class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
    
}
