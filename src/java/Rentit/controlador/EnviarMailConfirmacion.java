/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rentit.controlador;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author RicardoMarin
 */
public class EnviarMailConfirmacion extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public EnviarMailConfirmacion() {
        System.out.println("ENTRA");
        // TODO Auto-generated constructor stub
    }

    public String getCadenaAlfanumAleatoria(int longitud) {
        String cadenaAleatoria = "";
        long milis = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random(milis);
        int i = 0;
        while (i < longitud) {
            char c = (char) r.nextInt(255);
            //System.out.println("char:"+c);
            if ((c >= '0' && c <= 9) || (c >= 'A' && c <= 'Z')) {
                cadenaAleatoria += c;
                i++;
            }
        }
        return cadenaAleatoria;
    }

    @Override
    protected void service(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ENTRA2");
        String nombre = request.getParameter("ctrl_inputUser");
        String usuario = request.getParameter("ctrl_inputUser");
        String contra = request.getParameter("ctrl_inputPassword");
        String email = request.getParameter("ctrl_inputMail");
        String aleatoria = getCadenaAlfanumAleatoria(8);
        HttpSession session1 = request.getSession();

        session1.setAttribute("aleatoria", aleatoria);
        session1.setAttribute("usuario", usuario);

        //Se guarda en bd!
        try {
            // Propiedades de la conexión
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", "ricardomarinsun@gmail.com");
            props.setProperty("mail.smtp.auth", "true");

            // Preparamos la sesion 
            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("ricardomarinsun@gmail.com", "/123rmarin");
                }
            });

            // Construimos el mensaje
            MimeMessage message = new MimeMessage(session);
            // la persona que tiene que verificar
            message.setFrom(new InternetAddress("ricardomarinsun@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.addHeader("Disposition-Notification-To", "ricardomarinsun@gmail.com");
            message.setSubject("Correo de verificacion, porfavor no responder");
            message.setText(
                    " Este es un correo de verificacion \n"
                    + "Gracias por escribirse a Rent-It.com \n"
                    + "Porfavor haga click en el siguiente enlace\n"
                    + "para seguir con la verificacion de sus datos \n"
                    + "  <a href='http://localhost:8080/Rentalo/MailActivacionCuenta?usuario=" + usuario + "&aleatorio=" + aleatoria
                    + "'>Enlace</a>  ", "ISO-8859-1", "html");

            // Lo enviamos.
            System.out.println("URL:" + "http://localhost:8080/Rentalo/MailActivacionCuenta?usuario=" + usuario + "&aleatorio=" + aleatoria);
            Transport.send(message);
            //Transport t = session.getTransport("smtp");
            //t.connect("smtp.gmail.com", 587, "ricardomarinsun@gmail.com", "/123rmarin");
            //t.connect();
            //t.sendMessage(message, message.getAllRecipients());

            // Cierre.
            //t.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("Res", "Porfavor revise su corre\n " + "Señor:" + nombre);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("Home.jsp");
        rd.forward(request, response);

    }

}
