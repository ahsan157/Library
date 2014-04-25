import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.io.PrintWriter;
 
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID;

@WebServlet(name = "download1", urlPatterns = {"/download1"})
public class download1 extends HttpServlet {
private static final int BUFFER_SIZE = 4096;  
   
     protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // reads input file from an absolute path
        String filePath = "D:/m/";
        //String filename=null;
        String filename=request.getParameter("id");
        
        
        
        //filename = filename.replace("_", " "); 
        filePath=filePath+filename;
        File downloadFile = new File(filePath);
        FileInputStream inStream = new FileInputStream(downloadFile);
         
        // if you want to use a relative path to context root:
        /*String relativePath = getServletContext().getRealPath("");
       System.out.println("relativePath = " + relativePath);*/
         
        // obtains ServletContext
       // ServletContext context = getServletContext();
         
        // gets MIME type of the file
       /* String mimeType = context.getMimeType(filePath);
        if (mimeType == null) {        
            // set to binary type if MIME mapping not found
            mimeType = "application/octet-stream";
        }
        System.out.println("MIME type: " + mimeType);
         
        // modifies response
        response.setContentType(mimeType);
        response.setContentLength((int) downloadFile.length());*/
         
        OutputStream outStream = response.getOutputStream(); 
         byte[] buffer = new byte[4096];
        int bytesRead = -1;
         
       
        // forces download
        String headerKey = "Content-Disposition";
        String headerValue = String.format("attachment; filename=\"%s\"", downloadFile.getName());
        response.setHeader(headerKey, headerValue);
         
        
        
        // obtains response's output stream or writes the file to the client
       
         
//        byte[] buffer = new byte[4096];
 bytesRead = -1;
         
        while ((bytesRead = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, bytesRead);
        }
         
        inStream.close();
        outStream.close();     
    }
    /*private String extractFileName(request part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("file")) {
                return s.substring(s.indexOf("=") + 2, s.length()-1);
            }
        }
        return "";
    }
}*/
}