package br.edu.facear.servled;

import java.io.IOException;

import javax.persistence.SynchronizationType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.facear.model.Cliente;
import br.edu.facear.service.AutentificarUsuarioService;

/**
 * Servlet implementation class AutentificarUsuarioServled
 */
@WebServlet("/AutentificarUsuarioServled")
public class AutentificarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AutentificarUsuarioServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Acesso não permitido!!");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		AutentificarUsuarioService service =new AutentificarUsuarioService();
		//obter do banco de dados
		Cliente c = service.autenticar(email, senha);
		
		//Colocarna area de memoria da sessaõ
		request.setAttribute("cliente", c);
		
		
		String nextPage = "/index.html";
		if(c != null){
			nextPage="/principal.jsp";
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
		rd.forward(request, response);
		System.out.println("Ola ,"+email);
		System.out.println("Senha = "+senha);
	}

}
