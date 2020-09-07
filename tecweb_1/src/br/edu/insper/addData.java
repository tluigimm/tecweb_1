package br.edu.insper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addData
 */
@WebServlet("/addData")
public class addData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String curso = request.getParameter("curso");
		
		PrintWriter out = response.getWriter();
		
		//ao inv�s de PrintWriter, deve-se redirecionar o usu�rio apra outro HTML
		//Para passar para outro HMTL, � necess�rio passar pelo doPost (servelet, isto �, a comunica��o entre o HTML e o server) para pegar os dados
		//Printar as vari�veis na nova pa�g
		// pesquisar em w3 java servelet connection html
		// codejava.net/java-ee/servlet/handling-html-form-data-with-java-servlet
		// como redirecionar para o novo HTML?
		
        out.println("<html>");
        out.println("<h1>Envio Conclu�do!</h1>");
        out.println("<div>");
        out.println("<p><strong>nome:</strong></p>");
        out.println("<p>" + nome + "</p>");
        out.println("</div>");
        out.println("email: " + email + "<br/>");    
        out.println("curso: " + curso + "<br/>");    
        out.println("</html>");
        out.flush()
    }

}
