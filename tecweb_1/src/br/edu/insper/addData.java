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
		
		//ao invés de PrintWriter, deve-se redirecionar o usuário apra outro HTML
		//Para passar para outro HMTL, é necessário passar pelo doPost (servelet, isto é, a comunicação entre o HTML e o server) para pegar os dados
		//Printar as variáveis na nova pa´g
		// pesquisar em w3 java servelet connection html
		// codejava.net/java-ee/servlet/handling-html-form-data-with-java-servlet
		// como redirecionar para o novo HTML?
		
        out.println("<html>");
        out.println("<h1>Envio Concluído!</h1>");
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
