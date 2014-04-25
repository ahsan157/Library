import java.io.*;
import javax.servlet.annotation.MultipartConfig;

 
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(name = "Download", urlPatterns = {"/Download"})
public class Download extends HttpServlet {
private static final int BUFFER_SIZE = 4096;  
   
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // reads input file from an absolute 
        PrintWriter out=response.getWriter();
        String value=request.getParameter("value");
        out.print(value);
        out.print("sms");
      String filePath = "D:/m/upload.pdf";
        File downloadFile = new File(filePath);
        FileInputStream inStream = new FileInputStream(downloadFile);
         
       
        
        
        // forces download
////        String headerKey = "Content-Disposition";
////        String headerValue = String.format("attachment; filename=\"%s\"", downloadFile.getName());
////        response.setHeader(headerKey, headerValue);
////         
        
        
        // obtains response's output stream or writes the file to the client
        OutputStream outStream = response.getOutputStream();
         
        byte[] buffer = new byte[4096];
        int bytesRead = -1;
         
        while ((bytesRead = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, bytesRead);
        }
         
        inStream.close();
        outStream.close();     
    }
    
    
}