package br.edu.insper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
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
		
        out.println("<html>");
        out.println("<h1>Envio Concluído!</h1>");
        out.println("<div>");
        out.println("<p><strong>Nome:</strong></p>");
        out.println("<p>" + nome + "</p>");
        out.println("</div>");
        out.println("<div>");
        out.println("<p><strong>Email:</strong></p>");
        out.println("<p>" + email + "</p>");
        out.println("</div>");
        out.println("<div>");
        out.println("<p><strong>Curso:</strong></p>");
        out.println("<p>" + curso + "</p>");
        out.println("</div>");  
        out.println("<input type=\"submit\" name=\"Confirmar\" >");  
        out.println("</html>");
    }

}
